package com.mcalvaro.strategypattern.strategy;

import org.springframework.stereotype.Component;

import com.mcalvaro.strategypattern.enums.RobotType;
import com.mcalvaro.strategypattern.strategy.contract.IRobotStrategy;

@Component
public class RobotKangoroo implements IRobotStrategy {

    @Override
    public RobotType getType() {
        return RobotType.KANGOROO;
    }

    @Override
    public String getWayToMove() {
        return "Salta";
    }

}
