package week3.Section51;

public class ReplaceLikeWithLove {
    public static String replaceLikeWithLove(String sentence) {
        return sentence.replace("like", "love");
    }

    public static void main(String[] args) {
        System.out.print(replaceLikeWithLove("I like to code like a boss"));

    }
}