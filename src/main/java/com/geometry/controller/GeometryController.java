package com.geometry.controller;

import com.geometry.service.GeometryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class GeometryController {

    private final GeometryService geometryService;

    @GetMapping("/calculate")
    public ResponseEntity<String> calculate(@RequestBody List<Double> input) {
        return new ResponseEntity<>(
                geometryService.calculate(input),
                HttpStatus.OK
        );
    }
}
