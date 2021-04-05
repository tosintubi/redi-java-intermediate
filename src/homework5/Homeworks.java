package homework5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homeworks {

    public static void main(String[] args) {

        int[] sampleArray = {-1, 0, 4, 3, 8, 6, -2};
        smallestSecondElement(sampleArray);
        secondMost(sampleArray);
    }

    /* Write a program to find the  smallest element in an array of integers.  */
    public static int smallestArray(int[] intArray) {

        int min = Integer.MAX_VALUE; // Assumes MinValue is the largest integer
        for (int element : intArray) {
            min = Math.min(min, element);
            //min = (min <= element) ? min : element; // If minimum < element, then minimum otherwise the element is the smallest
        }
        return min;
    }

    /* Write a program to find the  smallest element in an array list of integers */
    public static int smallestArrayList(ArrayList<Integer> arrayList) {
        return Collections.min(arrayList);
    }


    public static void smallestSecondElement(int[] intArray) {
        System.out.println("Original numeric array : " + Arrays.toString(intArray));
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == min) {
                second_min = min;
            } else if (intArray[i] < min) {
                second_min = min;
                min = intArray[i];
            } else if (intArray[i] < second_min) {
                second_min = intArray[i];
            }

        }
        System.out.println("Second lowest number is : " + second_min);
    }


    // Simple implementation. Sort the array in desc(or asc, if ) order then pick the next most highest or smallest element
    public static void secondMost(int[] intArray) {
        /*if (desc != true) // ascending order
            Arrays.sort(intArray);
        else
            Arrays.sort(intArray, Collections.reverseOrder());// descending order*/
        Arrays.sort(intArray);
        System.out.println("Second lowest number is : " + intArray[1]);

    }
}