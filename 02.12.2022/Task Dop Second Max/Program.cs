Console.Clear();

Console.WriteLine("Введите числа: ");
int n = Convert.ToInt32(Console.ReadLine());
int max = n;
int secmax = 0;
while (n != 0)
{
    n = Convert.ToInt32(Console.ReadLine());
    if (n > max)
    {
        secmax = max;
        max = n;
    }
    else if (n > secmax)
    {
        secmax = n;
    }
}

Console.Write($"Второе максимальное число: {secmax}");