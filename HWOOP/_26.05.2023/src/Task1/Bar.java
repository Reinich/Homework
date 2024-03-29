package Task1;

public class Bar extends Product{
    private int kal;
    public Bar(String inputBrand, String inputName, double inputPrice, int kal) {
        super(inputBrand, inputName, inputPrice);
        this.kal = kal;
    }

    public int getKal() {
        return kal;
    }
    public void setKal(int kal) {
        this.kal = kal;
    }
    @Override
    public String displayInfo() {
        return String.format("%s %s - %.2f р. - каллорийность: %s", (name.substring(0, 1).toUpperCase() + name.substring(1)), brand, price, kal);
    }
}
