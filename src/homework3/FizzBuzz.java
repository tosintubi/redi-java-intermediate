package homework3;

public class FizzBuzz {
    public static void main(String[] args) {
        //optimalFizBuzz();
        FizBuzz();
    }


    public static void FizBuzz() {
        for (int i = 1; i < 501; i++) {
            if ((i % 3 == 0) && (i % 5 == 0))
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }

    public static void optimalFizBuzz() {

        for (int i = 1; i <= 501; ++i) {
            Boolean fizz = i % 3 == 0;
            Boolean buzz = i % 5 == 0;

            if (fizz && buzz) // MOD 15
            {
                System.out.println("FizzBuzz");
            } else if (fizz) {
                System.out.println("Fizz");
            } else if (buzz) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}




