package com.ps;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

       displayHomeScreen();













    }

    private static void displayLedgerScreen() {
        System.out.println("Please select one of the following options:");
        System.out.println("A) All");
        System.out.println("D) Deposits");
        System.out.println("P) Payments");
        System.out.println("R) Reports");
        System.out.println("H) Home");

        char ledgerScreenUserInput = Character.toUpperCase(scanner.next().charAt(0));

        switch(ledgerScreenUserInput){
            case 'A':
                displayAllTransactions();
                break;
            case 'D':
                displayDeposits();
                break;
            case 'P':
                displayPayments();
                break;
            case 'R':
                displayReports();
                break;
            case 'H':
                displayHomeScreen();
                break;


        }

    }

    private static void displayHomeScreen() {
        char homeScreenUserInput;
        do{
            System.out.println("Welcome to the Plural Sight Bank");
            System.out.println("D) Add Deposit");
            System.out.println("P) Make Payment");
            System.out.println("L) Ledger");
            System.out.println("X) Exit\n What you you like to do?");
            homeScreenUserInput= Character.toUpperCase(scanner.next().charAt(0));

            switch(homeScreenUserInput){
                case 'D':
                    addDeposit();
                    break;

                case 'P':
                    makePayment();
                    break;
                case 'L':
                    displayLedgerScreen();
                    break;
                case 'X':
                    System.out.println("You have exited the application. Thank you for browsing");
                    break;
                default:
                    System.out.println("Wrong Input! Try again");
            }
        }while (homeScreenUserInput != 'X' );

    }

    private static void displayReports() {
        System.out.println("PLease select one of the following options:");
        System.out.println("1. Month to Date");
        System.out.println("2. Previous Month");
        System.out.println("3. Year to Date");
        System.out.println("4. Previous Year");
        System.out.println("5. Search by Vendor");
        System.out.println("0. Back ");

        int reportsUserInput = scanner.nextInt();

        switch(reportsUserInput){
            case 1:
                displayMonthToDate();
                break;
            case 2:
                displayPreviousMonth();
                break;
            case 3:
                displayYearToDate();
                break;
            case 4:
                displayPreviousYear();
                break;
            case 5:
                displaySearchByVendor();
                break;
            case 0:
                displayReports();
                break;


        }
    }

    private static void displaySearchByVendor() {
    }

    private static void displayPreviousYear() {
    }

    private static void displayYearToDate() {
    }

    private static void displayPreviousMonth() {
    }

    private static void displayMonthToDate() {
    }

    private static void displayPayments() {
    }

    private static void displayDeposits() {
    }

    private static void displayAllTransactions() {
    }

    private static void makePayment() {
    }

    private static void addDeposit() {
    }
}