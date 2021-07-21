package com.company.mathConstants;

public class MathConstantsDemo {
    public static void main(String[] args) {
        MathConstants newPi = MathConstants.PI;
        MathConstants newE = MathConstants.E;
        MathConstants newGoldenRatio = MathConstants.THE_GOLDEN_RATIO;
        MathConstants newGravitation = MathConstants.GRAVITATION_CONST;
        MathConstants newSpeedOfLight = MathConstants.THE_SPEED_OF_LIGHT;

        System.out.println("newPi = " + newPi + " is " + newPi.getNumber());
        System.out.println("newE = " + newE + " is " + newE.getNumber());
        System.out.println("newGoldenRatio = " + newGoldenRatio + " is " + newGoldenRatio.getNumber());
        System.out.println("newGravitation = " + newGravitation + " is " + newGravitation.getNumber());
        System.out.println("newSpeedOfLight = " + newSpeedOfLight + " is " + newSpeedOfLight.getNumber());
    }
}
