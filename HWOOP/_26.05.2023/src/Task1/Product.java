package Task1;


public class Product {
    /**
     * Класс Продукт
     * @param name наименование продукта
     * @param brand наименование бренда
     *
     */

    /** поле name */
    protected String name;
    /** поле бренда*/
    protected String brand;
    protected double price;
    public String displayInfo(){
        return String.format("%s - %s - %.2f", brand, name, price);
    }
    Product(String inputBrand, String inputName, double inputPrice){
        if (inputName.length() < 4){
            this.name = "product";
        }else {
            this.name = inputName;
        }
        checkPrice(inputPrice);
        this.brand = inputBrand;
    }
    Product(String inputName, double inputPrice){
        this("nobrand", inputName, inputPrice);
    }
    Product(){
        this("noname", 1);
    }
    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public String getBrand() {
        return brand;
    }
    public void setPrice(double inputPrice) {
        checkPrice(inputPrice);
    }
    private void checkPrice(double price){
        if (price <= 0){
            System.out.println("Цена не может быть отрицательной или ровна нулю");
        }else {
            this.price = price;
        }
    }

}
