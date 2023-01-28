package EvenOrOdd;

public class EvenOrOdd {
    /* Create a function that takes an integer as an argument
    and returns "Even" for even numbers or "Odd" for odd numbers.*/
    public static void main(String[] args) {
        System.out.printf(even_or_odd(0));
    }

    public static String even_or_odd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Solution with ternary operator
    /* public static String even_or_odd(int number) {
        return (number%2 == 0) ? "Even" : "Odd";
    }*/

    //Creative solution
    /*public static String even_or_odd(int number) {
        return (number & 1) == 0 ? "Even" : "Odd";
    }*/
}