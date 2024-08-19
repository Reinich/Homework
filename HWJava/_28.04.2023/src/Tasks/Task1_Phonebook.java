package Tasks;

import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1_Phonebook {
/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 Нужны методы добавления новой записи в книгу и метод поиска записей в телефонной книге*/
    /*добавлен метод сортировки по количеству номеров*/
    static Map<String, List<String>> phoneBook = new HashMap<>();
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        addContact("Petr", "234567");
        addContact("Ivan", "403267");
        addContact("Slava", "345678");
        addContact("Dima", "456789");
        addContact("Dima", "852913");
        addContact("Dima", "876519");
        addContact("Petr", "567891");
//        printPhoneBook();
//        System.out.println();
//        System.out.print("Введите имя: ");
//        String name = sc.nextLine();
//        getContact(name);
        sortPhonebook();

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

    static void sortPhonebook() {
        Map<String, Integer> newPhonebook = new HashMap<>();
        for (String s : phoneBook.keySet()) {
            newPhonebook.put(s, phoneBook.get(s).size());
        }
        System.out.println(newPhonebook);
        System.out.println();

        Map<String, Integer> sortedMap = new TreeMap<>(
                Comparator.comparing(newPhonebook::get).reversed());
        sortedMap.putAll(newPhonebook);
        System.out.println(sortedMap);
        System.out.println();


        for (String s : sortedMap.keySet()){
            if (phoneBook.containsKey(s)){
                System.out.printf("%s: %s", s, phoneBook.get(s));
                System.out.println();
            }
        }

    }




}