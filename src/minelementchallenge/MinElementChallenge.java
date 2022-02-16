package minelementchallenge;

import java.util.Scanner;

public class MinElementChallenge {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter the numbers: ");
        int minimumValue = findMin(readIntegers(5));
        System.out.println("Minimum value is: " + minimumValue);

    }

    // print array
    private static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Array elements are: " + myArray[i]);
        }
    }

    // read value from the console and save them to an array
    static int[] readIntegers(int count) {
        int[] myArray = new int[count];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    // find minimum array element
    static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
