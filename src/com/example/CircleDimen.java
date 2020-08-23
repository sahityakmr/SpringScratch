package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CircleDimen {
    private Point center;
    private int radius;

    public Point getCenter() {
        return center;
    }

    @Autowired
    @Qualifier("circleCenter")
    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "CircleDimen{" +
                "point=" + center +
                ", radius=" + radius +
                '}';
    }
}
