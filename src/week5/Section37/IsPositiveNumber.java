package week5.Section37;

public class IsPositiveNumber {
    public static void main(String[] args) {
        boolean positiveOrNegativeNum = isPositive(5);
        System.out.println(positiveOrNegativeNum);

    }

    public static boolean isPositive(int param1) {
        boolean positiveNum = (param1 > 0);
        if (param1 > 0) {
            return true;
        }
        else {
            return false;
        }
    }
}


