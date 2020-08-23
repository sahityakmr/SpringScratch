package com.example;

public class ShapedCircle implements Shape{
    private Point center;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Drawing ShapedCircle with center : " + center);
    }
}
