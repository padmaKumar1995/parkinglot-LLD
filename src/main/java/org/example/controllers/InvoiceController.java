package org.example.controllers;

import org.example.models.Invoice;
import org.example.models.Ticket;
import org.example.services.InvoiceService;

public class InvoiceController {
    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    public Invoice calculateFee(Ticket ticket) {
        return invoiceService.calculateFee(ticket);
    }
}
