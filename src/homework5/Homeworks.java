package homework5;

public class Homeworks {

    public static void main(String[] args) {

    }

    /*
    Write a program to find the  smallest element in an array of integers.
    */
    public static int smallest (int[] intArray){

        int min = Integer.MAX_VALUE; // Assumes MinValue is the largest integer
        for (int element :intArray ) {
            min = (min <= element) ? min : element; // If minimum < element, then minimum otherwise the element is the smallest
        }
        return  min;
    }

    /* Write a program to find the  smallest element in an array list of integers */



}
