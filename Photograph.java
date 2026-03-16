package com.snytkov.lab2;

public class Photograph extends Artwork {
    private String photoType;
    private String format;

    public Photograph(int id, String title, String author, int year, String type, double width, double height,
                      String photoType, String format) {
        super(id, title, author, year, type, width, height);
        this.photoType = photoType;
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getPhotoType() {
        return photoType;
    }

    public void setPhotoType(String photoType) {
        this.photoType = photoType;
    }

    @Override
    public String toString() {
        return "Photograph{" +
                "format='" + format + '\'' +
                ", photoType='" + photoType + '\'' +
                '}';
    }
}
