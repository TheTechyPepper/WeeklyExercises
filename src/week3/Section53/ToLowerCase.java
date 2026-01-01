package week3.Section53;

public class ToLowerCase {
    public static String convertToLowerCase(String sentence) {
        return sentence.toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(convertToLowerCase("I LOvE tO CodE"));
        System.out.println(convertToLowerCase("JAVA iS aN ObJEcT oRieNTed PrOGraMMiNG LaNGuaGE"));
        System.out.println(convertToLowerCase("I aM A sENiOr sOFtware eNgINeeR"));
    }
}
