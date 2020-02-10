package com.company;

public class Main {
    public static void main(String[] args) {
        DB database = new DB();
        City city1 = new City();
        city1.setId(3);
        city1.setName("Bishkek");
        database.addCity(city1);
    }
}
