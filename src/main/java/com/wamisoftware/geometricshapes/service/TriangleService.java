package com.wamisoftware.geometricshapes.service;

import com.wamisoftware.geometricshapes.domain.CalculationResult;
import com.wamisoftware.geometricshapes.domain.ShapeType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TriangleService implements ShapeService {

    @Override
    public CalculationResult calculate(List<Double> shapeDimensions) {
        double firstSide = shapeDimensions.get(0);
        double secondSide = shapeDimensions.get(1);
        double thirdSide = shapeDimensions.get(2);
        return new CalculationResult(calculateArea(firstSide, secondSide, thirdSide),
                calculatePerimeter(firstSide, secondSide, thirdSide));
    }

    @Override
    public ShapeType getShapeType() {
        return ShapeType.TRIANGLE;
    }

    public double calculateArea(double firstSide, double secondSide, double thirdSide) {
        double halfPerimeter = halfPerimeter(firstSide, secondSide, thirdSide);
        return Math.sqrt(halfPerimeter
                * (halfPerimeter - firstSide)
                * (halfPerimeter - secondSide)
                * (halfPerimeter - thirdSide));
    }

    public double calculatePerimeter(double firstSide, double secondSide, double thirdSide) {
        return firstSide + secondSide + thirdSide;
    }

    private double halfPerimeter(double firstSide, double secondSide, double thirdSide) {
        return calculatePerimeter(firstSide, secondSide, thirdSide) / 2;
    }
}
