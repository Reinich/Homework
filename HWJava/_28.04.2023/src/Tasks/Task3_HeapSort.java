package Tasks;

import java.util.Random;

public class Task3_HeapSort {
/*Реализовать алгоритм пирамидальной сортировки (HeapSort)*/
public static void main(String[] args) {
    int[] array = createArray();
    printArary(array);
    hearSort(array);
    printArary(array);
}

    public static void hearSort(int arr[]) {
    int n = arr.length;

    for (int i = n / 2 - 1; i >= 0; i--)
        shift(arr, n, i);

    for (int i=n-1; i>=0; i--){
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
        shift(arr, i, 0);
    }
}

    static void shift(int arr[], int n, int i)
    {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            shift(arr, n, largest);
        }
    }

    static int[] createArray(){
        Random random = new Random();
        int size = random.nextInt(3,10);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0,20);
        }
        return array;
    }

    static void printArary(int[] array){
        for (int item:array){
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
