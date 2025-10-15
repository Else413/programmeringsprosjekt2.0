package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that tests the methods you implement in the DailyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

        // a)
        DailyPower.printPowerPrices(powerprices_day);
        System.out.println();

        // b)
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println();

        // c)
        double sum = DailyPower.computePowerUsage(powerusage_day);
        System.out.println("Total strømforbruk for en dag: " + sum);

        // d)
        double spotpris = DailyPower.computeSpotPrice(powerusage_day, powerprices_day);
        System.out.println("Strømpris med spotpris " + spotpris);

        // e)
        double stromstotte = DailyPower.getSupport(23.53, 500);
        System.out.println("Strømstøtte " + stromstotte);

        //f)
        double powerSupport = DailyPower.computePowerSupport(powerusage_day, powerprices_day);
        System.out.println("Strømstøtte for gitt dag: " + powerSupport);

        // g)
        double norgesPris = DailyPower.computeNorgesPrice((powerusage_day));
        System.out.println("Pris med Norgesstøtte " + norgesPris );

        // h)
        double peakUsage = DailyPower.findPeakUsage(powerusage_day);
        System.out.println("Største forbruk på én time " + peakUsage + "kWh");

        // i)
        double gjennomsnitt = DailyPower.findAvgPower(powerusage_day);
        System.out.println("Gjennomsnittforbruk i timen: " + gjennomsnitt + " kWh");

    }
}
