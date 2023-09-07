package com.wamisoftware.geometricshapes.service;

import com.wamisoftware.geometricshapes.domain.CalculationResult;
import com.wamisoftware.geometricshapes.domain.ShapeType;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CircleService implements ShapeService {

    @Override
    public CalculationResult calculate(List<Double> shapeDimensions) {
        double radius = shapeDimensions.get(0);
        return new CalculationResult(calculateArea(radius), calculatePerimeter(radius));
    }

    @Override
    public ShapeType getShapeType() {
        return ShapeType.CIRCLE;
    }

    private double calculateArea(double radius) {
        return radius * radius * Math.PI;
    }

    private double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}
