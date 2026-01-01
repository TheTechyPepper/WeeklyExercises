package week3.Section51;

public class RemoveASubstring {
    public static String removeSubstring(String str, String toBeRemoved) {
        return str.replace(toBeRemoved, "");
    }

    public static void main(String[] args) {
        System.out.println(removeSubstring("oscar world", "o"));
        System.out.println(removeSubstring("this is a test", "is"));
        System.out.println(removeSubstring("banana", "a"));
        System.out.println(removeSubstring("mississippi", "ssi"));
        System.out.println(removeSubstring("hello", "z"));
    }
}


