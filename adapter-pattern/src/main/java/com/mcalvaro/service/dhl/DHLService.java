package com.mcalvaro.service.dhl;

public class DHLService {

    public void sendPackageDHL(String destination, double weightInPounds) {
        System.out.println("DHL: Sending " + weightInPounds + " lbs to " + destination);
    }

    public String getDHLTracking(String trackingNumber) {
        return "DHL: Your package is in transit. Code: " + trackingNumber;
    }
}
