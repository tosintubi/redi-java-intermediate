package Classroom;

public class Recursion {
    public static void main(String[] args) {
        int[] testArray = {1,6,4,2,3,7,3,2,2,8,9,4,2,-3,9};
        System.out.println(sumArray(testArray));

        System.out.println(sumArrayRecursion(testArray,testArray.length));

    }


    public static int sumArray(int[] intArray) {
        int sum = 0;
        for (int i: intArray) {
            sum += i;
        }
        return sum;
    }

    public static  int sumArrayRecursion(int[] intArray, int arrayLength) {
        if (arrayLength <= 0)
            return 0;
        return sumArrayRecursion(intArray, arrayLength - 1) + intArray[arrayLength - 1];

    }
}

