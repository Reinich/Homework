package Tasks;

import java.util.*;

public class Main {
/*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
отвечающие фильтру.
Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет
Далее нужно запросить минимальные значения для указанных критериев.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Notebook notebook1 = new Notebook("Lenovo", 4, 250, "WindowsXP", "pink");
        Notebook notebook2 = new Notebook("MacBook", 16, 1000, "MacOS", "gold");
        Notebook notebook3 = new Notebook("Xiaomi", 16, 750, "Windows8.1", "silver");
        Notebook notebook4 = new Notebook("Sony", 32, 1000, "Windows11", "black");
        Notebook notebook5 = new Notebook("LenovoX2", 4, 500, "Windows7", "black");
        Notebook notebook6 = new Notebook("SonyX2", 8, 500, "Windows8.1", "pink");
        Notebook notebook7 = new Notebook("LenovoX3", 4, 500, "Windows7", "silver");
        Notebook notebook8 = new Notebook("XiaomiX2", 32, 2000, "Windows11", "silver");
        Notebook notebook9 = new Notebook("Байкал", 16, 750, "Linux", "white");
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);
        notebooks.add(notebook7);
        notebooks.add(notebook8);
        notebooks.add(notebook9);

        String phrase = "Введите номер фильтра:\n" +
                "1: ОЗУ\n" +
                "2: Объем жесткого диска\n" +
                "3: Операционная система\n" +
                "4: Цвет\n" +
                "5: Выход";
        System.out.println(phrase);
        int choiceFilter = sc.nextInt();
        Notebook notebookEx = new Notebook(null, 1, 1, null, null);
        while (choiceFilter != 5){
            switch (choiceFilter){
                case 1:
                    System.out.println("Введите минимальный объем RAM: ");
                    int ram = sc.nextInt();
                    notebookEx.setRam(ram);
                    break;
                case 2:
                    System.out.println("Введите минимальный объем жесткого диска: ");
                    int memory = sc.nextInt();
                    notebookEx.setMemory(memory);
                    break;
                case 3:
                    System.out.println("Введите желаемую OS: ");
                    String os = sc.next();
                    notebookEx.setOs(os);
                    break;
                case 4:
                    System.out.println("Введите желаемый цвет: ");
                    String color = sc.next();
                    notebookEx.setColor(color);
                    break;
            }
            System.out.println(phrase);
            choiceFilter = sc.nextInt();
        }

        filter(notebooks, notebookEx);
    }

    static void filter(List<Notebook> notebooks, Notebook example){
        for (Notebook notebook: notebooks){
            if (example.equals(notebook)){
                System.out.println(notebook);
            }
        }
    }

}