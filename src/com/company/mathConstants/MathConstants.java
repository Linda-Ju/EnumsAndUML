package com.company.mathConstants;

public enum MathConstants {

    PI(3.14),
    E(2.71828),
    THE_GOLDEN_RATIO(1.618033),
    GRAVITATION_CONST(9.8),
    THE_SPEED_OF_LIGHT(299792458);

    private final double number;

    MathConstants(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }
}
