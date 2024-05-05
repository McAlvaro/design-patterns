package com.mcalvaro.strategypattern.strategy;

import org.springframework.stereotype.Component;

import com.mcalvaro.strategypattern.enums.RobotType;

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
