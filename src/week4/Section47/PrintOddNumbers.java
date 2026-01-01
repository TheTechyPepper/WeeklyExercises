package week4.Section47;

public class PrintOddNumbers {
    public static void main(String[] args) {

        int results = printOddNumbers();
    }

    public static int printOddNumbers() {
        int oddNumberCounter = 3;

        while(oddNumberCounter < 22) {
            System.out.println(oddNumberCounter);
            oddNumberCounter += 2;
        }
        return oddNumberCounter;
    }
}
