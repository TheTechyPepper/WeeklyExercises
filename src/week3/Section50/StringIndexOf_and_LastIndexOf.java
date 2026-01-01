package week3.Section50;

public class StringIndexOf_and_LastIndexOf {

    //indexOf method:
    public static void main(String[] args) {
        String str = "Hello Superstar of wedevx";
        int indexOfS = str.indexOf("Superstar");
        System.out.println(indexOfS);

        int indexOfOf = str.indexOf("of");
        System.out.println(indexOfOf);

        int indexOfMars = str.indexOf("mars");
        System.out.println(indexOfMars);

        //indexOf method w 2 param (String str, int i..)
        String str5 = "Mars, SpaceX, DevX, Developer, Mars";
        int i5 = str5.indexOf("Mars", 6);
        System.out.println(i5);

        int i6 = str5.indexOf("Dev", 16);
        System.out.println(i6);

        //int lastIndexOf(String str)
        String str7 = "Play, Work, Read, Sleep, Eat, Party, Study, Repeat";
        int i7 = str7.lastIndexOf("y");
        System.out.println(i7);

        int i8 = str7.lastIndexOf("at");
        System.out.println(i8);
    }
}
