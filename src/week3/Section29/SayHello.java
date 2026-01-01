package week3.Section29;

public class SayHello {
    public static void main(String[] args) {
        String firstName = sayHello("John");
        System.out.println(firstName);

    }
    public static String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
