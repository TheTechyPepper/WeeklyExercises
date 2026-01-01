package week4.Section5;

public class WhileLoopsWithStrings {
    public static void main(String[] args) {
        String str = "Hello Superstar";

        int counter = 0;

        while (counter <= 14) {
            System.out.println(str.charAt(counter));
            counter++;
        }
        System.out.println("===============================");
         String str2 = "Mars";

        int counter2 = 0;

        while (counter2 <= str2.length()-1) {
            System.out.println(str2.charAt(counter2));
            counter2++;
        }
    }
}
