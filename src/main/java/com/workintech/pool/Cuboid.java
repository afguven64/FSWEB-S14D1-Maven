package com.workintech.pool;

public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.setHeight(height);
    }

    public void setHeight(double height) {
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return getArea() * height;
    }
}
