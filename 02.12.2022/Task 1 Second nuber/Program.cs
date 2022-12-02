Console.Clear();

Console.WriteLine("Введите трехзначное число: ");
int n = Convert.ToInt32(Console.ReadLine());

int m1 = n/10;
int m2 = m1%10;
Console.Write($"Среднее число: {m2}");