package com.company;

public class Trainer {
    private int id;
    private String fullname;
    private int salary;

    public Trainer() {
    }

    public Trainer(String fullname, int salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "fullname='" + fullname + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
