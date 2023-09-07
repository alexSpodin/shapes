package com.wamisoftware.geometricshapes.service;

import com.wamisoftware.geometricshapes.domain.CalculationResult;
import com.wamisoftware.geometricshapes.domain.ShapeType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RectangleService implements ShapeService{

    @Override
    public CalculationResult calculate(List<Double> shapeDimensions) {
        double width = shapeDimensions.get(0);
        double height = shapeDimensions.get(1);
        return new CalculationResult(calculateArea(width, height), calculatePerimeter(width, height));
    }

    @Override
    public ShapeType getShapeType() {
        return ShapeType.RECTANGLE;
    }

    private double calculateArea(double width, double height) {
        return height * width;
    }

    private double calculatePerimeter(double width, double height) {
        return (height + width) * 2;
    }

}
