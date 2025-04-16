package com.mcalvaro.service.fedex;

public class FedExService {

    public void shipFedEx(String address, double weight) {
        System.out.println("Shipping " + weight + " kg package to " + address + " via FedEx");
    }

    public String trackFedEx(String trackingNumber) {
        return "FedEx: Your package is in transit N: " + trackingNumber;
    }
}
