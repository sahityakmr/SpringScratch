package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ComplexTriangle {
    private List<Point> points;
    private Map<String, String> types;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public Map<String, String> getTypes() {
        return types;
    }

    public void setTypes(Map<String, String> types) {
        this.types = types;
    }

    public void draw() {
        System.out.println("Drawing Triangle with points " + Arrays.toString(points.toArray()));
        for(Map.Entry<String, String> entry : types.entrySet()){
            System.out.printf("Key : %s, Value : %s", entry.getKey(), entry.getValue());
        }
    }
}
