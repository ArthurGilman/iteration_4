package com.dragonco.iteration_4.practice;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;


@EqualsAndHashCode(exclude = "radius", callSuper = false)
@ToString(of = "radius")
public class Circle extends FlatShape implements Round {

    private final BigDecimal radius;

    public Circle(@NotNull BigDecimal radius, Integer scale) {
        super(ValidationUtils.validateNotPositive(radius).pow(2).multiply(ShapeUtils.PI),
                ValidationUtils.validateNotPositive(radius).multiply(ShapeUtils.PI).multiply(BigDecimal.TWO), scale);
        this.radius = radius;
    }

    @Override
    public BigDecimal getRadius() {
        return radius;
    }
}
