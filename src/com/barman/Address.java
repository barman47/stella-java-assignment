package com.barman;

public class Address {
    private int NUMBER;
    private String STREET_NAME;
    private int POSTAL_CODE;
    private String CITY;

    public Address() {
    }

    public Address(int number, String streetName, int postalCode, String city) {
        this.NUMBER = number;
        this.STREET_NAME = streetName;
        this.POSTAL_CODE = postalCode;
        this.CITY = city;
    }

    public void display () {
        System.out.printf("Number: %d\nStreet Name: %s\nPostal Code: %d\nCity: %s\n", this.getNumber(), this.getStreetName(),this.getPostalCode(), this.getCity());
        System.out.println("====================================================");
    }

    public int getNumber() {
        return NUMBER;
    }

    public String getStreetName() {
        return STREET_NAME;
    }

    public int getPostalCode() {
        return POSTAL_CODE;
    }

    public String getCity() {
        return CITY;
    }

    public void setNumber(int number) {
        this.NUMBER = number;
    }

    public void setStreetName(String streetName) {
        this.STREET_NAME = streetName;
    }

    public void setPostalCode(int postalCode) {
        this.POSTAL_CODE = postalCode;
    }

    public void setCity(String city) {
        this.CITY = city;
    }
}
