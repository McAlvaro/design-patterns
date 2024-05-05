package com.mcalvaro.strategypattern.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import com.mcalvaro.strategypattern.enums.RobotType;
import com.mcalvaro.strategypattern.strategy.IRobotStrategy;

@Service
public class RobotContext implements InitializingBean {

    private List<IRobotStrategy> robotStrategies;

    private Map<RobotType, IRobotStrategy> map;

    public RobotContext(List<IRobotStrategy> robotStrategies) {
        this.robotStrategies = robotStrategies;
    }

    @Override
    public void afterPropertiesSet() {
        this.map = new HashMap<>();
        robotStrategies.forEach(robotStrategy -> map.put(robotStrategy.getType(), robotStrategy));
    }

    public String retrieveWayToMove(RobotType type) {
        if (!RobotType.exists(type))
            return "N/A";

        return this.map.get(type).getWayToMove();
    }
}
