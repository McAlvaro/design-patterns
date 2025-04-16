package com.mcalvaro.adapter;

import com.mcalvaro.adapter.contract.ShippingService;
import com.mcalvaro.service.fedex.FedExService;

public class FedExAdapter implements ShippingService {

    private final FedExService fedExService;

    public FedExAdapter(FedExService fedExService) {
        this.fedExService = fedExService;
    }

    @Override
    public void ship(String address, double weightInKg) {
        fedExService.shipFedEx(address, weightInKg);
    }

    @Override
    public String track(String trackingNumber) {
        return fedExService.trackFedEx(trackingNumber);
    }

}
