package org.example.models;

import org.example.models.enums.InvoicePaidStatus;

import java.util.Date;

public class Invoice {
    private Ticket ticket;
    private double amount;
    private Date exitTime;
    private Operator operator;
    private InvoicePaidStatus invoicePaidStatus;
}
