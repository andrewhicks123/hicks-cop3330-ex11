/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Andrew Hicks
 */



package com.example.Main;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        int euro = input.nextInt();
        System.out.print("What is the exchange rate? ");
        double exchange = input.nextDouble();
        double total = (double) Math.round((exchange*euro)*100)/100;
        System.out.println(euro + " euros at an exchange rate of " + exchange + " is " + total + " U.S. dollars.");
    }
}
