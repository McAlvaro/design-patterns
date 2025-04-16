package com.mcalvaro.adapter;

import com.mcalvaro.adapter.contract.ShippingService;
import com.mcalvaro.service.dhl.DHLService;

public class DHLAdapter implements ShippingService {

    private final DHLService dhlService;

    public DHLAdapter(DHLService dhlService) {
        this.dhlService = dhlService;
    }

    @Override
    public void ship(String address, double weightInKg) {
        double weightInLbs = kgToLbs(weightInKg);
        dhlService.sendPackageDHL(address, weightInLbs);
    }

    @Override
    public String track(String trackingNumber) {
        return dhlService.getDHLTracking(trackingNumber);
    }

    private double kgToLbs(double weightInKg) {
        return weightInKg * 2.20462;
    }

}
