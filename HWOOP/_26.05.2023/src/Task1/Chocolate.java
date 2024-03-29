package Task1;

public class Chocolate extends Product{
    private String type;
    /**Инициализация шоколада*/
    public Chocolate(String inputBrand, String inputName, double inputPrice, String type) {
        super(inputBrand, inputName, inputPrice);
        this.type = type.substring(0,1).toUpperCase() + type.substring(1);
    }

    public String getType() {
        return type.toLowerCase();
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String displayInfo() {
        return String.format("%s %s - %s - %.2f р.", type, name,brand, price);
    }

}
