package array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println("\nThe average is: " + getAverage(myIntegers) + "\n");
        printArray(sortArray(myIntegers));
    }

    private static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i ++){
            System.out.println("Array elements are: " + myArray[i] );
        }
    }

    // array element from the console
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values. \r");
        int[] myArray = new int[number];
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    // finding average of the array
    public static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    // sort the array elements in descending order
    public static int[] sortArray(int[] array){
        /*int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            sortedArray[i] = array[i];
        }*/
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++){
                if (sortedArray[i] < sortedArray[i+1]){
                    temp= sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
