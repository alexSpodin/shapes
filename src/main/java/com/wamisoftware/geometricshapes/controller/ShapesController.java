package com.wamisoftware.geometricshapes.controller;

import com.wamisoftware.geometricshapes.domain.CalculationResult;
import com.wamisoftware.geometricshapes.domain.ShapeType;
import com.wamisoftware.geometricshapes.service.ShapeService;
import com.wamisoftware.geometricshapes.validator.ShapeValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/shape")
public class ShapesController {

    private final Map<ShapeType, ShapeService> shapeServicesMap;
    private final Map<ShapeType, ShapeValidator> shapeValidatorsMap;

    @Autowired
    public ShapesController(List<ShapeService> shapeServices, List<ShapeValidator> shapeValidators) {
        shapeServicesMap = shapeServices.stream()
                .collect(Collectors.toMap(ShapeService::getShapeType, Function.identity()));

        shapeValidatorsMap = shapeValidators.stream()
                .collect(Collectors.toMap(ShapeValidator::getShapeType, Function.identity()));
    }

    @GetMapping("/{TYPE}/calculate")
    public CalculationResult calculate(@PathVariable("TYPE") ShapeType shapeType,
                                       @RequestParam List<Double> dimension) {
        shapeValidatorsMap.get(shapeType).validate(dimension);
        return shapeServicesMap.get(shapeType).calculate(dimension);
    }
}
