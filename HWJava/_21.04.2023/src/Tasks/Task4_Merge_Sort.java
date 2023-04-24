package Tasks;

import java.util.Random;

public class Task4_Merge_Sort {
    /*Реализовать алгоритм сортировки слиянием*/
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(4,10);
        int[] array = createList(size);
        print(array);
        array = mergeArray(array);
        print(array);
    }

    public static int[] mergeArray(int[] nums) {
        int length_arr = nums.length / 2; // Сортировка массивов правого и левого

        if (nums.length < 2) {
            return nums;
        }
        if (nums.length % 2 != 0){
            length_arr += 1;
        }
        int[] right = new int[length_arr];
        int[] left = new int[nums.length / 2];

        for (int i = 0; i < nums.length / 2; i++) {
            left[i] = nums[i];

        }

        for (int i = nums.length / 2; i < nums.length; i++) {
            right[i - nums.length / 2] = nums[i];

        }
        left = mergeArray(left);
        right = mergeArray(right);


        int[] res = new int[left.length + right.length]; // Слияние массивов в единый
        int posL = 0, posR = 0;

        for (int i = 0; i < res.length; i++) {
            if (posL < left.length && posR < right.length) {
                if (left[posL] < right[posR]) {
                    res[i] = left[posL];
                    posL++;
                } else {
                    res[i] = right[posR];
                    posR++;
                }
            } else if (posL == left.length && posR < right.length) {
                res[i] = right[posR];
                posR++;
            }
            else if (posL < left.length && posR == right.length) {
                res[i] = left[posL];
                posL++;
            }else{
                res[i] = 0;
            }
        }
        return res;
    }


    static int[] createList(int capacity){
        int[] list = new int[capacity];
        Random random = new Random();
        for (int i = 0; i < capacity; i++) {
            list[i] = random.nextInt(0,50);}
        return list;
    }
    static void print(int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}