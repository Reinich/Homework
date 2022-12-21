void InputMatrix(int[,] matrix)
{
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            matrix[i, j] = new Random().Next(1, 11);
            Console.Write($"{matrix[i, j]} \t");
        }
        Console.WriteLine();
    }
}

void Average(int[,] matrix)                                             // Нахождение среднего арифметического для каждого столбца
{
    double[] resultColumns = new double[matrix.GetLength(1)];

    for (int i = 0; i < matrix.GetLength(0); i++)
        for (int j = 0; j < matrix.GetLength(1); j ++)
            resultColumns[j] += matrix[i, j];
    
    foreach (double element in resultColumns)
        Console.Write($"{Math.Round(element/matrix.GetLength(0), 1)}; \t");        
}

Console.Clear();
Console.Write("Введите размеры матрицы: ");
int[] size = Console.ReadLine().Split(" ").Select(x => int.Parse(x)).ToArray();
int[,] matrix = new int[size[0], size[1]];
InputMatrix(matrix);
Average(matrix);
