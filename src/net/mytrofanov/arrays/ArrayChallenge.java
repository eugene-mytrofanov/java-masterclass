package net.mytrofanov.arrays;

import java.util.Scanner;

public class ArrayChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] newArray = getIntegers(5);
        System.out.println("Unsorted array is: ");
        printArray(newArray);
        int[] sortedArray = sortIntegers(newArray);
        System.out.println("Sorted array in descending order is: ");
        printArray(sortedArray);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("The element " + i + " is: " + array[i]);
        }
    }

    private static int[] getIntegers(int number) {
        int[] intArray = new int[number];
        System.out.println("Please enter " + number + " integers");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    private static int[] sortIntegers(int[] array) {
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            int maxElement = 0;
            for (int y = i; y < array.length; y++) {
                if (array[y] > maxElement) {
                    maxIndex = y;
                    maxElement = array[y];
                }
            }
            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
        }
        return array;
    }
}
