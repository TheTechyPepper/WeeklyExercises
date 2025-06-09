package week5.Section33;

public class ParametersPractice1 {
    public static void main(String[] args) {


        printUserName("Temetrius");
        printUserName("Jackie");
        printUserName("Ann");
    }

    public static void printUserName(String var) {
        System.out.println("Welcome " + var);
        //Return method is not used because this code is using void
    }
}
