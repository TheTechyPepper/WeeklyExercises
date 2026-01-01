package week3.Section29;

public class methods_Wth_String_Return
    {
        public static void main(String[] args) {
            String var = giveMyName();
            System.out.println(var);

            String var2 = giveMyLastName();
            System.out.println(var2);
    }

    //String
    public static String giveMyName()
    {
        return "Temetrius"; //return
    }

    public static String giveMyLastName()
    {
        return "Peppers";
    }

}
