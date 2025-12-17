package week5_and_6.Section30;

public class MethodsWithCharReturnType {
    public static void main(String[] args) {
        MethodsWithCharReturnType obj = new MethodsWithCharReturnType();
        char var = obj.work();
        System.out.println(var);

        char gender = obj.getGender();
        System.out.println(gender);
    }

    public char work() {
        return 'A';
    }

    public char getGender() {
        return 'F';
    }
}
