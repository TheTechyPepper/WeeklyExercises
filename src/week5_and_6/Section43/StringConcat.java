package week5_and_6.Section43;

public class StringConcat {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Superstars";

        String finalString = str1.concat(str2);
        System.out.println(finalString);

        String finalString2 = str2.concat(str1);
        System.out.println(finalString2);

        String str4 = "Mars";
        str4 = str4.concat(" is future!");
        System.out.println(str4);

        String str5 = "Space X";
        String finalStr5 = str5.concat("::").concat(" is going to take us to Mars");
        System.out.println(finalStr5);

    }
}
