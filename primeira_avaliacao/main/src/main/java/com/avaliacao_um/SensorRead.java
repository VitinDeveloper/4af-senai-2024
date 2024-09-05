package com.avaliacao_um;

import java.time.LocalDateTime;

public class SensorRead {
    private Float value;
    private LocalDateTime date;
    private Sensor sensor;

    public SensorRead(Float value, LocalDateTime date, Sensor sensor) {
        this.value = value;
        this.date = date;
        this.sensor = sensor;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public String toString() {
        return "SensorRead [value=" + value + ", date=" + date + ", sensor=" + sensor + "]";
    }

}
