package week3.Section50;

public class FirstOccurrenceOfJava {
    public static int findJavaIndex(String str) {
        int i1 = str.indexOf("Java");
        return i1;
    }
    //alternative way of doing it
    // :
    //public static int findJavaIndex(String str) {
    //      String word = "Java";
    //    return str.indexOf(word);
//}
    public static void main(String [] args) {
        int JavaIndex = findJavaIndex("This is a Java program");
        System.out.println(JavaIndex);
    }
}
