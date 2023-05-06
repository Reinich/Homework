package Tasks;

import java.util.*;

public class Task1_Phonebook {
/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 Нужны методы добавления новой записи в книгу и метод поиска записей в телефонной книге*/
    static Map<String, List<String>> phoneBook = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        addContact("Ivan", "123456");
        addContact("Petr", "234567");
        addContact("Slava", "345678");
        addContact("Dima", "456789");
        addContact("Petr", "567891");
        printPhoneBook();
        System.out.println();
        System.out.print("Введите имя: ");
        String name = sc.nextLine();
        getContact(name);
    }

    static void addContact(String name, String number){
        if (phoneBook.containsKey(name)){
            List<String> numbers = phoneBook.get(name);
            numbers.add(number);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(number);
            phoneBook.put(name, numbers);
        }
    }
    static void getContact(String name){
        if (phoneBook.containsKey(name)){

            System.out.printf("%s: %s", name, phoneBook.get(name));
            System.out.println();
        }else {
            System.out.println("Такого контакта нет");
        }
    }
    static void printPhoneBook(){
        for (String s: phoneBook.keySet()){
            if (phoneBook.containsKey(s)){
                System.out.printf("%s: %s", s, phoneBook.get(s));
                System.out.println();
            }
        }
    }
}