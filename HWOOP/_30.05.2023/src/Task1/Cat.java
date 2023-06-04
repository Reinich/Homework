package Task1;
/*Допустим, в программе есть класс Кот. У кота есть кличка и аппетит (сколько единиц еды он потребляет за приём
пищи). Эти поля мы заполняем с помощью конструктора. Также есть метод eat(), который заставляет
кота покушать, но пока что он пустой, так как неизвестно, откуда кот должен брать еду:*/
public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = false;
    }
    public String getName() {
        return name;
    }
    public int getAppetite() {
        return appetite;
    }
    public boolean isHungry() {
        return hungry;
    }
    public void getHugry(Cat cat){
        if (!hungry){
            System.out.printf("%s голоден!\n", cat.getName());
        }else {
            System.out.printf("%s сыт, а значит - доволен!\n", cat.getName());
        }
    }
    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }
    public void eat(Cat cat, Plate plate){
        if (!cat.isHungry()){
            if (plate.getFood() - cat.getAppetite() < 0){
                System.out.println("В тарелке слишком мало еды, котик отказывается есть объедки и уходит голодным. Извинитесь!");
            }else {
                plate.setFood(plate.getFood() - cat.getAppetite());
                System.out.printf("%s покушал и остался сыт!\n", cat.getName());
                cat.setHungry(true);
            }
        }else {
            System.out.printf("%s не голоден\n", cat.getName());
        }
    }


}
