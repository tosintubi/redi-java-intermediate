package homework2;

import java.text.DecimalFormat;
import java.time.Year;

public class IntegerArray {


    public static void main(String[] args) {
        int[] testArray = new int[]{1, 2, 3, 4, 5, 6, 7, 89, 9, 10};
        minimumValueAndAverage(testArray);
    }

    public static void minimumValueAndAverage(int[] intArray) {
        int minimum = Integer.MAX_VALUE; // Set to a very high value
        float sum = 0;
        int index = -1;

        for (int i = 0; i < intArray.length - 1; i++) {
            minimum = Math.min(intArray[i], minimum); //minimum = intArray[i] < minimum ?  intArray[i] : minimum;
            sum += intArray[i];
            index = i;
        }

        System.out.println("Minimum value  is : " + minimum + " and it's  at index : " + index);
        System.out.println("Average of the array is :" + String.format("%.2f", sum / intArray.length));

    }
}
