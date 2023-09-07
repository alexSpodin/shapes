package com.wamisoftware.geometricshapes.validator;

import com.wamisoftware.geometricshapes.domain.ShapeType;
import org.springframework.stereotype.Service;

import javax.validation.ValidationException;
import java.util.List;

import static com.wamisoftware.geometricshapes.validator.ErrorMessage.CIRCLE_DIMENSIONS_SIZE_ERROR;
import static com.wamisoftware.geometricshapes.validator.ErrorMessage.CIRCLE_INVALID_DIMENSION_ERROR;

@Service
public class CircleValidator implements ShapeValidator {
    @Override
    public void validate(List<Double> shapeDimensions) {
        if (shapeDimensions.size() != 1) {
            throw new ValidationException(String.format(CIRCLE_DIMENSIONS_SIZE_ERROR, shapeDimensions.size()));
        }
        double radius = shapeDimensions.get(0);
        if (radius < 0) {
            throw new ValidationException(String.format(CIRCLE_INVALID_DIMENSION_ERROR, radius));
        }
    }

    @Override
    public ShapeType getShapeType() {
        return ShapeType.CIRCLE;
    }
}
