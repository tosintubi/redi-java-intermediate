package Classroom;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        /*
        printReversed();
        System.out.println("\n================");
        */
        mergeArrays();


        System.out.println("\n==============");
        int[] testArray = {1,3,3,8,0,3,10};
        System.out.println(findItem(testArray,3));
        System.out.println(findItem(testArray,2));
    }

    // Prints an integer array in reverse order
    private static void printReversed(){
        int[] intArray = {1,3,5,2,4};

        for (int i = intArray.length-1; i >= 0; i--) {
            System.out.print(intArray[i]+" ");
        }
    }

    /*
    *  Receives two arrays from through user Input and
    *  merge them into a single array element wise.
    */
    private static void mergeArrays(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many items does the array contains : ");
        int arrayLength = sc.nextInt();
        int[] firstArray  = new int[arrayLength];
        int[] secondArray  = new int[arrayLength];

        // Stores the first array
        System.out.println("\n=====  First Array =====");
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter the array element "+ i +" :");
            firstArray[i] = sc.nextInt();
        }

        // Stores the second array
        System.out.println("\n=====  Second Array =====");
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter the array element :"+ i +" : ");
            secondArray[i] = sc.nextInt();
        }

        // Print first Array
        System.out.print("The first Array is : ");
        for (int item: firstArray) {
            System.out.print(item +" ");
        }

        // Print second Array
        System.out.print("\nThe second Array is : ");
        for (int item: secondArray) {
            System.out.print(item +" ");
        }

        int[] mergedArray = new int[arrayLength*2];
        int location = 0 ; // pointer for mergedArray location

        for (int i = 0; i < arrayLength; i++) {
            mergedArray[location] = firstArray[i];
            // move to next index on mergedArray
            location++;
            mergedArray[location] = secondArray[i];
            // move to next index on mergedArray
            location++;
        }
        System.out.print("\nThe Merged Array is : ");
        for (int item: mergedArray) {
            System.out.print(item +" ");
        }
    }


    // Search array list to find all occurrences of an element.
    public static ArrayList<Integer> findItem(int[] arrayItems, int key){
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < arrayItems.length; i++) {
            if (arrayItems[i] == key){
                indexes.add(i);
            }
        }
        return indexes;
    }

}
