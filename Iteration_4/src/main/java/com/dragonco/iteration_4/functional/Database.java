package com.dragonco.iteration_4.functional;

import com.dragonco.iteration_4.practice.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Database {

    static Map<Long, FlatShape> flatShape = new HashMap<>();
    static Map<Long, VolumetricShape> volumetricShape = new HashMap<>();


    static {
        flatShape.put(1L, new Circle(BigDecimal.TEN, 1));
        flatShape.put(2L, new Square(BigDecimal.TEN, 2));
        volumetricShape.put(1L, new Cube(BigDecimal.TEN,BigDecimal.TWO, 3));
        volumetricShape.put(2L, new Sphere(BigDecimal.TWO, BigDecimal.ONE, 2));
    }

    static Optional<Shape> findFlatShapeById(long id) {
        return Optional.ofNullable(flatShape.get(id));
    }

    static Optional<Shape> findVolumetricShapeById(long id) {
        return Optional.ofNullable(volumetricShape.get(id));
    }
}
