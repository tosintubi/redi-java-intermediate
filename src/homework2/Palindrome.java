package homework2;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("MadAm")); // Palindrome
        System.out.println(isPalindrome("SomeWords")); //Not a Palindrome
        System.out.println(isPalindrome("Never Odd or Even")); // Sentence Palindrome

    }

    //One liner!
    public static String isPalindrome(String stringWord){
        return stringWord.equalsIgnoreCase(new StringBuilder(stringWord).reverse().toString())
                 ? "Yes": "No";
    }
}
