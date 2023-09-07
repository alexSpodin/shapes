package com.wamisoftware.geometricshapes.service;

import com.wamisoftware.geometricshapes.domain.CalculationResult;
import com.wamisoftware.geometricshapes.domain.ShapeType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SquareService implements ShapeService {
    @Override
    public CalculationResult calculate(List<Double> shapeDimensions) {
        double side = shapeDimensions.get(0);
        return new CalculationResult(calculateArea(side), calculatePerimeter(side));
    }

    @Override
    public ShapeType getShapeType() {
        return ShapeType.SQUARE;
    }

    public double calculateArea(double side) {
        return side * side;
    }

    public double calculatePerimeter(double side) {
        return side * 4;
    }
}
