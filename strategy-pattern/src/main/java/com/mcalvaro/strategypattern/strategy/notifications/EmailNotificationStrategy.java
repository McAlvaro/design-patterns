package com.mcalvaro.strategypattern.strategy.notifications;

import org.springframework.stereotype.Component;

import com.mcalvaro.strategypattern.enums.NotificationType;
import com.mcalvaro.strategypattern.strategy.contract.INotificationStrategy;

@Component
public class EmailNotificationStrategy implements INotificationStrategy {

    @Override
    public String sendMessage(String message) {
        return "Message send to email";
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

}
