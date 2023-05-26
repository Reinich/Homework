package Task1;

public class BottleOfMilk extends Product{
    private double volume;
    private double fatContent;

    public BottleOfMilk(String inputBrand, String inputName, double inputPrice, double volume, double fatContent) {
        super(inputBrand, inputName, inputPrice);
        this.volume = volume;
        this.fatContent = fatContent;
    }

    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    public double getFatContent() {
        return fatContent;
    }
    public void setFatContent(double fatContent) {
        this.fatContent = fatContent;
    }

    @Override
    public String displayInfo() {
        return String.format("%s %s - %.2f р. - объемом %.2f мл - жирность: %.1f",name.substring(0,1).toUpperCase() + name.substring(1), brand, price, volume, fatContent);
    }

    public static void getBottleOfMilk(double fat){
        BottleOfMilk bottleOfMilkRes = VendingMachine.getBottleOfMilk(fat);
        if (bottleOfMilkRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfMilkRes.displayInfo());
        }else {
            System.out.println("Такой бутылки нет в наличии");
        }
    }

}
