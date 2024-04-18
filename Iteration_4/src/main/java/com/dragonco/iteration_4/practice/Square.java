package com.dragonco.iteration_4.practice;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;


public class Square extends Parallelogram {
    public Square(@NotNull BigDecimal side,@NotNull  Integer scale) {
        super(side, side, side, scale);
    }

//    static BigDecimal validate(BigDecimal val) {
//        if (val == null) throw new
//    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Square{");
        sb.append("side=");
        sb.append(getSide());
        sb.append('}');
        return sb.toString();
    }
}
