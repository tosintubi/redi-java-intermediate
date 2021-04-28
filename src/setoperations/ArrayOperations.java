package setoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayOperations {


    public int[] removeDuplicates(int[] arrayList){
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
