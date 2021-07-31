package com.oops;

public class Address {
    private String street;
    private String flatNo;
    private String dist;
    private String city;
    private int  pin;
    private String  State;
    private String  country;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", flatNo='" + flatNo + '\'' +
                ", dist='" + dist + '\'' +
                ", city='" + city + '\'' +
                ", pin=" + pin +
                ", State='" + State + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
