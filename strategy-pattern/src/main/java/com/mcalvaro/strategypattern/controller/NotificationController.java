package com.mcalvaro.strategypattern.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcalvaro.strategypattern.dto.NotificationRequest;
import com.mcalvaro.strategypattern.service.NotificationContext;

@RestController
@RequestMapping(value = "/api/v1/notifications")
public class NotificationController {

    private final NotificationContext notificationContext;

    public NotificationController(NotificationContext notificationContext) {
        this.notificationContext = notificationContext;
    }

    @PostMapping
    public String sendNotification(@RequestBody NotificationRequest request) {

        return notificationContext.sendMessage(request.getMessage(), request.getType());
    }
}
