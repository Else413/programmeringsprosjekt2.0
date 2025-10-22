package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        // Opprettet et nytt cutomer-objekt

        Customer nyKunde = new Customer("Lars", "123@gmail.com", 1234, PowerAgreementType.SPOTPRICE);
        System.out.println(nyKunde);


    }
}
