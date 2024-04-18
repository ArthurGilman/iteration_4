package com.dragonco.iteration_4.functional;

import com.dragonco.iteration_4.practice.Shape;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class ShapeCache {
    static Map<Shape, LocalDateTime> cache = new HashMap<>();

    public static BigDecimal updateShapeCache(Map<Shape, LocalDateTime> shapes, Function<Long, Optional<Shape>> fetchShape) {
        BigDecimal totalArea = BigDecimal.valueOf(0);
        for (Map.Entry<Shape, LocalDateTime> entry : shapes.entrySet()) {
            Shape shape = entry.getKey();
            LocalDateTime cacheTime = cache.get(shape);

            if (cacheTime == null || cacheTime.plusHours(24).isBefore(LocalDateTime.now()) ) {
                shape = fetchShape.apply(entry.getKey().getId()).get();
                cache.put(shape, LocalDateTime.now());
            }

            BigDecimal scale = BigDecimal.valueOf(shape.getScale());
            totalArea = totalArea.add(shape.getArea().multiply(scale.multiply(scale)));
        }

        return totalArea;
    }
}
