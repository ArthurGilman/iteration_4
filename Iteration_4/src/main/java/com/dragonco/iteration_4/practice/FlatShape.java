package com.dragonco.iteration_4.practice;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;


@Getter
public abstract class FlatShape extends Shape {
    private final BigDecimal perimeter;

    public FlatShape(@NotNull BigDecimal area,@NotNull BigDecimal perimeter,@NotNull Integer scale) {
        super(area, scale);
        this.perimeter = ValidationUtils.validateNotPositive(perimeter);
    }

}
