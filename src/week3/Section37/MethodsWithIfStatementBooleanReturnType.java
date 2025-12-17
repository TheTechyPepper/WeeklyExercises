package week5_and_6.Section37;

public class MethodsWithIfStatementBooleanReturnType {
    public static void main(String[] args) {
        boolean scenario1  =isEligibleForDiscount(20, true);
        System.out.println(scenario1);
    }

    public static boolean isEligibleForDiscount(double amountSpent, boolean isMembershipMenber) {
        if(amountSpent > 100 || isMembershipMenber) {
            return true;
        }
        else {
            return false;
        }
    }
}
