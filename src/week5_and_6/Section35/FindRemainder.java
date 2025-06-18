package week5_and_6.Section35;

public class FindRemainder {
    public static void main(String[] args) {
        int numRemainder = findRemainder(10, 3);
        System.out.println(numRemainder);
    }

    public static int findRemainder(int param1, int param2) {
        int numRemainder = param1 % param2;
        return numRemainder;
    }
}
