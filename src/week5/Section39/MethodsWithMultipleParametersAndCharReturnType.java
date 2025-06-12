package week5.Section39;

public class MethodsWithMultipleParametersAndCharReturnType {
    public static void main(String[] args) {
        char finalGrade = calculateExamResult(90, 85, 100);
        System.out.println(finalGrade);

        char finalGrade2 = calculateExamResult(60, 80, 70);
        System.out.println(finalGrade2);

        char finalGrade3 = calculateExamResult(100, 20000, 4000);
        System.out.println(finalGrade3);
    }

    public static char calculateExamResult(int score1, int score2, int score3) {
        int avaerage = (score1 + score2 + score3) / 3;
        
        if (avaerage <= 100 && avaerage >= 90) {
            return 'A';
        } else if (avaerage <90 && avaerage >= 80) {
            return 'B';
        } else if (avaerage <80 && avaerage >= 70) {
            return 'C';
        } else if (avaerage <70 && avaerage >= 60) {
            return 'D';
        } else if (avaerage <60) {
            return 'F';
        } else {
            System.out.println("Input scores were inaccurate");
            return '0';
        }
    }
}
