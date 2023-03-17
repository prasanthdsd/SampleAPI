package com.example.domain;

import lombok.Data;

@Data
public class Fare {
    private Long nightSurcharge;
    private Long rideFare;

    public Fare() {
        nightSurcharge = 0L;
        rideFare = 0L;
    }

    public Long getTotalFare() {
        return nightSurcharge + rideFare;
    }
}
