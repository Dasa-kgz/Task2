import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = sc.nextLine();
        System.out.println("Ваш возраст:");
        int age = sc.nextInt();
        String[][] products = {
                {"Pepsi", "50", "false"},
                {"Beer", "100", "true"},
                {"Wine", "500", "true"},
                {"Coca-Cola", "50", "false"}
        };
        for (String[] product : products) {
            boolean isAlcohol = Boolean.parseBoolean(product[2]);
            if (isAlcohol) {
                int ageLimit = 18;

                if (age < ageLimit) {
                    System.out.println(name + ", вам нельзя покупать " + product[0] + ", потому что вы моложе " + ageLimit + " лет");
                } else {
                    System.out.println(name + ", вы купили " + product[0] + " за " + product[1] + " рублей");
                }
            } else {
                System.out.println(name + ", вы купили " + product[0] + " за " + product[1] + " рублей");
            }
        }
    }
}