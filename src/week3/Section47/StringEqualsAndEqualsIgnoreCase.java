package week3.Section47;

public class StringEqualsAndEqualsIgnoreCase {
    public static void main(String[] args) {
        String str = "hello";
        boolean isEquals = str.equals("hi");
        System.out.println(isEquals);

        String str2 = "devx";
        boolean isEquals2 = str2.equals("devx");
        System.out.println(isEquals2);

        boolean isEquals3 = str2.equals("Devx");
        System.out.println(isEquals3);

        String str4 = "Mars";
        boolean isEquals4 = str4.equalsIgnoreCase("mars");
        System.out.println(isEquals4);

        String str5 = "MaRS";
        boolean isEquals5 = str4.equalsIgnoreCase("mars");
        System.out.println(isEquals5);

    }

}
