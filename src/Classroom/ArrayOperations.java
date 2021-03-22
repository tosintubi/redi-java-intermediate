package Classroom;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        /*
        printReversed();
        System.out.println("\n================");
        mergeArrays();
        */

        System.out.println("\n==============");
        int[] testArray = {1,3,3,8,0,3,10};
        System.out.println(findItem(testArray,3));
        System.out.println(findItem(testArray,2));
    }

    private static void printReversed(){
        int[] intArray = {1,3,5,2,4};
        for (int i = intArray.length-1; i >= 0; i--) {
            System.out.print(intArray[i]+" ");
        }
    }

    private static void mergeArrays(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many items does the array contains : ");
        int arrayLength = sc.nextInt();
        int[] firstArray  = new int[arrayLength];
        int[] secondArray  = new int[arrayLength];

        System.out.println("First Array");

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter the array element "+ i +" :");
            firstArray[i] = sc.nextInt();
        }

        // Print firstArray
        for (int item: firstArray) {
            System.out.print(item +" ");
        }

        // Print Second Array
        System.out.println("Second Array");

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter the array element :"+ i +" : ");
            secondArray[i] = sc.nextInt();
        }

        // Print firstArray
        for (int item: secondArray) {
            System.out.print(item +" ");
        }

        int[] mergedArray = new int[arrayLength*2];
        int location = 0 ;

        for (int i = 0; i < arrayLength; i++) {
            mergedArray[location] = firstArray[i];
            location++;
            mergedArray[location] = secondArray[i];
            location++;
        }

        System.out.println(mergedArray.length);
        for (int item: mergedArray) {
            System.out.print(item +" ");
        }
    }


    public static ArrayList<Integer> findItem(int[] arrayItems, int key){
        // Search array list to all occurrences of a key.
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < arrayItems.length; i++) {
            if (arrayItems[i] == key){
                indexes.add(i);
            }
        }
        return indexes;
    }

}
