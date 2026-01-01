package week3.Section51;


public class URL_Encoder {
<<<<<<< HEAD
    public static String encodeURL(String URL) {
        return URL.replaceAll(" ", "%20").replaceAll("\\?", "%3F").replaceAll("&", "%26").replaceAll("=", "%3D");
    }

    public static void main(String[] args) {
        System.out.println(encodeURL("https://www.example.com/programming languages & URL encoding"));
    }
}

=======
    public static String encodeURL(String url, String replaceURL) {
        return url.replaceAll(replaceURL, " ");
    }

    public static void main(String[] args) {
        System.out.println(encodeURL("https://www.example.com/programming languages & URL encoding","%20"));
    }
}
>>>>>>> ad2f88319b49071a7f8e082ad3f92ab9b0eed101
