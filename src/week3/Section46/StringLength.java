package week3.Section46;

public class StringLength {
    public static void main(String[] args) {

        String str = "devx";
        int strlength = str.length();
        System.out.println(strlength);

        String str2 = "Hello wedevx";
        int str2length = str2.length();
        System.out.println(str2length);

        String str3 = "Hello wedevx superstar, let's keep building our bright future together!";
        int str3length = str3.length();
        System.out.println(str3length);

        char w = str2.charAt(6);
        System.out.println(w);

        char lastCharacter = str3.charAt(str3.length() - 1);
        System.out.println(lastCharacter);

        String str4 = "Elon Musk invested $300mm into SpaceX and he almost failed at it";
        char lastChar4 = str4.charAt(str4.length() - 1);
        System.out.println(lastChar4);
    }
}
