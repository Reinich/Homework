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
    if (num == 4)                                               // Раз уж в примере для 6-ки правильный ответ не "1, 5", но при этом есть возможность ввести 4,
    {                                                           // для которой только один правильный вариант - "1, 3",
        Console.WriteLine($"{1}, {num - 1}");                   // то пусть для нее будет отдельное условие
        break;
    }
    if (Simple(i) == true && Simple(num - i) == true)
    {
        Console.Write($"{i}, {num - i}");
        break;
    }
}
