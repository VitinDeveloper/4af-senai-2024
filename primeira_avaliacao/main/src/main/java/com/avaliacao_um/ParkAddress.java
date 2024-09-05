package com.avaliacao_um;

public class ParkAddress {
    private String city;
    private String state;
    private String country;
    private String parkName;
    private Double latitude;
    private Double longitude;

    public ParkAddress(String city, String state, String country, String parkName, Double latitude, Double longitude) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.parkName = parkName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "ParkAddress [city=" + city + ", state=" + state + ", country=" + country + ", parkName=" + parkName
                + ", latitude=" + latitude + ", longitude=" + longitude + "]";
    }
}