package week4.Section47;

public class WhileLoopsIncrementBy2 {
    public static void main(String[] args) {
        //Write a program that prints 1-3-5-7-9
        System.out.println(1);
        System.out.println(3);
        System.out.println(5);
        System.out.println(7);
        System.out.println(9);
        System.out.println("======================");

        int counter = 1;

        while(counter <= 9) {
            System.out.println(counter);
            counter+=2;
        }
        System.out.println("=====================");
        //print out even numbers from 0-10
        //0-2-4-6-8-10
        int counter2 = 0;

        while(counter2 < 11) {
            System.out.println(counter2);
            counter2+=2;
        }
    }
}
