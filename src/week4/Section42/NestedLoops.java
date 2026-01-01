package week4.Section42;

public class NestedLoops {
    public static void main(String[] args) {

        int counter1 = 1;
        int counter2 = 1;

        while(counter1 <= 3) {
            while (counter2 <= 2) {
                System.out.println("Surerstar");
                counter2++;
            }
            counter2 = 1;
            counter1++;
        }
    }
}
