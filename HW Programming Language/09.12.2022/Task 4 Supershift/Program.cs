Console.Clear();
Console.Write("Введите количество элементов: ");
int n = Convert.ToInt32(Console.ReadLine());
int[] array = new int[n];
Console.Write("Введите элементы: ");

for (int i = 0; i < array.Length; i++)                     // Ввод массива с консоли     
{
    array[i] = Convert.ToInt32(Console.ReadLine());
}

Console.WriteLine($"[{string.Join(", ", array)}]");

int[] array2 = new int[n];                                       // Можно было бы сделать все методом пузырька, но я, скорее всего, запуталась бы, поэтому создаем второй массив

Console.Write("Введите цифру сдвига: ");
int t = Convert.ToInt32(Console.ReadLine());
if (t > 0)                                               // Если число сдвига положительное - сдвигаем вправо
{
    for (int i = 0; i < n; i++)
    {
        if (i < (n / 2)) array2[i + t] = array[i];
        else array2[i - t + 1] = array[i];
    }
    Console.WriteLine($"[{string.Join(", ", array2)}]");
}
else if (t < 0)
{
    for (int j = 0; j < n; j++)
    {
        if (j <= n / 2) array2[j + Math.Abs(t) - 1] = array[j];
        else array2[j - Math.Abs(t)] = array[j];
    }
    Console.WriteLine($"[{string.Join(", ", array2)}]");
}
else
{
    Console.Write("Сдвиг не может быть равен 0.\nВведите цифру сдвига: ");
    t = Convert.ToInt32(Console.ReadLine());
}