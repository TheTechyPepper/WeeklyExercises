package week3.Section51;


public class URL_Encoder {
    public static String encodeURL(String URL) {
        return URL.replaceAll(" ", "%20").replaceAll("\\?", "%3F").replaceAll("&", "%26").replaceAll("=", "%3D");
    }

    public static void main(String[] args) {
        System.out.println(encodeURL("https://www.example.com/programming languages & URL encoding"));
    }
}

