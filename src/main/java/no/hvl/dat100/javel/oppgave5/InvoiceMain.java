package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();


        Customer k1 = new Customer ("Ethan Hunt", "ethan@email.com", 1005, PowerAgreementType.POWERSUPPORT);
        Customer k2 = new Customer ("Bob Johnson", "bob@example.com", 1003, PowerAgreementType.NORGESPRICE);

        Invoice faktura = new Invoice(k1, "september", CustomerPowerUsageData.usage_month_customer1, MonthPowerData.powerprices_month);
        faktura.printInvoice();

    }
}
