package com.mcalvaro.strategypattern.strategy.contract;

import com.mcalvaro.strategypattern.enums.RobotType;

public interface IRobotStrategy {

    RobotType getType();

    String getWayToMove();
}
