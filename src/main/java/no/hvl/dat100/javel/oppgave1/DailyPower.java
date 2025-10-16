package no.hvl.dat100.javel.oppgave1;

public class DailyPower {

    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {

        for (int i = 0; i < prices.length; i++) {
            System.out.printf("%.2f NOK " , prices[i]);
        }
    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {

        for (int i = 0; i < usage.length; i++) {
            System.out.printf("%.2f kWh ", usage[i]);
        }

    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        double sum = 0;

        for (int i = 0; i < usage.length; i++) {
            sum += usage[i];
        }

        return sum;
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0;

        for (int i = 0; i < usage.length; i++) {
            price += usage[i] * prices[i];
        }

        return price;
    }

    // e) compute power support for a given usage and price
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    public static double getSupport(double usage, double price) {

        double support = 0;

        if( price > THRESHOLD) {
            double overGrensen = price - THRESHOLD;
            support = overGrensen * usage * PERCENTAGE;
        }

        return support;
    }

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {

        double support = 0;
        double price = 0;
        int hour = 0; // viser hvilke time vi er på

        for (double i : usage) {
            double j = prices[hour];

            if (j > THRESHOLD) {
                double overGrensen = j - THRESHOLD;
                support += overGrensen * i * PERCENTAGE;
            }
            hour++;
        }
        return support;
    }


    // g) compute norges pris for a single day
    private static final double NORGESPRIS_KWH = 0.5;
    public static double computeNorgesPrice(double[] usage) {

        double price = 0;

        for (int i = 0; i < usage.length; i++) {
            price += usage[i] * 0.5;
        }

            return price;
    }

    // h) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double temp_max = 0;

        for (int i = 0; i < usage.length; i++){
            if (usage[i]> temp_max){
                temp_max = usage[i];

            }

        }


        return temp_max;
    }

   //i
    public static double findAvgPower(double[] usage) {

        double average = 0;

        for (int i = 0; i < usage.length; i++){
        average += usage[i] / usage.length;
        }

        return average;
    }
}