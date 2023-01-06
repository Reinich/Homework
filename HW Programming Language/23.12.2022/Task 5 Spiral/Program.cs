// Вывести квадратную матрицу спирально. По диагонали задачу не победила, а эту победила.


void OutputMatrix(int[,] matrix)
{
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
            Console.Write($"{matrix[i, j]} \t");
        Console.WriteLine();
    }
}

void Spiral(int[,] matrix)
{
    int tmpi = 0, tmpj = 0, num = 1, countRight = 0, countLeft = 0, countUp = 0, countDown = 0,   // Такое количество переменных жестоко, но необходимо
        end = 0;

    while (end <= matrix.GetLength(0) + matrix.GetLength(1) - 1)
    {
        for (int j = 0 + countRight; j < matrix.GetLength(0) - countRight; j++)                       // Двигаемся вправо
        {
            matrix[tmpi, j] = num;
            num++;
            tmpj = j;
        }
        countUp++; end++;

        if (end <= matrix.GetLength(0) + matrix.GetLength(1) - 1)                                   // Для нечетных матриц проверка осуществляется на шаге вниз (заканчивает цикл на вправо)
        {
            for (int i = tmpi + 1; i < matrix.GetLength(0) - countDown; i++)                        // Двигаемся вниз
            {
                matrix[i, tmpj] = num;
                num++;
                tmpi = i;

            }
            countRight++; end++;
        }
        else return;
        
        for (int j = tmpj - 1; j > -1 + countLeft; j--)                                             // Двигаемся влево
        {
            matrix[tmpi, j] = num;
            num++;
            tmpj = j;
        }
            countDown++; end++;
        
        if (end <= matrix.GetLength(0) + matrix.GetLength(1) - 1)                                   // Для четных матриц проверка осуществляется на шаге вверх (заканчивает цикл на влево)
        {
            for (int i = tmpi - 1; i > -1 + countUp; i--)                                          // Двигаемся вверх
            {
                matrix[i, tmpj] = num;
                num++;
                tmpi = i;
            }
            countLeft++; end++;
        }
        else return;
    }

}


Console.Clear();
Console.Write("Введите размер матрицы: ");
int[] size = Console.ReadLine().Split(" ").Select(x => int.Parse(x)).ToArray();
int[,] matrix = new int[size[0], size[1]];

Spiral(matrix);

OutputMatrix(matrix);






// void PrintArray(int[,] array)
// {
//     for (int i = 0; i < array.GetLength(0); i++)
//     {
//         for (int j = 0; j < array.GetLength(1); j++)
//         {
//             Console.Write(array[i, j] + " \t");
//         }
//         Console.WriteLine();
//     }
// }


// Console.Write("Введите размер массива: ");
// int size = Convert.ToInt32(Console.ReadLine());
// int[,] array = new int[size, size];
// int num = 1;
// int i = 0;
// int j = 0;

// while (num <= size * size)
// {
//     array[i, j] = num;
//     if (i <= j + 1 && i + j < size - 1)
//         j++;
//     else if (i < j && i + j >= size - 1)
//         i++;
//     else if (i >= j && i + j > size - 1)
//         j--;
//     else
//         i--;
//     num++;
// }
// PrintArray(array);