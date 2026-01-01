package week3.Section43;

public class GreetingGenerator {
    public static String generateGreeting(String name) {
        String str = "Hello, ";
        String str2 = str.concat(name).concat("!");
        return str2;
    }

    public static void main(String[] args) {
        String greetMessage = generateGreeting("Alice");
        System.out.println(greetMessage);
    }
}
