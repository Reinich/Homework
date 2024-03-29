package Task1;

public class Chips extends Product{
    private String taste;
    public Chips(String inputBrand, String inputName, double inputPrice, String taste) {
        super(inputBrand, inputName, inputPrice);
        this.taste = taste;
    }

    public String getTaste() {
        return taste.toLowerCase();
    }
    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String displayInfo() {
        return String.format("%s %s - %.2f р. - со вкусом %s",(name.substring(0, 1).toUpperCase() + name.substring(1)) ,brand , price, taste.substring(0,1).toUpperCase() + taste.substring(1));
    }
}
