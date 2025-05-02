package com.ps;


import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Transaction> transactionList = new ArrayList<>();
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    static LocalDate todayDate = LocalDate.now();

    public static void main(String[] args) {
        loadFile();
        char homeScreenUserInput;
        do {

            System.out.println(AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°");
            System.out.println(AnsiColors.ORANGE + "°" + AnsiColors.RESET + "\t\t\t\t\t" + AnsiColors.MONEYBAG + "\tWELCOME TO THE PLURALSIGHT BANK\t" + AnsiColors.MONEYBAG + AnsiColors.CYAN + "\t\t\t\t\t °" + AnsiColors.RESET);
            System.out.println(AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°");
            System.out.println(AnsiColors.ORANGE + "°                                                                            " + AnsiColors.CYAN + "°");
            System.out.println(AnsiColors.CYAN + "°\t\t\t\t\t" + AnsiColors.RESET + "Please pick one of the following options" + AnsiColors.CYAN + "\t\t\t\t °" + AnsiColors.ORANGE);
            System.out.println(AnsiColors.ORANGE + "°                                                                            °" + AnsiColors.CYAN);
            System.out.println(AnsiColors.CYAN + "°\t\t\t\t\t\t\t" + AnsiColors.RESET + "D) Add Deposit" + AnsiColors.CYAN + "\t\t\t\t\t\t\t\t\t °" + AnsiColors.ORANGE);
            System.out.println(AnsiColors.ORANGE + "°\t\t\t\t\t\t\t" + AnsiColors.RESET + "P) Make Payments" + AnsiColors.CYAN + "\t\t\t\t\t\t\t\t °" + AnsiColors.ORANGE);
            System.out.println(AnsiColors.CYAN + "°\t\t\t\t\t\t\t" + AnsiColors.RESET + "L) Ledger" + AnsiColors.ORANGE + "\t\t\t\t\t\t\t\t\t\t °");
            System.out.println(AnsiColors.ORANGE + "°\t\t\t\t\t\t\t" + AnsiColors.RESET + "X) Exit" + AnsiColors.CYAN + "\t\t\t\t\t\t\t\t\t\t\t °" + AnsiColors.ORANGE);
            System.out.println(AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.CYAN + "°" + AnsiColors.ORANGE + "°" + AnsiColors.RESET);

            homeScreenUserInput = Character.toUpperCase(scanner.next().charAt(0));

            switch (homeScreenUserInput) {
                case 'D':
                    scanner.nextLine();
                    addDeposit();
                    break;

                case 'P':
                    scanner.nextLine();
                    makePayment();
                    break;
                case 'L':
                    scanner.nextLine();
                    displayLedgerScreen();
                    break;
                case 'X':
                    System.out.println(AnsiColors.CYAN_BG + AnsiColors.BLACK + AnsiColors.BOLD + "You have exited the application. Thank you for browsing." + AnsiColors.RESET);
                    break;
                default:
                    System.out.println("Wrong Input! Try again");
            }
        } while (homeScreenUserInput != 'X');
    }

    public static void loadFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("transactions.csv"));
            String firstLine = reader.readLine();
            String line;


            while ((line = reader.readLine()) != null) {

                String[] entries = line.split("\\|");

                String date = entries[0];
                String time = entries[1];
                String description = entries[2];
                String vendor = entries[3];
                double amount = Double.parseDouble(entries[4].trim());

                Transaction transaction = new Transaction(date, time, description, vendor, amount);
                transactionList.add(transaction);

            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file " + e.getMessage());
        }
    }

    private static void addDeposit() {
        System.out.println("\n _____________________________________________________________________________");
        System.out.println("|" + AnsiColors.GREEN + "\t\t\t\t\t\tYOU HAVE SELECTED TO ADD DEPOSIT\t\t\t\t\t" + AnsiColors.RESET + "  |");
        System.out.println("|_____________________________________________________________________________|");


        try {
            FileWriter fileWriter = new FileWriter("transactions.csv", true);

            BufferedWriter writer = new BufferedWriter(fileWriter);

            System.out.println("Please enter the date of deposit below as (yyyy-MM-dd)");
            String userDepositDate = scanner.nextLine().trim();
            LocalDate userDateOfDeposit = LocalDate.parse(userDepositDate);

            System.out.println("Please enter the time of deposit below as (HH-mm-ss)");
            String userDepositTime = scanner.nextLine().trim();
            LocalTime userTimeOfDeposit = LocalTime.parse(userDepositTime);

            System.out.println("Please enter the description of deposit below:");
            String userDepositDescription = scanner.nextLine().trim();


            System.out.println("PLease enter the name of the vendor below: ");
            String userDepositVendor = scanner.nextLine().trim();


            System.out.println("Please enter the amount of the deposit below:");
            String userDepositAmount = scanner.nextLine().trim();
            double userAmountDeposit = Double.parseDouble(userDepositAmount);

            String newDeposit = String.format("%s|%s|%s|%s|%.2f", userDateOfDeposit, userTimeOfDeposit, userDepositDescription, userDepositVendor, userAmountDeposit);

            writer.write(newDeposit);
            writer.newLine();
            writer.close();

            System.out.println("\n" + AnsiColors.RED_BG + AnsiColors.WHITE + "You have added ( " + newDeposit + " ) deposit to your account." + AnsiColors.RESET + "\n\n");


        } catch (IOException e) {
            throw new RuntimeException("File write error" + e.getMessage());
        }

    }

    private static void makePayment() {
        System.out.println("\n _____________________________________________________________________________");
        System.out.println("|" + AnsiColors.YELLOW + "\t\t\t\t\t\tYOU HAVE SELECTED TO MAKE PAYMENTS\t\t\t\t\t" + AnsiColors.RESET + " |");
        System.out.println("|____________________________________________________________________________|");


        try {
            FileWriter fileWriter = new FileWriter("transactions.csv", true);

            BufferedWriter writer = new BufferedWriter(fileWriter);


            System.out.println("Please enter the date of payment below as (yyyy-MM-dd)");
            String userPaymentDate = scanner.nextLine().trim();
            LocalDate userDateOfPayment = LocalDate.parse(userPaymentDate);

            System.out.println("Please enter the time of payment below as (HH-mm-ss)");
            String userPaymentTime = scanner.nextLine().trim();
            LocalTime userTimeOfPayment = LocalTime.parse(userPaymentTime);

            System.out.println("Please enter the description of payment below:");
            String userPaymentDescription = scanner.nextLine().trim();


            System.out.println("PLease enter the name of the vendor below: ");
            String userPaymentVendor = scanner.nextLine().trim();


            System.out.println("Please enter the amount of the payment below:");
            String userPaymentAmount = scanner.nextLine().trim();
            double userAmountPayment = -Double.parseDouble(userPaymentAmount);


            String newPayment = String.format("%s|%s|%s|%s|%.2f", userDateOfPayment, userTimeOfPayment, userPaymentDescription, userPaymentVendor, userAmountPayment);

            writer.write(newPayment);
            writer.newLine();
            writer.close();

            System.out.println("\n" + AnsiColors.RED_BG + AnsiColors.WHITE + "You have added ( " + newPayment + " ) payment to your account." + AnsiColors.RESET + "\n\n");


        } catch (IOException e) {
            throw new RuntimeException("File write error" + e.getMessage());
        }

    }

    private static void displayLedgerScreen() {
        System.out.println("\n" + AnsiColors.YELLOW + "°" + AnsiColors.PURPLE + "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°" + AnsiColors.YELLOW + "°");
        System.out.println("°" + AnsiColors.YELLOW + "\t\t\t\t\t\tYOU HAVE SELECTED LEDGER\t\t\t\t\t\t\t °");
        System.out.println("°" + AnsiColors.PURPLE + "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°" + AnsiColors.YELLOW + "°");
        System.out.println("° \t\t\t\tPlease select one of the following options:\t\t\t\t\t °");
        System.out.println("°\t\t\t\t\t\t\t\tA) All Transactions\t\t\t\t\t\t\t °");
        System.out.println("°\t\t\t\t\t\t\t\tD) Deposits\t\t\t\t\t\t\t\t\t °");
        System.out.println("°\t\t\t\t\t\t\t\tP) Payments\t\t\t\t\t\t\t\t\t °");
        System.out.println("°\t\t\t\t\t\t\t\tR) Reports\t\t\t\t\t\t\t\t\t °");
        System.out.println("°\t\t\t\t\t\t\t\tH) Home\t\t\t\t\t\t\t\t\t\t °");
        System.out.println("°" + AnsiColors.PURPLE + "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°" + AnsiColors.YELLOW + "°");

        char ledgerScreenUserInput = Character.toUpperCase(scanner.next().charAt(0));

        switch (ledgerScreenUserInput) {
            case 'A':
                scanner.nextLine();
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
                System.out.println("Exiting to the Home Screen");
                break;
            default:
                System.out.println("Wrong input! PLease try again");

        }

    }

    private static void displayAllTransactions() {
        System.out.println(AnsiColors.WHITE + "\n♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦" + AnsiColors.RESET);
        System.out.println(AnsiColors.CYAN_BG + AnsiColors.BLACK + AnsiColors.BOLD + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDISPLAYING ALL TRANSACTIONS\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   " + AnsiColors.RESET);
        System.out.println(AnsiColors.WHITE + "♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦\n" + AnsiColors.RESET);


        for (Transaction transaction : transactionList) {
            System.out.println(transaction);
        }
        System.out.println(AnsiColors.WHITE + "♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦\n" + AnsiColors.RESET);


        displayLedgerScreen();
    }

    private static void displayDeposits() {

        System.out.println("\n" + AnsiColors.WHITE + "----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(AnsiColors.YELLOW_BG + AnsiColors.BLACK + AnsiColors.BOLD + "                                                         DISPLAYING ALL DEPOSITS                                                  " + AnsiColors.RESET);
        System.out.println(AnsiColors.WHITE + "----------------------------------------------------------------------------------------------------------------------------------\n");

        for (Transaction details : transactionList) {

            if (details.getAmount() > 0) {
                System.out.println(AnsiColors.CYAN + details);

            }
        }
        System.out.println("\n" + AnsiColors.WHITE + "----------------------------------------------------------------------------------------------------------------------------------" + AnsiColors.RESET);
        displayLedgerScreen();
    }

    private static void displayPayments() {
        System.out.println("\n" + AnsiColors.WHITE + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(AnsiColors.PURPLE_BG + AnsiColors.WHITE + AnsiColors.BOLD + "                                                           DISPLAYING ALL PAYMENTS                                          " + AnsiColors.RESET);
        System.out.println(AnsiColors.WHITE + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" + AnsiColors.RESET);

        for (Transaction transaction : transactionList) {

            if (transaction.getAmount() < 0) {
                System.out.println(transaction);

            }
        }
        System.out.println("\n" + AnsiColors.WHITE + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        displayLedgerScreen();
    }

    private static void displayReports() {
        System.out.println(AnsiColors.GREEN + "╔═════════════════════════════════════════════════════════════════════════════╗");
        System.out.println(AnsiColors.WHITE + "║                            YOU HAVE SELECTED REPORTS                        ║" + AnsiColors.GREEN);
        System.out.println(AnsiColors.GREEN + "╚═════════════════════════════════════════════════════════════════════════════╝");
        System.out.println(AnsiColors.GREEN + "║" + AnsiColors.WHITE + "\t\t\t\t\tPLease select one of the following options:\t\t\t\t" + AnsiColors.GREEN + "  ║");
        System.out.println("║                                                                             ║");
        System.out.println("║" + AnsiColors.WHITE + "                           1. Month to Date                                  " + AnsiColors.GREEN + "║");
        System.out.println("║" + AnsiColors.WHITE + "                           2. Previous Month                                 " + AnsiColors.GREEN + "║");
        System.out.println("║" + AnsiColors.WHITE + "                           3. Year to Date                                   " + AnsiColors.GREEN + "║");
        System.out.println("║" + AnsiColors.WHITE + "                           4. Previous Year                                  " + AnsiColors.GREEN + "║");
        System.out.println("║" + AnsiColors.WHITE + "                           5. Search by Vendor                               " + AnsiColors.GREEN + "║");
        System.out.println("║" + AnsiColors.WHITE + "                           0. Back                                           " + AnsiColors.GREEN + "║");
        System.out.println("╚═════════════════════════════════════════════════════════════════════════════╝" + AnsiColors.RESET);

        int reportsUserInput = scanner.nextInt();

        switch (reportsUserInput) {
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
                scanner.nextLine();
                displaySearchByVendor();
                break;
            case 0:
                displayLedgerScreen();
                break;
            default:
                System.out.println("Wrong input! Please try again.");

        }
    }

    private static void displayMonthToDate() {
        System.out.println(AnsiColors.ORANGE + "╭────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────╮");
        System.out.println("│" + AnsiColors.WHITE_BG + AnsiColors.BOLD + AnsiColors.ORANGE + "                                                         DISPLAYING ALL MONTH TO DATE                                           " + AnsiColors.RESET + AnsiColors.ORANGE + "│");
        System.out.println("╰────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────╯" + AnsiColors.RESET);

        int thisMonth = todayDate.getMonthValue();
        int thisYear = todayDate.getYear();
        for (Transaction transaction : transactionList) {
            LocalDate localDate = LocalDate.parse(transaction.getDate(), formatter);
            if (localDate.getMonthValue() == thisMonth && localDate.getYear() == thisYear) {

                System.out.println(" " + transaction);

            }
        }
        System.out.println(AnsiColors.ORANGE + "╰────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────╯" + AnsiColors.RESET);

        displayReports();
    }

    private static void displayPreviousMonth() {

        System.out.println(AnsiColors.CYAN + "╭────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────╮");
        System.out.println("│" + AnsiColors.WHITE_BG + AnsiColors.BOLD + AnsiColors.BLACK + "                                                         DISPLAYING PREVIOUS MONTH                                              " + AnsiColors.RESET + AnsiColors.CYAN + "│");
        System.out.println("╰────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────╯" + AnsiColors.RESET);

        LocalDate lastMonthDate = todayDate.minusMonths(1);
        int lastMonth = lastMonthDate.getMonthValue();
        int thisYear = todayDate.getYear();


        for (Transaction transaction : transactionList) {
            LocalDate localDate = LocalDate.parse(transaction.getDate(), formatter);
            if (localDate.getMonthValue() == lastMonth && localDate.getYear() == thisYear) {
                System.out.println(" " + transaction);
            }
        }
        System.out.println(AnsiColors.CYAN + "╰────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────╯" + AnsiColors.RESET);

        displayReports();
    }

    private static void displayYearToDate() {

        System.out.println(AnsiColors.PURPLE + "╭────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────╮");
        System.out.println("│" + AnsiColors.WHITE_BG + AnsiColors.BOLD + AnsiColors.PURPLE + "                                                         DISPLAYING YEAR TO DATE                                                " + AnsiColors.RESET + AnsiColors.PURPLE + "│");
        System.out.println("╰────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────╯" + AnsiColors.RESET);
        int thisYear = todayDate.getYear();

        for (Transaction transaction : transactionList) {

            LocalDate localDate = LocalDate.parse(transaction.getDate(), formatter);
            if (localDate.getYear() == thisYear) {
                System.out.println(" " + transaction);
            }
        }
        System.out.println(AnsiColors.PURPLE + "╰────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────╯" + AnsiColors.RESET);

        displayReports();
    }

    private static void displayPreviousYear() {

        System.out.println(AnsiColors.RED + "╭────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────╮");
        System.out.println("│" + AnsiColors.WHITE_BG + AnsiColors.BOLD + AnsiColors.RED + "                                                         DISPLAYING PREVIOUS YEAR                                               " + AnsiColors.RESET + AnsiColors.RED + "│");
        System.out.println("╰────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────╯" + AnsiColors.RESET);
        LocalDate lastYearDate = todayDate.minusYears(1);
        int lastYear = lastYearDate.getYear();

        for (Transaction transaction : transactionList) {
            LocalDate localDate = LocalDate.parse(transaction.getDate(), formatter);
            if (localDate.getYear() == lastYear) {
                System.out.println(transaction);
            }
        }
        System.out.println(AnsiColors.RED + "╰────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────╯" + AnsiColors.RESET);

        displayReports();
    }

    private static void displaySearchByVendor() {

        System.out.println("Please enter the vendor's name: ");

        String vendorNameInput = scanner.nextLine().trim();
        // check if empty
        if (vendorNameInput.isEmpty()) {
            System.out.println("No input. Try again.");

            displaySearchByVendor();
            return;
        }
        System.out.println(AnsiColors.YELLOW + "╭────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────╮");
        System.out.println("│" + AnsiColors.WHITE_BG + AnsiColors.BOLD + AnsiColors.RED + "                                                         DISPLAYING BY VENDOR                                                   " + AnsiColors.RESET + AnsiColors.YELLOW + "│");
        System.out.println("╰────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────╯" + AnsiColors.RESET);
        for (Transaction transaction : transactionList) {
            if (vendorNameInput.equalsIgnoreCase(transaction.getVendor().trim())) {
                System.out.println(" " + transaction);
            }
        }
        System.out.println(AnsiColors.YELLOW + "╰────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────╯" + AnsiColors.RESET + "\n\n");

        displayReports();
    }
//helper method.
}