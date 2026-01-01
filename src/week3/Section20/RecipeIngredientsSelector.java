package week3.Section20;

import java.util.Scanner;

public class RecipeIngredientsSelector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String foodStyle = sc.nextLine();
        String VeggieOrMeat = sc.nextLine();

        switch (VeggieOrMeat) {
            case "Vegetarian":
                switch (foodStyle) {
                    case "Italian":
                        System.out.println("Tomatoes, Basil, Mozzarella, Olive Oil, Pasta");
                        break;
                    case "Mexican":
                        System.out.println("Beans, Tomatoes, Avocado, Corn, Tortillas");
                        break;
                    case "Indian":
                        System.out.println("Lentils, Rice, Spinach, Spices, Naan");
                }
                break;
            case "Non-vegetarian":
                switch (foodStyle) {
                    case "Italian":
                        System.out.println("Beef, Tomatoes, Garlic, Parmesan, Pasta");
                        break;
                    case "Mexican":
                        System.out.println("Chicken, Beef, Beans, Salsa, Tortillas");
                        break;
                    case "Indian":
                        System.out.println("Chicken, Lamb, Rice, Curry, Naan");
                }
        }
    }
}
