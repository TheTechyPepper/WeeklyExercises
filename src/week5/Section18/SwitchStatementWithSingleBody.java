package week5.Section18;

import java.util.Scanner;

public class SwitchStatementWithSingleBody {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textFormat = "gif";

        switch(textFormat) {
            case ".txt":
            case ".doc":
            case ".docx":
                System.out.println("Sending a text file");
                break;
            case "jpg":
            case "png":
            case "gif":
                System.out.println("Sending an image file");
                break;
            case ".mp3":
            case ".wma":
            case ".ogg":
                System.out.println("Sending an audio file");
                break;
            default:
                System.out.println("Invalid input. Unsupported file type");
        }
    }
}
