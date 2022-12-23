void FillDiagonal(int[,] matrix)
{
    int CountOfRows = 0;
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            if (i == 0 && j == 0)
            {
                matrix[i, j] = 0;
                CountOfRows++;
                j++;
            }
            if (j == 0)
            {
                matrix[i, j] = matrix[i - 1, j] + CountOfRows + 1;
                CountOfRows++;
                j++;
            }
            while (CountOfRows < matrix.GetLength(0))
            {
                matrix[i, j] = matrix[i, j - 1] + CountOfRows;
                CountOfRows++;
                j++;
            }
            matrix[i, j] = matrix[i, j - 1] + CountOfRows;
        }
        CountOfRows = i + 1;

    }

}


void Output(int[,] matrix)
{
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
            Console.Write($"{matrix[i, j]} \t");
        Console.WriteLine();
    }
}



Console.Clear();
Console.Write("Введите размеры матрицы: ");
int[] size = Console.ReadLine().Split(" ").Select(x => int.Parse(x)).ToArray();
int[,] matrix = new int[size[0], size[1]];

FillDiagonal(matrix);
Output(matrix);









        //     if (i == 0 && j == 0)
        //     {
        //         matrix[i, j] = 0;
        //         CountOfRows++;
        //         j++;
        //     }
        //     if (j == 0)
        //     {
        //         matrix[i, j] = matrix[i - 1, j] + CountOfRows + 1;
        //         CountOfRows++;
        //         j++;
        //     }
        //     while (CountOfRows < matrix.GetLength(0))
        //     {
        //         matrix[i, j] = matrix[i, j - 1] + CountOfRows;
        //         CountOfRows++;
        //         j++;
        //     }
        //     matrix[i, j] = matrix[i, j - 1] + CountOfRows;
        // }