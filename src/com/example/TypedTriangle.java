package com.example;

public class TypedTriangle {
    private String type;
    private int height;

    public TypedTriangle() {
    }

    public TypedTriangle(String type) {
        this.type = type;
    }

    public TypedTriangle(int height) {
        this.height = height;
    }

    public TypedTriangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void draw() {
        System.out.printf("Drawing %s Triangle with height %d%n", type, height);
    }
}
