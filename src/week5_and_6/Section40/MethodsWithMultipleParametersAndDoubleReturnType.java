package week5_and_6.Section40;

public class MethodsWithMultipleParametersAndDoubleReturnType {
    public static void main(String[] args) {
        double amount = calculateTax(100000, true);
        System.out.println(amount);

        double amount2 = calculateTax(100000, false);
        System.out.println(amount2);

        double amount3 = calculateTax(90000, true);
        System.out.println(amount3);
    }

    public static double calculateTax(double salary, boolean isMarried) {
        if (salary < 100000 && isMarried) {
            return salary * 0.05;
        } else if (salary < 100000 && !isMarried) {
            return salary * 0.08;
        } else if (salary >= 100000 && isMarried ) {
            return salary * 0.1;
        }else if (salary >= 100000 && !isMarried) {
            return salary * 0.15;
        } else {
            return 0;
        }
    }
}
