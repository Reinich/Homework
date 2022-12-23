// Найти строку с наименьшей суммов элементов. Немного топорное решение


void OutputMatrix(int[,] matrix)
{
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
            Console.Write($"{matrix[i, j]} \t");
        Console.WriteLine();
    }
}

void InputMatrix(int[,] matrix)
{
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
            matrix[i, j] = new Random().Next(1, 11);
    }
    OutputMatrix(matrix);
}

void MinimumSummaryRow(int[,] matrix)
{
    int minSum = 1000, row = 0;
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        int minSumRow = 0;
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            minSumRow = minSumRow + matrix[i, j];
            if (minSum > minSumRow) 
            {
                minSum = minSumRow;
                row = i;
            }
        }
    }
    Console.WriteLine("Строка с наименьшей суммой элементов: " + minSum);
}

Console.Clear();
Console.Write("Введите размер матрицы: ");
int[] size = Console.ReadLine().Split(" ").Select(x => int.Parse(x)).ToArray();
while (size[0] == size[1])
{
    Console.WriteLine("Матрица должна быть прямоугольной\nВведите размер матрицы: ");
    size = Console.ReadLine().Split(" ").Select(x => int.Parse(x)).ToArray();
}
int[,] matrix = new int[size[0], size[1]];
InputMatrix(matrix);

MinimumSummaryRow(matrix);