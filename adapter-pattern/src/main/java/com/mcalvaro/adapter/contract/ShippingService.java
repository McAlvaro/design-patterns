package com.mcalvaro.adapter.contract;

public interface ShippingService {

    void ship(String address, double weightInKg);

    String track(String trackingNumber);
}
