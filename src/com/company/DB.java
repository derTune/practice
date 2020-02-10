package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DB {
    private final static String url = "jdbc:postgresql://localhost:5432/";
    private final static String user = "postgres";
    private final static String password = "1234";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return conn;
    }

    public List<Trainer> getTrainers() {
        List<Trainer> trainers = new ArrayList<>();
        String SQL = "select concat(t.name, ' ' ,t.surname) as trainers, t.salary from trainers t";
        try (Connection conn = DB.connect();
             Statement statement = conn.createStatement()) {
            try (ResultSet rs = statement.executeQuery(SQL)) {
                while (rs.next()) {
                    Trainer t = new Trainer();
                    t.setFullname(rs.getString("trainers"));
                    t.setSalary(rs.getInt("salary"));
                    trainers.add(t);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return trainers;
    }

    public int getOverallSalary() {
        int sum = 0;
        String SQL = "select SUM(salary) as Overall_Sum from trainers";
        try (Connection conn = DB.connect();
             Statement statement = conn.createStatement()) {
            try (ResultSet rs = statement.executeQuery(SQL)) {
                if (rs.next()) {
                    sum = rs.getInt("overall_sum");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sum;
    }

    public List<String> getSurnames() {
        List<String> listOfSurnames = new ArrayList<>();
        String SQL = "select surname from trainers";
        try (Connection conn = DB.connect();
             Statement statement = conn.createStatement()) {
            try (ResultSet rs = statement.executeQuery(SQL)) {
                while (rs.next()) {
                    String surname = null;
                    if (rs.getString("surname").length() > 3) {
                        surname = rs.getString("surname") + " МОЛОДЕЦ!";
                    }
                    listOfSurnames.add(surname);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listOfSurnames;
    }

    public int getCountOfTrainers() {
        int count = 0;
        String SQL = "select COUNT(*) from students";
        try (Connection conn = DB.connect();
             Statement statement = conn.createStatement()) {
            try (ResultSet rs = statement.executeQuery(SQL)) {
                if (rs.next()) {
                    count = rs.getInt("count");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<Group> getGroups() {
        List<Group> listOfGroups = new ArrayList<>();
        String SQL = "select group_id, name from groups";
        try (Connection conn = DB.connect();
             Statement statement = conn.createStatement()) {
            try (ResultSet rs = statement.executeQuery(SQL)) {
                while (rs.next()) {
                    Group g = new Group();
                    g.setId(rs.getInt("group_id"));
                    g.setName(rs.getString("name"));
                    listOfGroups.add(g);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listOfGroups;
    }

    public List<City> getCities(String country, String c) {
        String SQL = "select ct.name as city_name, cn.name as country_name " +
                "from cities ct " +
                "join countries cn on ct.country_id = cn.id " +
                "where ct.name like ?";
        List<City> listOfCountries = new ArrayList<>();
        try (Connection conn = DB.connect();
             PreparedStatement statement = conn.prepareStatement(SQL)) {
            statement.setString(1, c);
            try (ResultSet rs = statement.executeQuery()) {
                while (rs.next()) {
                    if (rs.getString("country_name").equals(country)) {
                        City ct = new City();
                        ct.setName(rs.getString("city_name"));
                        listOfCountries.add(ct);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listOfCountries;
    }

    public int getCitiesPopulation(int countryId) {
        int sum = 0;
        String SQL = "select SUM(population) as overall_population from cities\n" +
                "where country_id = ?";
        try (Connection conn = DB.connect();
             PreparedStatement statement = conn.prepareStatement(SQL)) {
            statement.setInt(1, countryId);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    sum = rs.getInt("overall_population");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sum;
    }

    public double getAverageMark(int student_id) {
        double average = 0;
        String SQL = "select avg(mark) as average_mark from marks\n" +
                "where marks.student_id = ?";
        try (Connection conn = DB.connect();
             PreparedStatement statement = conn.prepareStatement(SQL)) {
            statement.setInt(1, student_id);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    average = rs.getDouble("average_mark");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return average;
    }

    public Student getStudent(int id) {
        Student s = new Student();
        String SQL = "select students1.fullname, groups1.code as group, faculties1.name as faculty, universities1.name as university \n" +
                "from students1\n" +
                "join groups1 on students1.group_id = groups1.id \n" +
                "join faculties1 on groups1.faculty_id = faculties1.id \n" +
                "join universities1 on faculties1.university_id = universities1.id ";
        try (Connection conn = DB.connect();
             Statement statement = conn.createStatement()) {
            try (ResultSet rs = statement.executeQuery(SQL)) {
                if (rs.next()) {
                    s.setFullname(rs.getString("fullname"));
                    s.setFaculty(rs.getString("faculty"));
                    s.setGroup(rs.getString("group"));
                    s.setUniversity(rs.getString("university"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return s;
    }

    public boolean addCity(City city) {
        String SQL = "insert into cities1(id, name) values(?, ?)";
        try (Connection conn = DB.connect();
             PreparedStatement statement = conn.prepareStatement(SQL)) {
                     statement.setInt(1, city.getId());
                     statement.setString(2, city.getName());
                     System.out.println("Added one city");
                     statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
