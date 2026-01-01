package week3.Section50;

public class LastOccurenceOfProgramming {
    public static int getLastIndexOfProgramming(String str) {
        int i1 = str.lastIndexOf("programming");
        return i1;
    }

    public static void main(String[] args) {
        System.out.println(getLastIndexOfProgramming("I love programming and coding"));
    }
}
