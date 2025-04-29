package com.ps;

import javax.xml.crypto.Data;
import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Transactions> entries = new ArrayList<>();
    public static  void main(String[] args) {

       displayHomeScreen();














    }

    private static void displayHomeScreen() {
        char homeScreenUserInput;
        do{
            System.out.println("******************************************************************************");
            System.out.println("***                   WELCOME TO THE PLURALSIGHT BANK                      ***");
            System.out.println("******************************************************************************");
            System.out.println("*                     Please pick one of the following options               *" );
            System.out.println("*                                                                            *");
            System.out.println("*                           D) Add Deposit                                   *");
            System.out.println("*                           P) Make Payment                                  *");
            System.out.println("*                           L) Ledger                                        *");
            System.out.println("*                           X) Exit                                          *");
            System.out.println("******************************************************************************");
            homeScreenUserInput= Character.toUpperCase(scanner.next().charAt(0));

            switch(homeScreenUserInput){
                case 'D':
                    scanner.nextLine();
                    addDeposit();
                    break;

                case 'P':
                    makePayment();
                    break;
                case 'L':
                    displayLedgerScreen();
                    break;
                case 'X':
                    System.out.println("You have exited the application. Thank you for browsing.");
                    break;
                default:
                    System.out.println("Wrong Input! Try again");
            }
        }while (homeScreenUserInput != 'X' );

    }

    private static void displayLedgerScreen() {
        System.out.println("******************************************************************************");
        System.out.println("*                       YOU HAVE SELECTED LEDGER                             *" );
        System.out.println("******************************************************************************");
        System.out.println("*               Please select one of the following options:                  *");
        System.out.println("*                                                                            *");
        System.out.println("*                               A) All Transactions                          *");
        System.out.println("*                               D) Deposits                                  *");
        System.out.println("*                               P) Payments                                  *");
        System.out.println("*                               R) Reports                                   *");
        System.out.println("*                               H) Home                                      *");
        System.out.println("******************************************************************************");

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

    private static  void displayAllTransactions() {
        System.out.println("******************************************************************************");
        System.out.println("*                          ALL TRANSACTIONS                                  *");
        System.out.println("******************************************************************************\n");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("transactions.csv"));
            String firstLine = reader.readLine();
            String data;


            while ((data = reader.readLine()) != null) {

                String[] entries = data.split("\\|");

                String date = entries[0];
                String time = entries[1];
                String description = entries[2];
                String vendor = entries[3];
                double amount = Double.parseDouble(entries[4].trim());


                System.out.println(date + " " + time + " "+ description+ " "+ vendor+ " "+ amount);




            }
            System.out.println("\n\n******************************************************************************");

            reader.close();
        } catch(IOException e){
            System.out.println("Error reading file "+ e.getMessage());
        }
    }

    private static void makePayment() {
    }

    private static void addDeposit() {
        System.out.println("******************************************************************************");
        System.out.println("*                    YOU HAVE SELECTED  TO DEPOSIT                           *");
        System.out.println("******************************************************************************");
        System.out.println("*    PLEASE ADD THE DEPOSIT IN THE FOLLOWING MANNER SEPARATED BY SPACE       *");
        System.out.println("*    Example: 2023-04-24 12:00:00 Invoice 1006 paid PixelWorks 1600.00       *");
        System.out.println("******************************************************************************");


        try{
            FileWriter fileWriter = new FileWriter("transactions.csv",true);

            BufferedWriter writer = new BufferedWriter(fileWriter);


            String inputDeposit = scanner.nextLine().trim();

            String[] userInput = inputDeposit.split(" ");


            String date = userInput[0];
            String time = userInput[1];
            String description = userInput[2];
            String vendor = userInput[3];
            double amount = Double.parseDouble(userInput[4].trim());

            String newDeposit = String.format("%s|%s|%s|%s|%.2f", date,time,description,vendor,amount);

            writer.write(newDeposit);
            writer.newLine();
            writer.close();

            System.out.println(" You have added "+ newDeposit+"\n\n");


        } catch (IOException e) {
            throw new RuntimeException("File write error" +e.getMessage());
        }

    }
}