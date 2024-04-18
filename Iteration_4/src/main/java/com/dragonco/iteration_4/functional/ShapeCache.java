package com.dragonco.iteration_4.functional;

import com.dragonco.iteration_4.practice.Shape;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ShapeCache {
    static Map<Long, Shape> cache = new HashMap<>();

    public static BigDecimal calculateTotalArea(long[] ids, Function<Long, Shape> fetchShape, long cacheTime) {
        BigDecimal totalArea = BigDecimal.valueOf(0);


        for (Long id : ids) {
            Shape shape = cache.get(id);

            if (shape == null || System.currentTimeMillis() - shape.getId() > cacheTime) {
                shape = fetchShape.apply(id);
                cache.put(id, shape);
            }

            BigDecimal scale = BigDecimal.valueOf(shape.getScale());
            totalArea = totalArea.add(shape.getArea().multiply(scale.multiply(scale)));
        }

        return totalArea;
    }
}
