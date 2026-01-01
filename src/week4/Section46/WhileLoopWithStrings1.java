package week4.Section46;

public class WhileLoopWithStrings1 {
    public static void main(String[] args)
    {

        String str = "Superstar";
        int counter = 8;

        while(counter >= 0)
        {
            System.out.println(str.charAt(counter));
            counter--;
        }
        String str2 = "I Love Java So Much";
        int counter2 = str2.length()-1;

        while(counter2 >= 0)
        {
            System.out.println(str2.charAt(counter2));
            counter2--;
        }
    }
}
