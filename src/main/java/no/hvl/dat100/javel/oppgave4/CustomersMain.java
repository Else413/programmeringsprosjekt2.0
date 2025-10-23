package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();


        Customers nyKundeTabell = new Customers(5);

        Customer k1 = new Customer("Bob Johnson", "bob@example.com", 1002, PowerAgreementType.NORGESPRICE);
        Customer k2 = new Customer("Charlie Rose", "charlie@example.com", 1003, PowerAgreementType.POWERSUPPORT);

       // setter k1 inn i kundetabellen og sjekker med metoden addCustomer om det er plass i tabellen
        System.out.println(nyKundeTabell.addCustomer(k1));
        System.out.println(nyKundeTabell.addCustomer(k2));
        System.out.println(nyKundeTabell.removeCustomer(1003));



        int antall = nyKundeTabell.countNonNull();
        System.out.println("Antall kunder: " + antall);



    }
}
