package com.mcalvaro.strategypattern.dto;

import com.mcalvaro.strategypattern.enums.NotificationType;

public class NotificationRequest {
 
    private NotificationType type;

    private String message;

	public NotificationType getType() {
		return type;
	}

	public void setType(NotificationType type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
