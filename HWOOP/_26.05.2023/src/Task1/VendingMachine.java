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
}
