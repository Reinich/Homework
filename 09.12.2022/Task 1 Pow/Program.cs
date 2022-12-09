Console.Clear();
Console.Write("Введите число, которое нужно возвести в степень: ");
int n = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите степень: ");
int s = Convert.ToInt32(Console.ReadLine());
int pow = n;
for (int i = 1; i < s; i++)
{
    pow = pow * n;
}
Console.Write(pow);