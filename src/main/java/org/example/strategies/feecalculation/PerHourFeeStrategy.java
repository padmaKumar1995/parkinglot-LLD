package org.example.strategies.feecalculation;

import org.example.models.Invoice;
import org.example.models.Ticket;
import org.example.models.enums.VehicleType;

import java.util.Date;

public class PerHourFeeStrategy implements FeeCalculationStrategy {
    @Override
    public double calculateFee(Ticket ticket) {
        return 0.0;
    }
}
