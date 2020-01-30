package com.company;

public class City {
    private int id;
    private String name;
    private String code;
    private int population;
    private int presidentId;

    public City() {
    }

    public City(String name, String code, int population, int presidentId) {
        this.name = name;
        this.code = code;
        this.population = population;
        this.presidentId = presidentId;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getPresidentId() {
        return presidentId;
    }

    public void setPresidentId(int presidentId) {
        this.presidentId = presidentId;
    }
}
