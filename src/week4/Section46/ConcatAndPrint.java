package week4.Section46;

public class ConcatAndPrint {
    public static void main(String[] args) {
<<<<<<< HEAD
        printConcatenatedString("hello", "world");
    }

    public static void printConcatenatedString(String str1, String str2) {
=======
      printConcatenatedString("hello", "world");
      printConcatenatedString("\nJava", "is easy");
    }

    public static void printConcatenatedString(String str1, String str2){
>>>>>>> ad2f88319b49071a7f8e082ad3f92ab9b0eed101
        //write your code here
        String str3 = str1.concat(str2);
        int concatCounter = 0;

<<<<<<< HEAD
        while (concatCounter < str3.length()) {
            System.out.printf("%c-", str3.charAt(concatCounter));
            concatCounter++;
        }
    }
}
=======
        while(concatCounter < str3.length()) {
            System.out.printf("%c-", str3.charAt(concatCounter));
            concatCounter++;
        }

    }
}
>>>>>>> ad2f88319b49071a7f8e082ad3f92ab9b0eed101
