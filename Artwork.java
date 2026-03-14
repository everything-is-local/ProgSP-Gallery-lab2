package com.snytkov.lab2;

public abstract class Artwork {
    private int id;
    private String title;
    private String author;
    private int year;
    private String type;
    private double width;
    private double height;

    public Artwork(int id, String title, String author, int year, String type,
                   double width, double height) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.type = type;
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
