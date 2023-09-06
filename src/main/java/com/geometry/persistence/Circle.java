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
public class Circle extends Shape {

    private double radius;

    @Override
    public Integer shapeArgsCount() {
        return 1;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public Shape buildShape(List<Double> doubleList) {
        return new Circle(doubleList.get(0));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "area=" + getArea() +
                "perimeter=" + getPerimeter() +
                '}';
    }
}
