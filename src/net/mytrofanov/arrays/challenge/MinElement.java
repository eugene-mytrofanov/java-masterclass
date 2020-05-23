package net.mytrofanov.arrays.challenge;

import java.util.Scanner;

public class MinElement {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the array capacity");
        int[] array = readIntegers(scanner.nextInt());
        int returnedMinValue = findMin(array);
        System.out.println("Minimum value in array is " + returnedMinValue);
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Fill out the array with " + count + " integers");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter " + (i+1) + " integer");
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("The array filling is completed");
        return array;
    }

    private static int findMin(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}
