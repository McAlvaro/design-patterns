package com.mcalvaro.strategypattern.strategy;

import org.springframework.stereotype.Component;

import com.mcalvaro.strategypattern.enums.RobotType;
import com.mcalvaro.strategypattern.strategy.contract.IRobotStrategy;

@Component
public class RobotRoomba implements IRobotStrategy {

    @Override
    public RobotType getType() {
        return RobotType.ROOMBA;
    }

    @Override
    public String getWayToMove() {
        return "Se Desliza";
    }

}
