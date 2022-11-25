package com.example.varosok;


public class Varos {
    private int id;
    private String name;
    private String country;
    private int population;

    public Varos(int id, String name, String country, int population) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.population = population;
    }

    public Varos(String name, String country, int population) {
        this.name = name;
        this.country = country;
        this.population = population;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getPopulation() {
        return population;
    }

    public String getPopulationText() {
        return String.valueOf(population);
    }
    public void setPopulationText(String population) {
        if (population.isEmpty()) {
            this.population = 0;
        } else {
            this.population = Integer.parseInt(population);
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}