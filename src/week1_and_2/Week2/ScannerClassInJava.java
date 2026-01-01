package week1_and_2.Week2;
import java.util.Scanner;


public class ScannerClassInJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String address = input.nextLine();

        System.out.println("Welcome " + name);
    }
}
