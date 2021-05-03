package Classroom;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public  class MapTask {

    static Map<String,String> employees = new HashMap<>();
    //static Map<String,String> employees = new TreeMap<>();
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
    }
}
