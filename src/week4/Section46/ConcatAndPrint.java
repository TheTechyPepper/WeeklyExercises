package week4.Section46;

public class ConcatAndPrint {
    public static void main(String[] args) {
        printConcatenatedString("hello", "world");
    }

    public static void printConcatenatedString(String str1, String str2) {
        //write your code here
        String str3 = str1.concat(str2);
        int concatCounter = 0;

        while (concatCounter < str3.length()) {
            System.out.printf("%c-", str3.charAt(concatCounter));
            concatCounter++;
        }
    }
}