package com.geometry.service;

import com.geometry.persistence.Shape;
import com.geometry.util.Validator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class GeometryServiceImpl implements GeometryService {

    private final Map<Integer, Shape> shapeMap;

    @Override
    public String calculate(List<Double> input) {
        final int size = input.size();
        Validator.validateInput(size);
        return shapeMap.get(size).buildShape(input).toString();
    }
}
