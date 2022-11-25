package com.example.varosok;

public class varos {
    private int id;
    private String name;
    private String country;
    private int peoples;

    public varos(int id, String name, String country, int peoples) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.peoples = peoples;
    }

    public varos(String name, String country, int peoples) {
        this.name = name;
        this.country = country;
        this.peoples = peoples;
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

    public int getPeoples() {
        return peoples;
    }

    public String getPeoplesText() {
        return String.valueOf(peoples);
    }
    public void setPeoplesText(String peoples) {
        if (peoples.isEmpty()) {
            this.peoples = 0;
        } else {
            this.peoples = Integer.parseInt(peoples);
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

    public void setPeoples(int peoples) {
        this.peoples = peoples;
    }
}