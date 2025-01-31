package com.workintech.cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {

        super(radius);
        this.setHeight(height);
    }

    public void setHeight(double height) {
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight() {
        return this.height;
    }
    public double getVolume() {
        return getArea() * height;
    }
}
