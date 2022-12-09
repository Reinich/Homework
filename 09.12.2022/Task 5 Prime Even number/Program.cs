Console.Clear();
Console.Write("Введите четное число, больше 3-x: ");
int num = Convert.ToInt32(Console.ReadLine());

bool Simple(int num)
{
    for (int i = 2; i < num; i++)
    {
        if (num % i == 0)
            return false;
    }
    return true;
}


while (num < 4 || num % 2 != 0)
{
    Console.Write($"Разве это похоже на четное число или на число, которое больше 3?\nВведите ЧЕТНОЕ число, которое БОЛЬШЕ 3-х");
    num = Convert.ToInt32(Console.ReadLine());
}


for (int i = 2; i < num; i++)
{
    if (Simple(i) == true && Simple(num - i) == true)
    {
        Console.Write($"{i}, {num - i}");
        break;
    }
}
