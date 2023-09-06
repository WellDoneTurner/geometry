package com.geometry.persistence;

import java.util.List;

public abstract class Shape {
    public abstract Integer shapeArgsCount();
    public abstract Shape buildShape(List<Double> doubleList);
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
