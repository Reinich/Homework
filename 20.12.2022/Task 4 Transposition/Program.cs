// Нужно перевенрнуть матрицу с ног на голову

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

void Transposition(int[,] matrix)
{
    int temporary = 0;
    for (int i = 0; i < matrix.GetLength(0) / 2; i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            if (matrix.GetLength(0) % 2 == 0)
            {
                temporary = matrix[i, j];
                matrix[i, j] = matrix[matrix.GetLength(1) - i - 1, j];
                matrix[matrix.GetLength(1) - i - 1, j] = temporary;
            }
            else
            {
                temporary = matrix[i, j];
                matrix[i, j] = matrix[matrix.GetLength(1) - i, j];
                matrix[matrix.GetLength(1) - i, j] = temporary;                
            }
        }
    }
}

void OutputMatrix(int[,] matrix)
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

InputMatrix(matrix);

Console.WriteLine();
Transposition(matrix);

OutputMatrix(matrix);