package VowelCount;

public class VowelCount {
    /*Return the number (count) of vowels in the given string.
    We will consider a, e, i, o, u as vowels for this Kata (but not y).
    The input string will only consist of lower case letters and/or spaces.*/
    public static void main(String[] args) {
        System.out.println(getCount("hola mi nombre es"));
    }

    public static int getCount(String str) {
        char[] newStr = str.toCharArray();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int vowelCount = 0;
        for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j < vowels.length; j++) {
                if(newStr[i] == vowels[j]) {
                    vowelCount++;
                }
            }
        }
        return vowelCount;
    }

    /*public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }*/

    /*public static int getCount(String str) {
        int vowelsCount = 0;

        for(char c : str.toCharArray())
            vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;

        return vowelsCount;
    }*/

    /*public static int getCount(String str) {
        return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }*/
}
