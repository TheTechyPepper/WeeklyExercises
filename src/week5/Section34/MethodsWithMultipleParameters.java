package week5.Section34;

public class MethodsWithMultipleParameters {
    public static void main(String[] args) {
        printUserInfo("Temetrius", 37);
        printUserInfo("Me-Me", 38);
    }

    public static void printUserInfo(String name, int age) {
        System.out.println("Welcome " + name);
        System.out.println("Your age is " + age);

    }
}
