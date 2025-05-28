public class CodePracticing {
    public static void main(String[] aregs) {
        int hour = 11;
        int minute = 59;
        int second = 53;
        String period = "PM";

        System.out.printf("%d:%02d:%02d %s", hour, minute, second);

// Step 2 to 7: Increment seconds and print
        ++second;
        System.out.printf("\n%d:%02d:%02d %s", hour, minute, second);
        ++second;
        System.out.printf("\n%d:%02d:%02d %s", hour, minute, second);
        ++second;
        System.out.printf("\n%d:%02d:%02d %s", hour, minute, second);
        ++second;
        System.out.printf("\n%d:%02d:%02d %s", hour, minute, second);
        ++second;
        System.out.printf("\n%d:%02d:%02d %s", hour, minute, second);
        ++second;
        System.out.printf("\n%d:%02d:%02d %s", hour, minute, second);

// Step 8: Reset second and increment minute manually
        second = 0;
        ++minute;
        System.out.printf("\n%d:%02d:%02d %s", hour, minute, second);

// Step 9: Reset minute, increment hour, switch period
        minute = 0;
        ++hour;
        period = "AM";
        System.out.printf("\n%d:%02d:%02d %s", hour, minute, second);

// Print final message
        System.out.println("\nHappy New Year! Let's make this year our best year yet. Let's set goals that scare us, take massive action towards them, and refuse to settle for anything less than our absolute best. Remember, success is your duty, your obligation, and your responsibility. Let's dominate our goals and make this year one for the record books. Let's do whatever it takes to make it happen!");

    }
}
