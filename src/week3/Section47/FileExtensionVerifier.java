package week3.Section47;

public class FileExtensionVerifier {
    public static boolean checkFileExtension(String fileExtension, String expectedExtension) {
        if(fileExtension.equalsIgnoreCase(expectedExtension)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean fileComparison = checkFileExtension(".pdF", ".pdf");
        System.out.println(fileComparison);

        boolean fileComparison2 = checkFileExtension("image.png", ".jpg");
        System.out.println(fileComparison2);
    }
}
