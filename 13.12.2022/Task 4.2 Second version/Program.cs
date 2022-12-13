// В первую строку консоли нужно вывести числа, которые соответствуют дням месяцев, в которые Вася получил тройки, а во второй строке соответственно расположить числа месяца, 
// в которые Вася получил четверки. В третьей строке нужно вывести «YES», если Вася может рассчитывать на четверку и «NO» в противном случае.

void InputArray(int[] array)
{
    for (int i = 0; i < array.Length; i++)
        array[i] = new Random().Next(1, 32);
}

Console.Clear();
Console.Write("Введи количество дней с оценкой: ");
int n = Convert.ToInt32(Console.ReadLine());
while (n > 100 || n < 1)
{
    Console.Write("Вась, нормально посчитай.\nСколько дней получилось? ");
    n = Convert.ToInt32(Console.ReadLine());
}

int[] array = new int[n];
InputArray(array);
Console.WriteLine($"Все дни: {string.Join(", ", array)}");

int countEven = 0, countOdd =0;
for (int i = 0; i < array.Length; i++)
{
    if ((array[i] % 2) == 0)
    {
        Console.Write($"{array[i]} ");
        countEven++;
    }
    else countOdd++;
}

Console.WriteLine();

for (int i = 0; i < array.Length; i++)
    if ((array[i] % 2) != 0) Console.Write($"{array[i]} ");

Console.WriteLine();

if (countEven > countOdd) Console.WriteLine("Расслабься, четверка обеспечена");
else Console.WriteLine("Кранты, тройка будет");