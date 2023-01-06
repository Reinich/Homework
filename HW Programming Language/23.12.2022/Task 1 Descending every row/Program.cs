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
 
 
void SortingArray(int[,] matrix) 
{ 
    int tmp = 0;  
    int[] array = new int[matrix.GetLength(1)];
    int n = array.GetLength(0);
    
    
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)              // В созданный одномерный массив запихиваем все значения строчки
            array[j] = matrix[i, j]; 

        for (int k = 0; k < n; k++)                                // Сортируем одномерный массив
        { 
            for (int l = n - 1; l > k; l--) 
            { 
                if (array[k] < array[l]) 
                { 
                    tmp = array[k]; 
                    array[k] = array[l]; 
                    array[l] = tmp; 
                } 
            } 
        } 
        
        for (int j = 0; j < matrix.GetLength(1); j++)             // Заменяем старые значения новым одномерным массивом
            matrix[i,j] = array[j];   
    }
}



Console.Clear();
Console.Write("Введите размеры матрицы: ");
int[] size = Console.ReadLine().Split(" ").Select(x => int.Parse(x)).ToArray();
int[,] matrix = new int[size[0], size[1]];
Console.WriteLine("Начальный массив: ");
InputMatrix(matrix);
SortingArray(matrix);
Console.WriteLine();
Console.WriteLine("Конечный массив: ");
OutputMatrix(matrix);
