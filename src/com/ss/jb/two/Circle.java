package com.ss.jb.two;

public class Circle implements Shape{

    int radius;
    double area;
    double circumference;

    public Circle(int radius) {
        this.radius = radius;
        this.area = calculateArea(this.radius);
        this.circumference = Math.PI * (2 * this.radius);
    }


    @Override
    public double calculateArea(int radius) {
        return Math.PI * (radius * radius);
    }

    @Override
    public void display() {
        System.out.println("radius of Circle= " + this.radius);
        System.out.println("area of Circle = " + this.area);
        System.out.println("Circumference of Circle = " + this.circumference);
    }
}
