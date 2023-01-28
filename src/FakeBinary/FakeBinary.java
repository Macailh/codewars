package FakeBinary;

public class FakeBinary {
    /*Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
    Return the resulting string.
    Note: input will never be an empty string*/
    public static void main(String[] args) {
        System.out.println(fakeBin("123517"));
    }

    public static String fakeBin(String numberString) {
        StringBuilder fakeBinNum = new StringBuilder();
        for(char c: numberString.toCharArray()){
            if (c >= '5') {
                fakeBinNum.append('1');
            } else {
                fakeBinNum.append('0');
            }
        }
        return fakeBinNum.toString();
    }

    //Solution with Regex
    /*public static String replaceDigits(String input) {
        return input.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }*/
}
