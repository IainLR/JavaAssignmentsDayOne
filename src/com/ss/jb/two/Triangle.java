package com.ss.jb.two;

public class Triangle implements Shape{

    private int height;
    private int base;
    private double area;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }


    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
        this.area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return .5 * (this.height * this.base);
    }

    @Override
    public void display() {
        System.out.println("The area of our Triangle is: " + this.area);
        System.out.println("The height of our Triangle is: " + this.height);
        System.out.println("The base of our Triangle is: " + this.base);
        System.out.println();
    }
}
