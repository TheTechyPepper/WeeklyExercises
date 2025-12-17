package week5.Section44;

public class StringContains {
    public static void main(String[] args) {

        String str = "Hello wedevxer!";

        boolean doesConatinDevx = str.contains("devx");
        System.out.println(doesConatinDevx);

        boolean doesContainHello = str.contains("Hello");
        System.out.println(doesContainHello);

        boolean doesContainAmazon = str.contains("Amazon");
        System.out.println(doesContainAmazon);

    }
}
