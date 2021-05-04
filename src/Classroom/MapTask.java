package Classroom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public  class MapTask {

    static Map<String,String> employees = new HashMap<>();
    //static Map<String,String> employees = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    public static void main(String[] args) {

        /*// Add employees
        employees.put("a1234", "Steve Jobs");
        employees.put("a1235", "Bill Gates");
        employees.put("a1236", "Jeff Bezos");
        employees.put("a1237", "Larry Page");
        employees.put("a1238", "Sergey Brin");
        employees.put(null, "Sergey Brin");

       // System.out.println(employees.size());

        for (Map.Entry<String, String> items :employees.entrySet()){
            System.out.println("Employee Id: "+ items.getKey() +" Name: "+ items.getValue());
        }
        System.out.println(employees.containsKey("A1235".toLowerCase()));*/

        printStudents();
    }


    public static  String translator(String englishKey) {
        HashMap<String, String> dictionary = new HashMap<>();
        String germanWord = dictionary.get(englishKey);
        return Objects.requireNonNullElse(germanWord, "Sorry, I don’t know such a word");
    }

    public static void printStudents(){
        Map<String, Student> students = new HashMap<>();

        students.putIfAbsent("miko", new Student("Miko", "Poland"));
        students.putIfAbsent("christo", new Student("Christo", "Nigeria"));
        students.putIfAbsent("tosin", new Student("Tosin", "Poland"));
        students.putIfAbsent("reza", new Student("reza", "Iraq"));
        students.putIfAbsent("merhawit", new Student("merhawit", "Ethopia"));
        students.putIfAbsent("alex", new Student("Alex", "Germany"));
        students.putIfAbsent("nawar", new Student("Nawar", "Syria"));

        // Prints the student names and their countries
        for (Map.Entry<String, Student> student:students.entrySet()){
            System.out.println("name:"+ student.getKey() + ", country:"+ student.getValue().getStudentCountry());
        }


        // Created a <country, Student> hashmap, and put the entries from the students HashMap
        Map<String, Student> countries = new HashMap<>();
        for (Map.Entry<String, Student> student:students.entrySet()){
            countries.put(student.getValue().getStudentCountry(), student.getValue());
        }

        // Prints the unique countries
        System.out.println("The unique countries are ");
        for (Map.Entry<String, Student> country :countries.entrySet()){
            System.out.println(country.getKey());
        }
    }
}
