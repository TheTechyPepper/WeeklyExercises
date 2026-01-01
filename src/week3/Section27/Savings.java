package week3.Section27;

public class Savings {
    public static void main(String[] args) {
        Savings obj = new Savings();
        double savingTotal = obj.calculateSavings();
        System.out.printf("%.2f", savingTotal);
    }

    public double calculateSavings() {
        double salary = 130000;
        double savingsPercentage = 0.1;

        return salary * savingsPercentage;
    }
}
