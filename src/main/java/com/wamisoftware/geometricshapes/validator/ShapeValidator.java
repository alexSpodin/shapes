package com.wamisoftware.geometricshapes.validator;

import com.wamisoftware.geometricshapes.domain.ShapeType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ShapeValidator {

    void validate(List<Double> shapeDimensions);

    ShapeType getShapeType();
}
