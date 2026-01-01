package week4.Section46;

public class PrintOutAllCharactersOf_A_String {
    public static void main(String[] args) {

       splitCharacters("Wedevx");

    }

    public static void splitCharacters(String str) {
        int counter = 0;

        while (counter < str.length()) {
            System.out.println(str.charAt(counter));
            counter++;
        }
    }
}