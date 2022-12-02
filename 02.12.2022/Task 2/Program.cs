Console.Clear();

Console.Write("Введите число: ");
int n = Convert.ToInt32(Console.ReadLine());

while (n <= 99)
{
    Console.Write("Вы ошиблись. \n Введите новое число: ");
    n = Convert.ToInt32(Console.ReadLine());
}

while (n>999)   
{
    n = n/10;
}  

if (n>=100 && n<=999) Console.WriteLine($"Третье число: {n%10}");
