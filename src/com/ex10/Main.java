/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Thew
 */
package com.ex10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final double tax_rate = 0.055;
	    Scanner newScanner = new Scanner(System.in);
        int item1, item2, item3, quant1, quant2, quant3;
        double subtotal, tax, total;
        System.out.print("Enter the price of item 1: ");
        item1 = newScanner.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        quant1 = newScanner.nextInt();
        System.out.print("Enter the price of item 2: ");
        item2 = newScanner.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        quant2 = newScanner.nextInt();
        System.out.print("Enter the price of item 3: ");
        item3 = newScanner.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        quant3 = newScanner.nextInt();
        subtotal = (item1*quant1)+(item2*quant2)+(item3*quant3);
        tax = subtotal*tax_rate;
        total = subtotal+tax;
        System.out.printf("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f", subtotal, tax, total);
    }
}
