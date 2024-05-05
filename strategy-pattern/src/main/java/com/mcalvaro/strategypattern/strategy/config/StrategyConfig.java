package com.mcalvaro.strategypattern.strategy.config;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mcalvaro.strategypattern.enums.NotificationType;
import com.mcalvaro.strategypattern.strategy.contract.INotificationStrategy;

@Configuration
public class StrategyConfig {

    private final List<INotificationStrategy> notificationStrategies;

    public StrategyConfig(List<INotificationStrategy> notificationStrategies) {
        this.notificationStrategies = notificationStrategies;
    }

    @Bean
    public Map<NotificationType, INotificationStrategy> sendNotificationByType() {

        Map<NotificationType, INotificationStrategy> messagesByType = new EnumMap<>(NotificationType.class);

        notificationStrategies.forEach(notificationStrategy -> messagesByType
                .put(notificationStrategy.notificationType(), notificationStrategy));

        return messagesByType;
    }

}
