package com.avaliacao_um;

public class Sensor {

    public enum SensorStatus {
        OPERATIONAL, DEAD
    }

    private Double latitude;
    private Double longitude;
    private SensorStatus status;
    private String name;

    public Sensor(Double latitude, Double longitude, SensorStatus status, String name) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.status = status;
        this.name = name;
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

    public SensorStatus getStatus() {
        return status;
    }

    public void setStatus(SensorStatus status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sensor [latitude=" + latitude + ", longitude=" + longitude + ", status=" + status + ", name=" + name
                + "]";
    }

}
