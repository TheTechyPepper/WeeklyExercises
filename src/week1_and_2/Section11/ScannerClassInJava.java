package week1_and_2.Section11;
import java.util.Scanner;

public class ScannerClassInJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String address = input.nextLine();
        String company1 = input.nextLine();

        System.out.println("Welcome " + name);
        System.out.println("Your address is: " + address);
        System.out.println("CEO of " + company1);
    }
}
