package homework2;

public  class IntegerArray {


    public static void main(String[] args) {
        int[] testArray = new int[] { -81,2,3,4,5,6,7,-81,9,10 };
        System.out.println(testArray);
    }
    public static int MinimumValue(int[] intArray){

        int minimum = Integer.MAX_VALUE; // Set to a very high value
        int index = -1;
        for (int i = 0; i < intArray.length-1 ; i++) {
            minimum = intArray[i] < minimum ?  intArray[i] : minimum;
            index = i;
        }
        System.out.println(minimum + " is the minimum value and its found at index : "+ index);
        return  minimum;
    }
}
