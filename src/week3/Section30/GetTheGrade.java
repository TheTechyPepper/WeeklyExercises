package week3.Section30;

public class GetTheGrade {
    public static char getGrade(double studentCompletionPercentage) {
        if (studentCompletionPercentage >= 90) {
            return 'A';
        } else if (studentCompletionPercentage < 90 && studentCompletionPercentage >= 80) {
            return 'B';
        } else if (studentCompletionPercentage < 80 && studentCompletionPercentage >= 70) {
            return 'C';
        } else if (studentCompletionPercentage < 70 && studentCompletionPercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        double studentPerformance = 85.0;
        char grade = getGrade(studentPerformance);

        System.out.println("The student's grade is " + grade);
    }
}
