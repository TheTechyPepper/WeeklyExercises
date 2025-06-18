package week1_and_2.Section30;

public class Calendar {
    public static void main(String[] args) {
        String meetingName1 = "Daily Standup";
        String startTime1 = "9:15am";
        String endTime1 = "9:45am";
        String meetingName2 = "Test Strategy Meeting";
        String startTime2 = "2:15pm";
        String endTime2 = "3:15pm";

        System.out.printf("%s\t\tStart time: %s\tEnd time: %s", meetingName1, startTime1, endTime1);
        System.out.printf("\n%s\tStart time: %s\tEnd time: %s", meetingName2, startTime2, endTime2);
    }
}
