package com.geometry.configuration;

import com.geometry.persistence.Shape;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Configuration
@ComponentScan
public class ShapeBuilderMapConfiguration {

    @Bean
    public Map<Integer, Shape> shapeMap(@Lazy List<Shape> shapeMap) {
        return shapeMap.stream().collect(Collectors.toMap(Shape::shapeArgsCount, Function.identity()));
    }
}
