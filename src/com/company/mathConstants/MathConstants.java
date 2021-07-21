package com.company.mathConstants;

public enum MathConstants {
    PI("3.14"),
    E("2.71828"),
    THE_GOLDEN_RATIO("1.618033"),
    GRAVITATION_CONST("9.8m/s^"),
    THE_SPEED_OF_LIGHT("299792458 m/s");

    private final String number;

    MathConstants(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}
