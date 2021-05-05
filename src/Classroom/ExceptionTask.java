package Classroom;

import java.time.DateTimeException;

public class ExceptionTask  {

    public static void main(String[] args) {
        checkDate("10/12/2021");
    }

    static void checkDate(String date){
        String[] tokens = date.split("/");
        if (tokens.length != 3){
            throw  new DateTimeException("The String is not in the required format");
        }
        if (tokens[0].length() !=2 ||  tokens[1].length() !=2 || tokens[2].length() !=4){
            throw  new DateTimeException("The String is not in the required format");
        }
        for (String temp : tokens) {
            for (int j = 0; j < temp.length(); j++) {
                char idx = temp.charAt(j);
                if (!(idx >= '0' && idx <= '9')) {
                    throw new DateTimeException("The String is not in the required format");
                }
            }
        }
    }
}

/*

    Write a dateValidator method that accept a string as parameter and
        returns nothing if the string is in the format DD/MM/YYYY otherwise it raises
        a DateTimeException as a checked exception.

*/
