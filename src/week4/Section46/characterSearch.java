package week4.Section46;

public class characterSearch {
    public static void main(String[] args) {

        int returnResult = searchCharacter("hello world", 'l');

        System.out.print(returnResult);
    }
    public static int searchCharacter (String str, char letter) {
        int indexCounter = 0;
        int timesFound = 0;

        while(indexCounter < str.length()) {
            if(str.charAt(indexCounter) == letter) {
                timesFound++;
            }
            indexCounter++;
        }
        return timesFound;
    }
}
