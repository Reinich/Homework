// Первая строка содержит целые числа n и m – высоту и ширину исходного изображения (в пикселях). Каждая строка состоит из m символов «B» и «W».
// Далее следует пустая строка, а после нее – описание выведенного Мишиной программой изображения в том же формате, что и исходное изображение. Посчитайте количество ошибок, которые совершила Мишина программа.

void OutputMatrix(Char[,] matrix)
{
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
            Console.Write($"{matrix[i, j]} \t");
        Console.WriteLine();
    }
}


void InputImage(char[,] image)
{
    for (int i = 0; i < image.GetLength(0); i++)
    {
        for (int j = 0; j < image.GetLength(1); j++)
        {
            Console.Write("i: " + i + " j: " + j + "; ");
            image[i, j] = char.Parse(Console.ReadLine());
        }
        Console.WriteLine();
    }
}

void NegativeImage(char[,] image)
{
    for (int i = 0; i < image.GetLength(0); i++)
    {
        for (int j = 0; j < image.GetLength(1); j++)
        {
            Console.Write("i: " + i + " j: " + j + "; ");
            image[i, j] = char.Parse(Console.ReadLine());
        }
    Console.WriteLine();
    }  
}

void ComparisonImages(char[,] image, char[,] negativeImage)
{
    int count = 0;
    for (int i = 0; i < image.GetLength(0); i++)
    {
        for (int j = 0; j < image.GetLength(1); j++)
            if (image[i,j] == negativeImage[i,j]) count++;
    }
    Console.WriteLine(count);
}

Console.Write("Введите количество строк и столбцов: ");
int[] size = Console.ReadLine().Split(" ").Select(x => int.Parse(x)).ToArray();
char[,]? image = new char[size[0], size[1]];
char[,]? negativeImage = new char[size[0], size[1]];

Console.WriteLine("Введите изображение: ");
InputImage(image);

OutputMatrix(image);
Console.WriteLine();

Console.WriteLine("Введите негатив: ");
NegativeImage(negativeImage);

ComparisonImages(image, negativeImage);

