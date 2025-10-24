package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.util.Arrays;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {

     this.c = c;
     this.month = month;
     this.usage = usage;
     this.prices = power_prices;
     this.amount = 0;

    }

    public void computeAmount() {

        double amount = 0;

        switch (c.getAgreement()) {

        case NORGESPRICE:
        amount = MonthlyPower.computeNorgesPrice(usage);
        break;

        case SPOTPRICE:
        amount = MonthlyPower.computeSpotPrice(usage, prices);
        break;

        case POWERSUPPORT:
        amount = MonthlyPower.computeSpotPrice(usage, prices);
        break;

        }

        System.out.print("Amount: " + amount);

    }

    public void printInvoice() {

        System.out.println("Customer number " + c.getCustomer_id());
        System.out.println("Name " + c.getName());
        System.out.println("Email " + c.getEmail());
        System.out.println("Agreement " + c.getAgreement());
        System.out.println();
        System.out.println("Month: " + month);
        System.out.println("Usage: " + MonthlyPower.computePowerUsage(usage));
        computeAmount();

    }
}
