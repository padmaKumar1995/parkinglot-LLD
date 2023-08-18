package org.example.strategies.feecalculation;

import org.example.models.Invoice;
import org.example.models.Ticket;

public interface FeeCalculationStrategy {
    double calculateFee(Ticket ticket);
}
