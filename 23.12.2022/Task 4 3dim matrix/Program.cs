// Сформируйте трёхмерный массив из неповторяющихся двузначных чисел. 
// Напишите программу, которая будет построчно выводить массив, добавляя индексы каждого элемента.
void OutputMatrix(int[,,] matrix)
{
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            for (int k = 0; k < matrix.GetLength(2); k++)
            {
                Console.Write($"{matrix[i, j, k]}");
                Console.Write($"{(i, j, k)}\t");
            }
            Console.WriteLine();
        }
        Console.WriteLine();
    }
}

void InputMatrix(int[,,] matrix)
{
    int start = new Random().Next(10, 21);
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            for (int k = 0; k < matrix.GetLength(2); k++)
            {
                matrix[i, j, k] = start;
                start += 1;
            }
        }
    }
    OutputMatrix(matrix);
}




Console.Clear();
Console.Write("Введите размер матрицы: ");
int[] size = Console.ReadLine().Split(" ").Select(x => int.Parse(x)).ToArray();
while(size[0] >= 5 || size[1] >= 5 || size[2] >= 5)
{
    Console.Write("Невозможен размер больше 5 для 2-ух значных элементов\nВведите заново: ");
    size = Console.ReadLine().Split(" ").Select(x => int.Parse(x)).ToArray();
}
int[,,] matrix = new int[size[0], size[1], size[2]];
InputMatrix(matrix);
