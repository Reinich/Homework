
public class Task2 {
    public static void main(String[] args) {
        /*Вывести все простые числа от 1 до 1000*/
        long res = 0;
        System.out.printf("2 ");
        for (int i = 3; i < 1001; i += 2){ 
            int flag = 1; 
            for (int j = 2; j < i/2; j++){ 
                if (i % j == 0){ 
                    flag = 0; 
                } 
            } 
            if (flag == 1){ 
                System.out.printf("%d ", i); 
            } 
        }
    }
}   