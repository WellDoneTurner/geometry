package com.geometry.persistence;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;

    @Override
    public Integer shapeArgsCount() {
        return 3;
    }

    @Override
    public Shape buildShape(List<Double> doubleList) {
        return new Triangle(
                doubleList.get(0),
                doubleList.get(1),
                doubleList.get(2)
        );
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}
