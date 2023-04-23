package Tasks;
import java.util.Scanner;
// На первой строке записывается натуральное число n - количество строчек в книге. Затем вводятся строки книги.
// Потом натуральное число m - количество продуктов, на которые у человека аллергия. Потом вводится m строк -
// вида "продукт1 - продукт2", где продукт1 - аллергия, и продукт2 - продукт-замена продукт1.
// Гарантируется что любой продукт состоит из 1 слова. Название продуктов написаны строчными буквами.
// Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.
// Выходные данные:
// Заменить все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание.
// ВАЖНО!!! Если продукт написан с большой буквы, то и замена тоже должна начинаться с большой буквы!
public class Task3_Recipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] recept =  {"Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измельчите его. Посыпьте измельчённый арахис на мороженое. ",
                "Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть. Радоваться жизни."};
        String[] newRecept = recept.clone();
        System.out.print("Сколько аллергенов: ");
        int m = sc.nextInt();
        String[] allergy = new String[m]; String[] change = new String[m];
        for (int i = 0; i < m; i++) {
            System.out.print("убрать - ");
            allergy[i] = sc.nextLine();
            System.out.print("заменить - ");
            change[i] = sc.nextLine();
        }
        for (int i = 0; i < recept.length; i++) {
            newRecept[i] = recept[i].toLowerCase().replace(allergy[i], change[i]);
            newRecept[i] = newRecept[i].substring(0, 1).toUpperCase() + newRecept[i].substring(1);
        }
        for (int i = 0; i < recept.length; i++) {
            System.out.print(recept[i]);
        }
    }
}
