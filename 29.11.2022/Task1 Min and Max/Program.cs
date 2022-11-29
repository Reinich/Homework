Console.Clear();
Console.Write("Введите первое число: ");
int n = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите второе число: ");
int m = Convert.ToInt32(Console.ReadLine());

if (n>m || n==m)
{
    Console.WriteLine($"Наибольшее значение: {n}");
    Console.WriteLine($"Наименьшее значение: {m}");
}
else 
{
    Console.WriteLine($"Наибольшее значение: {m}");
    Console.WriteLine($"Наименьшее значение: {n}");
}