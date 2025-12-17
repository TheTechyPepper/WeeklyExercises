package week5_and_6.Section16;

public class SwitchStatementLesson {
    public static void main(String[] args) {
        int num = 2;

        //print out Hello if the num is 1
        //Switch statements are always comparing if the variable expression and the case value is equal
        switch(num) {
            case 1:
                System.out.println("Hello");
                System.out.println("Me-Me");
                //the body of the case goes until the next case, or default
                //or the end of the switch statement
                break;
            case 2:
                System.out.println("Hello Mars");
                break;
            case 3:
                System.out.println("Jupiter");
                break;
                //if the case does not end with a 'break' statement, the code will continue to print out each statement
                //below it until the code hits the break statement
        }
    }
}
