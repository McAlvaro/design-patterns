package com.mcalvaro.strategypattern.enums;

import java.util.Arrays;

public enum RobotType {
    ROOMBA, KANGOROO, HUMANOIDE;

    public static boolean exists(RobotType type) {
        return Arrays.stream(RobotType.values()).anyMatch(type::equals);
    }
}
