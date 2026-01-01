package PracticeTerminal.RedoCode4Practice.Week_4._5;

public class whileLoopWithString {
    public static void main(String[] args) {

        String str = "Hello Superstar";

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(7));
        System.out.println(str.charAt(8));
        System.out.println(str.charAt(9));
        System.out.println(str.charAt(10));
        System.out.println(str.charAt(11));
        System.out.println(str.charAt(12));
        System.out.println(str.charAt(13));
        System.out.println(str.charAt(14));

        System.out.println("==========================");

        //The code below will produce the same result using a simpler code w/ While Loops

        int counter = 0; // index of H

        while(counter <= 14) {
            System.out.println(str.charAt(counter));
            counter++;
        }

        //write a program that will print out each character in Mars
        System.out.println("=============================");
        String planet = "Mars";
        int charCounter = 0;

        while(charCounter <= 3) {
            System.out.println(planet.charAt(charCounter));
            charCounter++;
        }
    }
}
