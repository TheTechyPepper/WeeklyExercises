package PracticeTerminal;

public class lengthPractice {

    public static void main(String[] args) {

        String str = "Mars";
        int counter = 0;

        while(counter <= str.length()-1) {
            System.out.println(str.charAt(counter));
            counter++;
        }
    }
}
