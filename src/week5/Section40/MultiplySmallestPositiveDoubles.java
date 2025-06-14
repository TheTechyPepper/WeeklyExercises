package week5.Section40;

public class MultiplySmallestPositiveDoubles {
    public static void main(String[] args) {
        double percentage = calculateFundraisingPercentage(2500.0, 10000.0);
        System.out.println(percentage);

    }
    public static double calculateFundraisingPercentage(double amountRaised, double fundRaisingGoal) {
        return (amountRaised / fundRaisingGoal) * 100;
    }
}
