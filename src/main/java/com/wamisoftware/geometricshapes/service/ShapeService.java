package com.wamisoftware.geometricshapes.service;

import com.wamisoftware.geometricshapes.domain.CalculationResult;
import com.wamisoftware.geometricshapes.domain.ShapeType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ShapeService {

    CalculationResult calculate(List<Double> shapeDimensions);
    ShapeType getShapeType();
}
