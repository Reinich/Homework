// Найти сумму всех чисел от N до M

int rec(int m, int n)
{
    int sum = n;
    if (n == m)
        return sum;
    return sum += rec(m, n - 1) ;
}


Console.Clear();
Console.Write("Введите число m: ");
int m = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите число n: ");
int n = Convert.ToInt32(Console.ReadLine());
Console.WriteLine(rec(m, n));