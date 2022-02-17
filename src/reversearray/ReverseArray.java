package reversearray;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] myArray = {1, 5, 6, 5, 4};
        System.out.println("Array: " + Arrays.toString(myArray));
        reverse(myArray);
        System.out.println("Reverse Array: " + Arrays.toString(myArray));
    }

    private static void reverse(int[] array){
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i< halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
    }
}
