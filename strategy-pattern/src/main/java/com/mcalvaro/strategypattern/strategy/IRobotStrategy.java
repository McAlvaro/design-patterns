package com.mcalvaro.strategypattern.strategy;

import com.mcalvaro.strategypattern.enums.RobotType;

public interface IRobotStrategy {

    RobotType getType();

    String getWayToMove();
}
