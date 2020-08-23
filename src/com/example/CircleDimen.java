package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CircleDimen {
    private Point center;
    private int radius;

    public Point getCenter() {
        return center;
    }

    /*
    @Resource(name="pointA") or @Resource(if bean with name center exists)
    */
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

    // @PostConstruct
    public void init() {
        // to automatically call after initialization
    }

    // @PreDestroy
    public void destroy() {
        // to automatically call before destruction
    }
}
