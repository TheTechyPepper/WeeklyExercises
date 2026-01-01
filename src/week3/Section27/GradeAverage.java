package week3.Section27;

public class GradeAverage {
    public static void main(String[] args) {
        GradeAverage obj = new GradeAverage();
        double avgTotal = obj.findAverage();
        System.out.println(avgTotal);
    }

    public double findAverage() {
        double num1 = 90.5;
        double num2 = 77.6;
        double num3 = 88.0;

        return (num1 + num2 + num3) / 3;
    }
}
