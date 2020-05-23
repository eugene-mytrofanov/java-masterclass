package net.mytrofanov.arrays.challenge;

import java.util.Arrays;
import java.util.Scanner;

public class ResizeArray {
    private static Scanner sc = new Scanner(System.in);
    private static int[] baseData = new int[5];

    public static void main(String[] args) {
        System.out.println("Enter 5 integers");
        getInput();
        printArray(baseData);
        resizeArray(8);
        printArray(baseData);
        System.out.println("Enter 8 integers");
        getInput();
        printArray(baseData);
    }

    private static void getInput() {
        for (int i = 0; i < baseData.length; i++) {
            System.out.println("Enter integer");
            baseData[i] = sc.nextInt();
        }
    }

    private static void printArray(int[] arr) {
        System.out.println("The array is " + Arrays.toString(arr));
    }

    private static void  resizeArray(int capacity) {
        int[] original = baseData;
        baseData = new int[capacity];
        for (int i = 0; i < original.length; i++) {
            baseData[i] = original[i];
        }
    }
}
