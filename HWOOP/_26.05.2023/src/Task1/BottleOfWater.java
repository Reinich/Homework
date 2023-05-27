package Task1;

public class BottleOfWater extends Product{
    private double volume;

    public BottleOfWater(String inputBrand, String inputName, double inputPrice, int volume) {
        super(inputBrand, inputName, inputPrice);
        this.volume = volume;
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("%s %s - %.2f р. - объемом %.2f мл", (name.substring(0, 1).toUpperCase() + name.substring(1)), brand, price, volume);
    }
}
