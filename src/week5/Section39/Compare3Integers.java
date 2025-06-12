package week5.Section39;

public class Compare3Integers {
    public static void main(String[] args) {
        char numCompare = compareIntegers(22, 44, -150);
        System.out.println(numCompare);

        char numCompare2 = compareIntegers(1, 2, 3);
        System.out.println(numCompare2);

        char numCompare3 = compareIntegers(1000, 2000, 33548);
        System.out.println(numCompare3);

    }

    public static char compareIntegers(int num1, int num2, int num3) {
        int sumOfFirstTwoNum = num1 + num2;

        if (sumOfFirstTwoNum > num3) {
            return 'P';
        } else if (sumOfFirstTwoNum < num3) {
            return 'N';
        }else {
            return 'E';
        }
    }
}
