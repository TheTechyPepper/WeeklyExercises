package week3.Section27;

public class MethodsWithDoubleReturnType {
    public static void main(String[] args) {
        double var = work();
        System.out.println(var);

        double taxToBePaid = calcutaleTax();
        System.out.println(taxToBePaid);
    }

    public static double work() {
        return 2.0;
    }
    public static double calcutaleTax() {
        double salary = 100000;
        double tax = 0.1;

        return salary*tax;
    }
}
