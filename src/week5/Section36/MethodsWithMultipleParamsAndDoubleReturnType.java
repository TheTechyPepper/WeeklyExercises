package week5.Section36;

import week5.Section30.MethodsWithCharReturnType;

public class MethodsWithMultipleParamsAndDoubleReturnType {
    public static void main(String[] args) {
        double var = subtract(100, 50);
        System.out.println(var);

        MethodsWithMultipleParamsAndDoubleReturnType obj = new MethodsWithMultipleParamsAndDoubleReturnType();
        double taxAmount = obj.calculateTax(100000, 10);
        System.out.println(taxAmount);

        double taxAmount2 = obj.calculateTax(500000, 15);
        System.out.println(taxAmount2);
    }
    // Static
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    //Instance
    public double calculateTax(double salary, int percent) {
        //100000 + (10/100)
        //10/100 => 0.1
        //10000

        return salary * (percent/100.0);
    }
}
