package com.mcalvaro.strategypattern.service;

import java.util.Map;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.mcalvaro.strategypattern.enums.NotificationType;
import com.mcalvaro.strategypattern.strategy.contract.INotificationStrategy;

@Service
public class NotificationContext {

    private final Map<NotificationType, INotificationStrategy> sendNotificationByType;

    public NotificationContext(Map<NotificationType, INotificationStrategy> sendNotificationByType) {
        this.sendNotificationByType = sendNotificationByType;
    }

    public String sendMessage(String message, NotificationType type) {
        INotificationStrategy notificationStrategy = sendNotificationByType.getOrDefault(type, null);

        if (Objects.isNull(notificationStrategy)) {
            return "N/A";
        }

        return notificationStrategy.sendMessage(message);
    }
}
