package com.snytkov.lab2;

public class Painting extends Artwork {
    private String printType;
    private String style;

    public Painting(int id, String title, String author, int year, String type, double width, double height, String printType, String style) {
        super(id, title, author, year, type, width, height);
        this.printType = printType;
        this.style = style;
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}


