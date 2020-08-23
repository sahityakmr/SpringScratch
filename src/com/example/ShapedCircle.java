package com.example;

import org.springframework.beans.factory.annotation.Required;

public class ShapedCircle implements Shape {
    private Point center;

    public Point getCenter() {
        return center;
    }

    @SuppressWarnings("deprecation")
    @Required
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Drawing ShapedCircle with center : " + center);
    }
}
