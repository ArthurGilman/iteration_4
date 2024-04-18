package com.dragonco.iteration_4.functional;

import com.dragonco.iteration_4.practice.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Database {

    static Map<Long, FlatShape> flatShape = new HashMap<>();
    static Map<Long, VolumetricShape> volumetricShape = new HashMap<>();



    static Optional<Shape> findFlatShapeById(long id) {
        return Optional.ofNullable(flatShape.get(id));
    }

    static Optional<Shape> findVolumetricShapeById(long id) {
        return Optional.ofNullable(volumetricShape.get(id));
    }
}
