package week4.Section42;

public class NestedWhileLoops {

    public static void main(String[] args) {

        int counter1 = 1;
        int counter2 = 1;

        while(counter1<=3) {
            while(counter2<= 2) {
                System.out.println("Superstar");
                counter2++;
            }
            counter2 = 1; //Resetting counter2 enable the inner loop to run twice before the outer loop is executed
            counter1++;
        }
    }
}
