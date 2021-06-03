package com.ss.jb.two;

public class Rectangle implements Shape{
    int length;
    int width;
    double area;

    public Rectangle(int height, int width) {
        this.length = height;
        this.width = width;
        this.area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return this.length * this.width;
    }

    @Override
    public void display() {
        System.out.println("The length of our rectangle is: " + this.length);
        System.out.println("The width of our rectangle is: " + this.width);
        System.out.println("The area of our rectangle is: " + this.area);
        System.out.println();
    }
}
