package com.wamisoftware.geometricshapes.validator;

import com.wamisoftware.geometricshapes.domain.ShapeType;
import org.springframework.stereotype.Service;

import javax.validation.ValidationException;
import java.util.List;

import static com.wamisoftware.geometricshapes.validator.ErrorMessage.RECTANGLE_DIMENSIONS_SIZE_ERROR;
import static com.wamisoftware.geometricshapes.validator.ErrorMessage.RECTANGLE_INVALID_DIMENSION_ERROR;

@Service
public class RectangleValidator implements ShapeValidator {
    @Override
    public void validate(List<Double> shapeDimensions) {
        if (shapeDimensions.size() != 2) {
            throw new ValidationException(String.format(RECTANGLE_DIMENSIONS_SIZE_ERROR, shapeDimensions.size()));
        }
        double width = shapeDimensions.get(0);
        double height = shapeDimensions.get(1);
        if (width < 0 || height < 0) {
            throw new ValidationException(String.format(RECTANGLE_INVALID_DIMENSION_ERROR, width, height));
        }
    }

    @Override
    public ShapeType getShapeType() {
        return ShapeType.RECTANGLE;
    }
}
