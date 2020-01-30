package com.company;

public class Main {
    public static void main(String[] args) {
        DB database = new DB();
        System.out.println(database.getTrainers());
        System.out.println("Overall sum of salaries = " + database.getOverallSalary());
        System.out.println(database.getSurnames());
        System.out.println(database.getCountOfTrainers() + " trainers");
        System.out.println(database.getGroups());
        String c = "B";
        System.out.println(database.getCities("Kyrgyzstan", c));
        System.out.println(database.getCitiesPopulation(1) + " people");
        System.out.println(database.getAverageMark(1));
        System.out.println(database.getStudent(2));
    }
}
