package net.mytrofanov.arrays;

import java.util.Scanner;

public class ArraysDemo {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many number would you like to enter?");
        int[] myIntegers = getIntegers(scanner.nextInt());
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + " was entered " + myIntegers[i]);
        }
        System.out.println("The array average is " + getAverage(myIntegers));
    }

    private static int[] getIntegers(int number) {
        int[] intArray = new int[number];
        System.out.println("Please enter " + number + " integers");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    private static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }
}
