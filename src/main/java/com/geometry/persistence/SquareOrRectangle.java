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
public class SquareOrRectangle extends Shape {

    private double length;
    private double width;

    @Override
    public Integer shapeArgsCount() {
        return 2;
    }

    @Override
    public Shape buildShape(List<Double> doubleList) {
        return new SquareOrRectangle(
                doubleList.get(0),
                doubleList.get(1)
        );
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        String shapeName = width == length ? "Square" : "Rectangle";
        return shapeName + "{" +
                "area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}
