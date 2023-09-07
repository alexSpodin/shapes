package com.wamisoftware.geometricshapes.validator;

import com.wamisoftware.geometricshapes.domain.ShapeType;
import org.springframework.stereotype.Service;

import javax.validation.ValidationException;
import java.util.List;

import static com.wamisoftware.geometricshapes.validator.ErrorMessage.TRIANGLE_DIMENSIONS_SIZE_ERROR;
import static com.wamisoftware.geometricshapes.validator.ErrorMessage.TRIANGLE_INVALID_DIMENSION_ERROR;

@Service
public class TriangleValidator implements ShapeValidator {
    @Override
    public void validate(List<Double> shapeDimensions) {
        if (shapeDimensions.size() != 3) {
            throw new ValidationException(String.format(TRIANGLE_DIMENSIONS_SIZE_ERROR, shapeDimensions.size()));
        }
        shapeDimensions.forEach(dimension -> {
            if (dimension < 0) {
                throw new ValidationException(String.format(TRIANGLE_INVALID_DIMENSION_ERROR, dimension));
            }
        });
    }

    @Override
    public ShapeType getShapeType() {
        return ShapeType.TRIANGLE;
    }
}
