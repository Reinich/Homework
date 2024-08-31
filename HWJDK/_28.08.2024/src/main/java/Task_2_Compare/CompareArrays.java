package Task_2_Compare;

import java.util.ArrayList;
import java.util.List;

public class CompareArrays {
    /**
     * ~ Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
     * и false в противном случае. Массивы в данной задаче считаются равными, если количество элементов в массивах
     * одинаковое и элементы имеют одинаковый тип.
     */
    public static void main(String[] args) {
        List<Integer> intArray = new ArrayList<>();
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        List<Float> floatArray = new ArrayList<>();
        floatArray.add(1F);
        floatArray.add(2F);
        floatArray.add(3F);
        List<Number> intArray2 = new ArrayList<>();
        intArray2.add(1);
        intArray2.add(2F);
        intArray2.add(3);
        List<Integer> intArray3 = new ArrayList<>();
        intArray3.add(1);
        intArray3.add(2);
        intArray3.add(3);

        System.out.println(compareArrays(intArray, floatArray)); // false
        System.out.println(compareArrays(intArray, intArray2));  // false
        System.out.println(compareArrays(intArray, intArray3));  // true


    }
    public static <T, U> boolean compareArrays(List<T> tArray, List<U> uArray){
        if (tArray.size() == uArray.size()){
            if (!tArray.isEmpty()){
                for (int i = 0; i < tArray.size(); i++) {
                    if (!tArray.get(i).getClass().equals(uArray.get(i).getClass())){
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }
}
