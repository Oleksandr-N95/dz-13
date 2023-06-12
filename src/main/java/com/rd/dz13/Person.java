package com.rd.dz13;

public class Person {

    private String name;
    private String sureName;
    private String country;
    private String city;

    public Person(String name, String sureName, String country, String city){
        this.name = name;
        this.sureName = sureName;
        this.country = country;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean nameLength(){
        return name.length() >= 10;
    }

    public void changeCountry(Person person){
        if (country != null){
            person.setCountry("Another");
        }
    }
}
