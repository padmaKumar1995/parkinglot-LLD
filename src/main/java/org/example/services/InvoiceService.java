package org.example.services;

import org.example.models.Invoice;
import org.example.models.Ticket;
import org.example.strategies.feecalculation.FeeCalculationStrategy;

public class InvoiceService {
    private final FeeCalculationStrategy feeCalculationStrategy;

    public InvoiceService(FeeCalculationStrategy feeCalculationStrategy) {
        this.feeCalculationStrategy = feeCalculationStrategy;
    }

    public Invoice calculateFee(Ticket ticket) {
        var amount = feeCalculationStrategy.calculateFee(ticket);
        return null;
    }
}
