package com.wamisoftware.geometricshapes.validator;

public class ErrorMessage {
    private ErrorMessage() {
    }

    public static final String CIRCLE_DIMENSIONS_SIZE_ERROR = "Circle must have exactly one dimension but found %s";
    public static final String RECTANGLE_DIMENSIONS_SIZE_ERROR = "Rectangle must have exactly two dimensions but found %s";
    public static final String SQUARE_DIMENSIONS_SIZE_ERROR = "Square must have exactly one dimension but found %s";
    public static final String TRIANGLE_DIMENSIONS_SIZE_ERROR = "Triangle must have exactly three dimensions but found %s";
    public static final String CIRCLE_INVALID_DIMENSION_ERROR = "Circle must have positive radius but found %s";
    public static final String RECTANGLE_INVALID_DIMENSION_ERROR = "Rectangle must have positive width and height but found %s, %s";
    public static final String SQUARE_INVALID_DIMENSION_ERROR = "Square must have positive side but found %s";
    public static final String TRIANGLE_INVALID_DIMENSION_ERROR = "Triangle must have positive side but found %s";
}
