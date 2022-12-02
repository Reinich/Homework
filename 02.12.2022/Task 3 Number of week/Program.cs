Console.Clear();

Console.WriteLine("Введите номер дня недели: ");
int n = Convert.ToInt32(Console.ReadLine());

while (n < 1 || n > 7)
{
    Console.Write("Вы ошиблись. \n Введите номер дня недели: ");
    n = Convert.ToInt32(Console.ReadLine());
}
if (n == 1)
    Console.Write("No");
else if (n == 2)
    Console.Write("No");
else if (n == 3)
    Console.Write("No");
else if (n == 4)
    Console.Write("No");
else if (n == 5)
    Console.Write("No");
else if (n == 6)
    Console.Write("Yes");
else 
    Console.Write("Yes");
