package week3.Section52;

public class StringSubstring {
    public static void main(String[] args) {

        String str = "DevXSchool";
        String str2 = str.substring(3);
        System.out.println(str2);

        String str3 = str.substring(4);
        System.out.println(str3);

        String str5 = "Hello Java Superstars, Java is Hard, but it's fun";
        String str6 = str5.substring(23);
        System.out.println(str6);

        String str7 = "hello my dear friend, it's a beautiful day tpday";
        String str8 = str7.substring(22, 38);
        System.out.println(str8);

        int lastIndexOfJava = str5.lastIndexOf("Java");
        int lastIndexOfComma = str5.lastIndexOf(",");
        String str10 = str5.substring(lastIndexOfJava, lastIndexOfComma);
        System.out.println(str10);
    }
}
