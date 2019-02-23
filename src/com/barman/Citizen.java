package com.barman;

public class Citizen {
    private String NAME;
    private String SURNAME;
    private Address ADDRESS;

    public Citizen() {
    }

    public Citizen(String name, String surname, Address address) {
        this.NAME = name;
        this.SURNAME = surname;
        this.ADDRESS = address;
    }

    public void display () {
        System.out.printf("%s %s's address is\n", this.NAME, this.SURNAME);
        this.ADDRESS.display();
    }
}
