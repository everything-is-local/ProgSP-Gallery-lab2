package com.snytkov.lab2;

public class Sculpture extends Artwork {
    private String material;
    private double weight;
    private double depth;

    public Sculpture(int id, String title, String author, int year, String type, double width, double height,
                     String material, double weight, double depth) {
        super(id, title, author, year, type, width, height);
        this.material = material;
        this.weight = weight;
        this.depth = depth;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
