package com.wamisoftware.geometricshapes.validator;

import com.wamisoftware.geometricshapes.domain.ShapeType;
import org.springframework.stereotype.Service;

import javax.validation.ValidationException;
import java.util.List;

import static com.wamisoftware.geometricshapes.validator.ErrorMessage.SQUARE_DIMENSIONS_SIZE_ERROR;
import static com.wamisoftware.geometricshapes.validator.ErrorMessage.SQUARE_INVALID_DIMENSION_ERROR;

@Service
public class SquareValidator implements ShapeValidator {
    @Override
    public void validate(List<Double> shapeDimensions) {
        if (shapeDimensions.size() != 1) {
            throw new ValidationException(String.format(SQUARE_DIMENSIONS_SIZE_ERROR, shapeDimensions.size()));
        }
        double side = shapeDimensions.get(0);
        if (side < 0) {
            throw new ValidationException(String.format(SQUARE_INVALID_DIMENSION_ERROR, side));
        }
    }

    @Override
    public ShapeType getShapeType() {
        return ShapeType.SQUARE;
    }
}
