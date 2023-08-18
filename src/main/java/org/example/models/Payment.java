package org.example.models;

import org.example.models.enums.PaymentMode;
import org.example.models.enums.PaymentStatus;

import java.util.Date;

public class Payment {
    public String referenceNumber;
    public double amount;
    public Date date;
    public Invoice invoice;
    public PaymentStatus paymentStatus;
    public PaymentMode paymentMode;
}
