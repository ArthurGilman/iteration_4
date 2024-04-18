package com.dragonco.iteration_4.practice;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

@Getter
@EqualsAndHashCode(exclude = {"volume", "weight"}, callSuper = false)
@ToString(of = {"volume", "weight"})
public abstract class VolumetricShape extends Shape {
    private final BigDecimal volume;
    private final BigDecimal weight;

    public VolumetricShape(@NotNull BigDecimal area,@NotNull BigDecimal volume,@NotNull BigDecimal weight,@NotNull Integer scale) {
        super(area, scale);
        this.volume = ValidationUtils.validateNotPositive(volume);
        this.weight = ValidationUtils.validateNotPositive(weight);
    }

}
