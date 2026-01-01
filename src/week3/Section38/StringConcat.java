package week3.Section38;

public class StringConcat {
    public static void main(String[] args) {
        System.out.println("DeVX" + "School");

        String str1 = "Hello";
        String str2 = "Superstar";

        String finalStr = str1.concat(str2);
        System.out.println(finalStr); // To add a space in the ouput,
                                     // simply add a space "Hello_" or "_Superstar"

        //Reassign a string / update a string
        String str4 = "Mars";
        str4 = str4.concat(" is future!");
        System.out.println(str4);

        //This is called Method Chaining
        //In Strings, we are allowed to call another String method at the end of another String
        String str5 = "Space X";
        String finalStr5 = str5.concat("::").concat(" is going to take us to Mars");
        System.out.println(finalStr5);
    }
}



