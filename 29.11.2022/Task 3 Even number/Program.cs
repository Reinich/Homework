Console.Clear();
Console.Write("Введите число: ");
int n = Convert.ToInt32(Console.ReadLine());
if (n%2==0)
    Console.WriteLine("Число четное");
else
    Console.WriteLine("Число нечетное");