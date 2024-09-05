package com.avaliacao_um;

import java.util.Arrays;

public class FireSpot {

    public enum Intensity {
        HIGH, MEDIUM, LOW
    }

    public enum Status {
        ACTIVE, CONTROLLED, EXTINCT
    }

    public enum Identification {
        HUMAN, SATELLITE, SENSOR
    }

    private String start; 
    private String end;
    private String cause;
    private Status status;
    private Identification identification;
    private Intensity intensity;
    private User createdBy;
    private ParkAddress park;
    private Image[] images;
    private Sensor sensor;

    public FireSpot(String start, String end, String cause, Status status, Identification identification,
            Intensity intensity, User leader, ParkAddress park, Image[] images, Sensor sensor) {
        this.start = start;
        this.end = end;
        this.cause = cause;
        this.status = status;
        this.identification = identification;
        this.intensity = intensity;
        this.createdBy = leader;
        this.park = park;
        this.images = images;
        this.sensor = sensor;
    }

    public FireSpot(String start2, String end2, String cause2, Status extinct, Identification satellite, Intensity low,
            Leader leader, ParkAddress parkAddress, Image[] images2, Object sensor2) {
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Identification getIdentification() {
        return identification;
    }

    public void setIdentification(Identification identification) {
        this.identification = identification;
    }

    public Intensity getIntensity() {
        return intensity;
    }

    public void setIntensity(Intensity intensity) {
        this.intensity = intensity;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public ParkAddress getPark() {
        return park;
    }

    public void setPark(ParkAddress park) {
        this.park = park;
    }

    public Image[] getImages() {
        return images;
    }

    public void setImages(Image[] images) {
        this.images = images;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    // Método toString para exibir as informações do foco de incêndio
    @Override
    public String toString() {
        return "FireSpot [start=" + start + ", end=" + end + ", cause=" + cause + ", status=" + status
                + ", identification=" + identification + ", intensity=" + intensity + ", createdBy=" + createdBy
                + ", park=" + park + ", images=" + Arrays.toString(images) + ", sensor=" + sensor + "]";
    }
}