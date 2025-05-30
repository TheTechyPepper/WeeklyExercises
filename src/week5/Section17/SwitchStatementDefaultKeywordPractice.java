package week5.Section17;

public class SwitchStatementDefaultKeywordPractice {
    public static void main(String[] args) {

        char grade = 'F';

        switch(grade) {
            case 'A':
                System.out.println("Excellent WorK!");
                break;
            case 'B':
                System.out.println("Good WorK!");
                break;
            case 'C':
                System.out.println("Average WorK!");
                break;
            case 'D':
                System.out.println("Bad WorK!");
                break;
            case 'F':
                System.out.println("Failed WorK!");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
