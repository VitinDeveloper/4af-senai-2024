package com.avaliacao_um;

public class Image {
    private String filename;
    private String date;
    private String satelliteName;

    public Image(String filename, String date, String satelliteName) {
        this.filename = filename;
        this.date = date;
        this.satelliteName = satelliteName;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSatelliteName() {
        return satelliteName;
    }

    public void setSatelliteName(String satelliteName) {
        this.satelliteName = satelliteName;
    }

    @Override
    public String toString() {
        return "Image [filename=" + filename + ", date=" + date + ", satelliteName=" + satelliteName + "]";
    }
}