package week3.Section48;

public class StringPool_vs_Heap {
    public static void main(String[] args) {
        String str = "devx";
        String str2 = "devx";
        String str3 = new String ("devx");
        String str4 = new String ("devx");

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        //Output is True because .equals method checks the value and not the memory's location (java heap or string pool)
        System.out.println(str.equals(str4)); // true

        //Output is false because == method checks and compares the memory location (java heap or string pool)
        boolean isEquals = str == str4; // false: because str is in String Pool and str4 is in Java Heap
        System.out.println(isEquals);

        boolean isEquals2 = str == str2;
        System.out.println(isEquals2); //true: because both values are located in the String Pool
    }
}
