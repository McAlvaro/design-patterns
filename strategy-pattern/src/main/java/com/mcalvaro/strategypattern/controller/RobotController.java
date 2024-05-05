package com.mcalvaro.strategypattern.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcalvaro.strategypattern.enums.RobotType;
import com.mcalvaro.strategypattern.service.RobotContext;

@RestController
@RequestMapping(value = "/api/v1/robots")
public class RobotController {

    private RobotContext robotContext;

    public RobotController(RobotContext robotContext) {
        this.robotContext = robotContext;
    }

    @GetMapping("/{type}/way-to-move")
    public String getWayToMove(@PathVariable("type") RobotType type) {
        return this.robotContext.retrieveWayToMove(type);
    }
}
