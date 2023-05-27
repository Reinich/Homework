package Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product bottleOfWater1 = new BottleOfWater("Чистый источник", "Вода", 25, 500);
        Product bottleOfWater2 = new BottleOfWater("Горячий ключ", "Вода", 40, 1000);
        Product bottleOfMilk1 = new BottleOfMilk("Простаквашино", "Молоко", 78, 900, 2.0);
        Product bottleOfWater3 = new BottleOfWater("Чистый источник", "вода", 50, 2000);
        Product bottleOfMilk2 = new BottleOfMilk("Счастливая корова", "Молоко", 78, 900, 1.5);
        Product chocolate1 = new Chocolate("AlpenGold", "шоколад", 59, "Темный");
        Product bar1 = new Bar("O'Zera", "батончик", 21, 350);
        Product chips1 = new Chips("Lays", "чипсы", 101, "сметана с зеленью");
        Product chips2 = new Chips("Русская картошка", "чипсы", 99, "Сыр");
        Product bar2 = new Bar("Fitt", "батончик", 33, 550);
        Product chocolate2 = new Chocolate("AlpenGold", "шоколад", 69, "молочный");

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(chocolate1);
        products.add(bar1);
        products.add(chips1);
        products.add(chips2);
        products.add(bar2);
        products.add(chocolate2);

        System.out.println("Список продуктов: ");
        printProductList(products);
        System.out.println("---------------------------------");



        VendingMachine machine = new VendingMachine(products);
        VendingMachine.getBottleOfWaterRes(5000);
        VendingMachine.getBottleOfMilkRes(2);
        VendingMachine.getChocolateRes("темный");
        VendingMachine.getChipsRes("краб");
        VendingMachine.getBarRes(350);

    }
    static void printProductList(List<Product> products){
        for (Product product: products){
            System.out.println(product.displayInfo());
        }
    }
}