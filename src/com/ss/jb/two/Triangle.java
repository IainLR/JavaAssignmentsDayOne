package com.ss.jb.two;

public class Triangle implements Shape{

    int height;
    int base;
    double area;

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
