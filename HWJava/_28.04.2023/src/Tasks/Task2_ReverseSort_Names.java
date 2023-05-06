package Tasks;

import java.util.*;

public class Task2_ReverseSort_Names {
/*Пусть дан список сотрудников. Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.*/
    public static void main(String[] args) {
        String line = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, \n" +
                "Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, \n" +
                "Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        line= line.replace("\n","");
        String[] words = line.split(" "); // разделяем имя и фамилию

        List<String> words_res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) { // в новом листе добавляем все имена
            if (i % 2 == 0){
                words_res.add(words[i]);
            }}

        Map<String, Integer> names = countNames(words_res);
        Map<Integer, List<String>> namesSort = reverseSort(names);
        print(namesSort);

    }
    static void print(Map<Integer, List<String>> map){
        for (Integer s: map.keySet()){
            System.out.printf("%d: %s\n", s, map.get(s));
        }
    }
    static Map<String, Integer> countNames(List<String> words_res){
        int count = 1;
        Map<String, Integer> names = new TreeMap<>(); // подсчитываем количество повторяющихся имен
        for (String name: words_res){
            if (names.containsKey(name)) {
                names.put(name, names.get(name)+1);
            } else {
                names.put(name, count);
            }}
        return names;
    }
    static Map<Integer, List<String>> reverseSort(Map<String, Integer> names){
        Map<Integer, List<String>> namesSort = new TreeMap<>(Comparator.reverseOrder());
        for (String s: names.keySet()){                        // в новом TreeMap меняем значения и ключи местами
            if (namesSort.containsKey(names.get(s))){
                List<String> list = namesSort.get(names.get(s));
                list.add(s);
            }else {
                List<String> list = new ArrayList<>();
                list.add(s);
                namesSort.put(names.get(s), list);
            }
        }
        return namesSort;
    }
}
