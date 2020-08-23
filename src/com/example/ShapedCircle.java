package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class ShapedCircle implements Shape {
    private CircleDimen circleDimen;

    public CircleDimen getCircleDimen() {
        return circleDimen;
    }

    /*
    @SuppressWarnings("deprecation")
    @Required
    */
    /*
    Will work when only one bean of Point is present
    @Autowired
    */
    @Autowired
    public void setCircleDimen(CircleDimen circleDimen) {
        this.circleDimen = circleDimen;
    }

    @Override
    public void draw() {
        System.out.println("Drawing ShapedCircle with dimens : " + circleDimen);
    }
}
