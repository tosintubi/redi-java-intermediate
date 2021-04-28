package setoperations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayOperations {

    public static void main(String[] args) {
        int[] intArray = {2,6,8,2,5,7,8,9,9,0};
        System.out.println(removeDuplicates(intArray));
    }



    public  static  int[] removeDuplicates(int[] arrayList){
        Set<Integer> intSet = new HashSet<>();
        for (int item :arrayList) {
            intSet.add(item);
        }
       int[] uniqueArray = new int[intSet.size()];
        int i = 0;
        for (int item :intSet){
            uniqueArray[i] = item;
            i++;
        }
        return uniqueArray;
    }
}
