package com.example.service;

import com.example.domain.Fare;
import com.example.domain.TaxiRide;
import org.springframework.stereotype.Service;

@Service
public class TaxiFareCalculatorService {

    public Long calculateFare(TaxiRide taxiRide, Fare rideFare) {
        rideFare.setRideFare(10L);
        rideFare.setNightSurcharge(5L);
        return rideFare.getTotalFare();
    }
}
