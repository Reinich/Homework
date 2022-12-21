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

void ReleaseMatrix(int[,] matrix, int[] find)             // Нахождение элемента в массиве
{
    if (find[0] > matrix.GetLength(0) || find[1] > matrix.GetLength(1)) Console.WriteLine("Такой позиции в массиве нет");
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        if (find[0] - 1 == i)                            // Find - 1, потому что пользователь вводит "1 столбец", для кода - это 0 столбец
        {
            for (int j = 0; j < matrix.GetLength(1); j++)
                if (j == find[1] - 1) Console.WriteLine($"{matrix[i , j]}");
        }
    }
}


Console.Clear();
Console.Write("Введите размер матрицы: ");
int[] size = Console.ReadLine().Split(" ").Select(x => int.Parse(x)).ToArray();
int[,] matrix = new int[size[0], size[1]];

InputMatrix(matrix);

Console.Write("Введите элементы, которые нужно найти: ");
int[] find = Console.ReadLine().Split(" ").Select(x => int.Parse(x)).ToArray();

ReleaseMatrix(matrix, find);

