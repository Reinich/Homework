// Произведение двух матриц. Беспощадно бессмысленное, без высшей математики

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

void ProductMatrices(int[,] firstMatrix, int[,] secondMatrix)
{
    for (int i = 0; i < firstMatrix.GetLength(0); i++)
    {
        for (int j = 0; j < firstMatrix.GetLength(1); j++)
            firstMatrix[i, j] *= secondMatrix[i, j];
    }
    OutputMatrix(firstMatrix);
}


Console.Clear();
Console.Write("Введите размер матриц: ");
int[] size = Console.ReadLine().Split(" ").Select(x => int.Parse(x)).ToArray();
Console.WriteLine("Первый массив: ");
int[,] firstMatrix = new int[size[0], size[1]];
InputMatrix(firstMatrix);
Console.WriteLine("Второй массив: ");
int[,] secondMatrix = new int[size[0], size[1]];
InputMatrix(secondMatrix);
Console.WriteLine("Произведение массивов: ");
ProductMatrices(firstMatrix, secondMatrix);
