package week5_and_6.Section41;

public class DetermineTheWeather {
    public static void main(String[] args) {
        DetermineTheWeather obj = new DetermineTheWeather();
        String weather = obj.determineWeather(-20);
        System.out.println(weather);

    }
    public String determineWeather(int weatherTemp) {
        switch (weatherTemp) {
            case 20:
                return "Sunny";

            case 10:
                return "Cloudy";

            case 0:
                return "Snowy";

            case -20:
                return "Freezing";

            default:
                return "Not found";
        }
    }
}
