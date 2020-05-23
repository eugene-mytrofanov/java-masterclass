package net.mytrofanov.arrays.challenge;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a method called reverse() with an int array as parameter.
 * The method should not return any value. In other words, the method is allowed to modify the array parameter.
 * In main() test the reverse() method and print the array both reversed and non-reversed
 * To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
 * For example, if the array is {1,2,3,4,5}, then the reversed array is {5,4,3,2,1}.
 */
public class ReverseArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the array capacity");
        int[] initialArray = readIntegers(scanner.nextInt());
        System.out.println("Origin array is " + Arrays.toString(initialArray));
        reverse(initialArray);
        System.out.println("Reversed array is " + Arrays.toString(initialArray));
    }

    private static void reverse(int[] array) {
        int swapCount = array.length / 2;
        int maxIndex = array.length - 1;
        int tempElement = 0;
        for (int i = 0; i < swapCount; i++ ){
            tempElement = array[i];
            array[i] = array [maxIndex];
            array[maxIndex] = tempElement;
            maxIndex--;
        }
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Fill out the array with " + count + " integers");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter " + (i+1) + " integer");
            array[i] = scanner.nextInt();
        }
        System.out.println("The array filling is completed");
        return array;
    }
}
