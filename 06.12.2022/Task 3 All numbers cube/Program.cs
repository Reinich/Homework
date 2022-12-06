Console.Clear();
Console.Write("Введите число: ");
double n = Convert.ToInt32(Console.ReadLine());

for (int i=1; i<=n; i++)
{   
    Console.Write($"{Math.Pow(i, 3)} ");
}