package week3.Section51;

public class TextHighlighter {
    public static String highlightText(String sentence, String replaceStr) {
        return sentence.replaceAll(replaceStr, "<span>" + replaceStr + "</span>");
    }

    public static void main(String[] args) {
        System.out.println(highlightText("Java is a versatile programming language. Java is widely used for web development.", "Java"));
    }
}
