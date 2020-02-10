package net.mytrofanov.exception;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        } catch (ArithmeticException | NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Unable to perform division, autopilot shutting down");
        }
    }

    private static int divide() {
        try {
            int x, y;
            x = getInt();
            y = getInt();
            System.out.println("x is " + x + ", y is " + y);
            return x / y;
        } catch (NoSuchElementException e) {
            throw new ArithmeticException("no suitable input");
        } catch (ArithmeticException e) {
            throw new ArithmeticException("attempt to divide by zero");
        }
    }

    private static int getInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer");
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                // Go round again. Read past the end of line in the input first
                sc.nextLine();
                System.out.println("Please enter a number using only the digits 0-9sdfs");
            }
        }
    }
}
