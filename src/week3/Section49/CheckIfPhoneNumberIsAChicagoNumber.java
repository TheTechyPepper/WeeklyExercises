package week3.Section49;

public class CheckIfPhoneNumberIsAChicagoNumber {
    public static boolean isChicagoPhoneNum(String phoneNumber) {

        if(phoneNumber.startsWith("312") ||
        phoneNumber.startsWith("773")) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean isChicagoOrNot = isChicagoPhoneNum("312-555-1234");
        System.out.println(isChicagoOrNot);

        boolean isChicagoOrNot2 = isChicagoPhoneNum("773-555-5678");
        System.out.println(isChicagoOrNot2);

        boolean isChicagoOrNot3 = isChicagoPhoneNum("630-555-9090");
        System.out.println(isChicagoOrNot3);
    }
}
