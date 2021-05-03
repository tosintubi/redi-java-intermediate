package Classroom;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public  class MapTask {

    static Map<String,String> employees = new HashMap<>();
    //static Map<String,String> employees = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    public static void main(String[] args) {

        // Add employees
        employees.put("a1234", "Steve Jobs");
        employees.put("a1235", "Bill Gates");
        employees.put("a1236", "Jeff Bezos");
        employees.put("a1237", "Larry Page");
        employees.put("a1238", "Sergey Brin");

       // System.out.println(employees.size());

        for (Map.Entry<String, String> items :employees.entrySet()){
            System.out.println("Employee Id: "+ items.getKey() +" Name: "+ items.getValue());
        }
        System.out.println(employees.containsKey("A1235".toLowerCase()));

    }


    public static  String translator(String englishKey) {
        HashMap<String, String> dictionary = new HashMap<>();
        String germanWord = dictionary.get(englishKey);
        return Objects.requireNonNullElse(germanWord, "Sorry, I don’t know such a word");
    }
}
