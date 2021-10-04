package com.company;

public class Main {

    public static void main(String[] args) {
        long ticketPrice = 300_000_000;
        int milePrice = 20;
        long bonusMiles = ticketPrice / milePrice;
        System.out.println(bonusMiles);
    }
}
