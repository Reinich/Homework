// Задайте массив вещественных чисел. Найдите разницу между максимальным и минимальным элементов массива.

void InputArray(double[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = new Random().Next(-10, 10) + new Random().NextDouble();// Честно стырила
        array[i] = Math.Round(array[i], 3);
    }

    // for(int i = 0; i < array.Length; i++)
    // {
    // array[i] = Convert.ToDouble(new Random().Next(-100, 101)/10.0);              // Подскажите, какой вариант лучше? 1 (выше) или 2 (тот, что в комментарии)?
    // }

}
double FindMax(double[] array)
{
    double max = 0;
    for (int i = 0; i < array.Length; i++)
        if (array[i] > max) max = array[i];
    return max;
}
double FindMin(double[] array)
{
    double min = 0;
    for (int i = 0; i < array.Length; i++)
        if (array[i] < min) min = array[i];
    return min;
}


Console.Clear();
Console.Write("Введите количество элементов в массиве: ");
int n = Convert.ToInt32(Console.ReadLine());
double[] array = new double[n];
InputArray(array);
Console.WriteLine($"Начальный массив: [{string.Join("; ", array)}]");
Console.Write($"Разница между максимальным и минимальным элементами: {(FindMax(array) - FindMin(array))}");


