package week3.Section51;


public class URL_Encoder {
    public static String encodeURL(String url, String replaceURL) {
        return url.replaceAll(replaceURL, " ");
    }

    public static void main(String[] args) {
        System.out.println(encodeURL("https://www.example.com/programming languages & URL encoding","%20"));
    }
}
