package com.dilara.ui;

import java.util.Scanner;

public class Utility {
    static Scanner scanner = new Scanner(System.in);
    public static int getIntValue(String query) {
        int value = 0;
        boolean control = false;
        do {
            System.out.println(query);
            try {
                value = Integer.parseInt(scanner.nextLine());
                control = false;
            } catch (Exception e) {
                System.out.println("Please enter a numerical value: " + e.getMessage());
                control = true;
            }

        } while (control);

        return value;
    }

    public static double getDoubleValue(String query) {
        double value = 0;
        boolean control = false;
        do {
            System.out.println(query);
            try {
                value = Double.parseDouble(scanner.nextLine());
                control = false;
            } catch (Exception e) {
                System.out.println("Please enter a numerical value: " + e.getMessage());
                control = true;
            }

        } while (control);

        return value;
    }

    public static long getLongValue(String query) {
        long value = 0;
        boolean control = false;
        do {
            System.out.println(query);
            try {
                value = Long.parseLong(scanner.nextLine());
                control = false;
            } catch (Exception e) {
                System.out.println("Please enter a numerical value: " + e.getMessage());
                control = true;
            }

        } while (control);

        return value;
    }

    public static String getStringValue(String query) {
        System.out.println(query);
        return scanner.nextLine();
    }

}
