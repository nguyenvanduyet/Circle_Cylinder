package Cylinder;

import Circle.Circle;

public class Cylinder extends Circle {
    private double height=10;

    public Cylinder() {
    }

    public Cylinder(double radius, String color) {
        super(radius, color);
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getAreaC(){
        return getPerimeter()*height;
    }
    public double getAreaS(){
        return getAreaC()+2*getArea();
    }
    public double getThetich(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height + "diện tích xung quanh:"+getAreaC()+
                "diện tích toàn phần:"+getAreaS()+"thể tích:"+getThetich()+
                '}';
    }
}
