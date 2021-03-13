package homework2;

import java.util.Arrays;
import java.util.Locale;

public class VowelsCounter {

    public static void main(String[] args) {
        String[] testString = {"HEy, this is come random string, doesnt makes sense, but who cares.",
                        "Some other string",
                        "this is a String."};

        for (String str: testString) {
            System.out.println(str + " : "+ countVowels(str) + " vowels");
        }
    }
    public static int countVowels(String str)
    {

        char[] vowels = {'a','e','i','o','u'};
        int count = 0;
        // Convert all to lower case, cause we will check lowerc
        str = str.toLowerCase();

        //TODO: Check more compact and optimal way of comparison.
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}
