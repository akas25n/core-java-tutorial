package referencevsvaluetype;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // reference type
        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray;
        
        System.out.println("My int array: " + Arrays.toString(myIntArray));
        System.out.println("Another int array: " + Arrays.toString(anotherIntArray));

        anotherIntArray[0] = 5;

        System.out.println("After change My int array: " + Arrays.toString(myIntArray));
        System.out.println("After change another int array: " + Arrays.toString(anotherIntArray));

        modifyArray(anotherIntArray);

        System.out.println("After modification My int array: " + Arrays.toString(myIntArray));
        System.out.println("After modification another int array: " + Arrays.toString(anotherIntArray));
    }

    public static void modifyArray(int[] array){
        array[0] = 2;
    }
}
