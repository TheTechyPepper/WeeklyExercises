package week3.Section49;

public class StringStartsWithAndEndsWith {
    public static void main(String[] args) {
        String str = "Hello WeDevX";
        boolean doesStrStartWithHello = str.startsWith("Hello");
        System.out.println(doesStrStartWithHello);

        String str4 = "sent to Steve Harvey: Hi Steve I am a big fan of yours";
        boolean beginsWith = str4.startsWith("sent to Steve Harvey");
        System.out.println(beginsWith);

        String str5 = "Apple is the Biggest Company";
        boolean isApple = str5.endsWith("Company");
        System.out.println(isApple);

        boolean isBiggest = str5.endsWith("Biggest");
        System.out.println(isBiggest);
    }
}
