package com.mcalvaro;

import com.mcalvaro.adapter.DHLAdapter;
import com.mcalvaro.adapter.FedExAdapter;
import com.mcalvaro.adapter.contract.ShippingService;
import com.mcalvaro.service.dhl.DHLService;
import com.mcalvaro.service.fedex.FedExService;

public class Main {
    public static void main(String[] args) {

        // TODO: Old implementation
        // FedExService fedExService = new FedExService();
        // fedExService.shipFedEx("Calle Rene Moreno, 10", 2.5);
        // System.out.println(fedExService.trackFedEx("123456789"));

        // TODO: New implementation
        ShippingService fedex = new FedExAdapter(new FedExService());
        fedex.ship("Calle Rene Moreno, 10", 2.5);
        System.out.println(fedex.track("FX123456789"));

        ShippingService dhl = new DHLAdapter(new DHLService());
        dhl.ship("Calle Rene Moreno, 581", 5.2);
        System.out.println(dhl.track("HDL123456789"));
    }
}
