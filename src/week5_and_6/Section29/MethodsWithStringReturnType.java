package week5_and_6.Section29;

public class MethodsWithStringReturnType {
    public static void main(String[] args) {
        String obj = giveMyName();
        System.out.println(obj);

        String objLastName = giveMyLastName();
        System.out.println(objLastName);

        String elonFullName = printElonMusk();
        System.out.println(elonFullName);
    }


    public static String giveMyName() {
        return "Temetrius"; // return statement is not System.out.println(); Therefore it will not print out anything
    }

    public static String giveMyLastName() {
        return "Peppers";
    }

    public static String printElonMusk() {
        String firstName = "Elon";
        String lastName = "Musk";

        return firstName + " " + lastName;
    }
}