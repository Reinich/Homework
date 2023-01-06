Console.Clear();

Console.WriteLine("Введите номер дня недели: ");
int n = Convert.ToInt32(Console.ReadLine());

while (n < 1 || n > 7)
{
    Console.Write("Вы ошиблись. \n Введите номер дня недели: ");
    n = Convert.ToInt32(Console.ReadLine());
}
if (n==6 || n == 7) Console.WriteLine("Yes");
else Console.Write("No");