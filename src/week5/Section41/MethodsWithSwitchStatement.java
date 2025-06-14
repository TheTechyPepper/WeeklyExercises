package week5.Section41;

public class MethodsWithSwitchStatement {
    public static void main(String[] args) {
        boolean var1 = doesNeedVisa("USA");
        System.out.println(var1);

        boolean var2 = doesNeedVisa("France");
        System.out.println(var2);

    }
    public static boolean doesNeedVisa( String countryResidence) {
        switch (countryResidence) {
            case "USA":
            case "Canada":
                return false;
            default:
                return true;
        }
    }
}
