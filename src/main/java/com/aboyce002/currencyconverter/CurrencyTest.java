package com.aboyce002.currencyconverter;

import java.util.Scanner;

public class CurrencyTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the currency you want to convert.");
        String firstCurrencyName = scan.nextLine().toUpperCase();
        Currency curr = Currency.valueOf(firstCurrencyName);
        System.out.println(curr);

        System.out.println("Enter the currency you want to convert to.");
        String secondCurrencyName = scan.nextLine().toUpperCase();  // Read user input
        Currency curr2 = Currency.valueOf(secondCurrencyName);
        System.out.println(curr2);

        System.out.println("Enter the amount of currency you'd like to convert.");
        int baseCurrency = scan.nextInt();
        System.out.println(baseCurrency);

        double firstCurrency = curr.getRate();
        double secondCurrency = curr2.getRate();
        double denom = convert(baseCurrency, firstCurrency);
        double num = convert(baseCurrency, secondCurrency);

        double rate = num/denom;
        System.out.println("The rate of " + curr.toString().toLowerCase() + "s is " + firstCurrency + " and the rate of " + curr2.toString().toLowerCase() + "s is " + secondCurrency);
        System.out.println("The conversion rate is " + rate + ".");
        System.out.println(baseCurrency + " " + curr.toString().toLowerCase() + "s"
                + " equals " + (baseCurrency*rate) + " " + curr2.toString().toLowerCase() + "s.");
    }

    public static double convert(int amountOfBaseCurrency, double targetCurrencyType) {
        return (targetCurrencyType * amountOfBaseCurrency);
    }
}
