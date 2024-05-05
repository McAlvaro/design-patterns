package com.mcalvaro.strategypattern.strategy.contract;

import com.mcalvaro.strategypattern.enums.NotificationType;

public interface INotificationStrategy {

    String sendMessage(String message);

    NotificationType notificationType();
}
