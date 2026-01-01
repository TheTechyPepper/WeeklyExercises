package week4.Section47;

public class PrintOutTheMultiplesOf_5_From_5_To_50 {
    public static void main(String[] args) {

        incrementBy5();
    }

    public static void incrementBy5() {
        int countBy5 = 5;
        while (countBy5 < 51) {
            System.out.println(countBy5);
            countBy5 += 5;
        }
    }
}
