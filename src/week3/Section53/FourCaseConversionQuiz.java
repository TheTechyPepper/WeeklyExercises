package week3.Section53;

public class FourCaseConversionQuiz {
    public static String convertTextCase(String sentence, char letter) {
        if(letter == 'U') {
            return sentence.toUpperCase();
        }
        else {
            return sentence.toLowerCase();
        }
    }

    public static void main(String[] args) {
        System.out.println(convertTextCase( "CoMpUtEr ScIeNcE", 'U'));
        System.out.println(convertTextCase("CoMpUtEr ScIeNcE", 'L'));
    }
}
