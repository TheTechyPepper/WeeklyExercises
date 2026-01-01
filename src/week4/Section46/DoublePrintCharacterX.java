package week4.Section46;

public class DoublePrintCharacterX {
    public static void main(String[] args) {

        printStringWithX("Xerox");
        printStringWithX("\nExtra");
        printStringWithX("\nJava is eXcellent.");
    }

    public static void printStringWithX(String input) {
        int xCounter = 0;

        while (xCounter < input.length()) {
            System.out.print(input.charAt(xCounter));

            if(input.charAt(xCounter) == 'x' || input.charAt(xCounter) == 'X') {
                System.out.print(input.charAt(xCounter));
            }
            xCounter++;
        }
    }
}