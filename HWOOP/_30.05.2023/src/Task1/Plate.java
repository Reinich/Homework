package Task1;
/*Чтобы можно было хранить еду, создадим класс Тарелка с полем food (еда измеряется в целых
числах и не важно, что это за единицы измерения). При создании тарелки мы можем указать
начальное значение food. В процессе работы с помощью метода info() можно вывести в консоль
информацию о тарелке.*/
public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.printf("В тарелке %s еды\n", food);
    }
    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        if (food < 0){
            System.out.println("В тарелке не может быть отрицательное количество еды.");
        }else {
            this.food = food;
        }

    }
    public void addFood(Plate plate, int count){
        plate.setFood(plate.getFood() + count);
        System.out.printf("Теперь в тарелке %d еды\n", plate.getFood());

    }





}
