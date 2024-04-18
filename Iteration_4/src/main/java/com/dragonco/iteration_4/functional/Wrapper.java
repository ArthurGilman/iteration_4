package com.dragonco.iteration_4.functional;

import java.util.Optional;

public class Wrapper {

    public static <T> Optional<T> wrap(Executable<T> exp) throws CriticalException {
        T value = null;
        try {
            value = exp.execute();
        } catch (NonCriticalException e) {
            return Optional.empty();
        }

        return Optional.ofNullable(value);
    }

    public static Integer parser(String string) {
        Integer res;
        if (string == null) throw new CriticalException();
        try {
            res = Integer.valueOf(string);
        } catch (NumberFormatException e) {
            throw new NonCriticalException();
        }
        return res;
    }
}
