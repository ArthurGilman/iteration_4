package com.dragonco.iteration_4.practice;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;


@EqualsAndHashCode(exclude = {"base", "height", "side"}, callSuper = false)
@ToString(of = {"base", "height", "side"})
public class Parallelogram extends FlatShape {
    private final BigDecimal base; // Основание: __
    private final BigDecimal height; // Высота: |
    private final BigDecimal side; // Боковая грань: /

    public Parallelogram(@NotNull BigDecimal base, BigDecimal height, BigDecimal side, Integer scale) {
        super(ValidationUtils.validateNotPositive(base).multiply(ValidationUtils.validateNotPositive(height)),
                ValidationUtils.validateNotPositive(base).add(side).multiply(BigDecimal.TWO), scale);
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public BigDecimal getBase() {
        return base;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public BigDecimal getSide() {
        return side;
    }
}
