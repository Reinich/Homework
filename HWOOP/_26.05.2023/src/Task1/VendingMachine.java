package Task1;

import Task1.*;

import java.util.List;

public class VendingMachine {
    static private List<Product> products;
    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public static BottleOfWater getBottleOfWater(double volume){
        for (Product product: products){
            if (product instanceof BottleOfWater){
                if (((BottleOfWater) product).getVolume() == volume){
                    return (BottleOfWater)product;
                }
            }
        }
        return null;
    }
    public static BottleOfMilk getBottleOfMilk(double fat){
        for (Product product: products){
            if (product instanceof BottleOfMilk){
                if (((BottleOfMilk) product).getFatContent() == fat){
                    return (BottleOfMilk)product;
                }
            }
        }
        return null;
    }
    public static Chocolate getChocolate(String type){
        for (Product product: products){
            if (product instanceof Chocolate){
                if (((Chocolate) product).getType().equals(type)){
                    return (Chocolate)product;
                }
            }
        }
        return null;
    }
    public static Chips getChips(String taste){
        for (Product product: products){
            if (product instanceof Chips){
                if (((Chips) product).getTaste().equals(taste)){
                    return (Chips)product;
                }
            }
        }
        return null;
    }
    public static Bar getBar(int kal){
        for (Product product: products){
            if (product instanceof Bar){
                if (((Bar) product).getKal() == kal){
                    return (Bar)product;
                }
            }
        }
        return null;
    }


    public static void getBarRes(int kal){
        Bar barRes = VendingMachine.getBar(kal);
        if (barRes != null){
            System.out.println("Вы купили: ");
            System.out.println(barRes.displayInfo());
        }else {
            System.out.println("Такого батончика нет в наличии");
        }
    }
    public static void getChipsRes(String taste){
        Chips chipsRes = VendingMachine.getChips(taste);
        if (chipsRes != null){
            System.out.println("Вы купили: ");
            System.out.println(chipsRes.displayInfo());
        }else {
            System.out.println("Таких чипсов нет в наличии");
        }
    }
    public static void getChocolateRes(String type){
        Chocolate chocolateRes = VendingMachine.getChocolate(type);
        if (chocolateRes != null){
            System.out.println("Вы купили: ");
            System.out.println(chocolateRes.displayInfo());
        }else {
            System.out.println("Такой шоколадки нет в наличии");
        }
    }
    public static void getBottleOfMilkRes(double fat){
        BottleOfMilk bottleOfMilkRes = VendingMachine.getBottleOfMilk(fat);
        if (bottleOfMilkRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfMilkRes.displayInfo());
        }else {
            System.out.println("Такой бутылки нет в наличии");
        }
    }
    public static void getBottleOfWaterRes(double volume){
        BottleOfWater bottleOfWaterRes = VendingMachine.getBottleOfWater(volume);
        if (bottleOfWaterRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        }else {
            System.out.println("Такой бутылки нет в наличии");
        }
    }

}
