package NumberToString;

public class NumberToString {
    public static void main(String[] args) {
        System.out.println(numberToString(3));
    }

    public static String numberToString(int num) {
        return String.valueOf(num);
    }

    //Solution with toString
    /*public static String numberToString(int num) {
        return Integer.toString(num);
    }*/

    //Clever solution
    /*public static String numberToString(int num) {
        return ""+num;
    }*/
}
