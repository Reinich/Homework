// В первую строку консоли нужно вывести числа, которые соответствуют дням месяцев, в которые Вася получил тройки, а во второй строке соответственно расположить числа месяца, 
//в которые Вася получил четверки. В третьей строке нужно вывести «YES», если Вася может рассчитывать на четверку и «NO» в противном случае.

void InputArray(int[] array)
{
    for (int i = 0; i < array.Length; i++)
        array[i] = new Random().Next(1, 32);
}

int[] ArrayEven(int[] array)
{
    int countEven = 0;
    for (int i = 0; i < array.Length; i++)
        if ((array[i] % 2) == 0) countEven++;
    int[] arrayEven = new int[countEven];
    return arrayEven;
}

int[] ArrayOdd(int[] array)
{
    int countOdd = 0;
    for (int i = 0; i < array.Length; i++)
        if ((array[i] % 2) != 0) countOdd++;
    int[] arrayOdd = new int[countOdd];
    return arrayOdd;
}

int[] InputArrayEven(int[] array, int[] array2)
{
    int j = 0;
    for (int i = 0; i < array.Length; i++)
        if ((array[i] % 2) == 0)
        {
            array2[j] = array[i];
            j++;
        }
    return array2;
}

int[] InputArrayOdd(int[] array, int[] array2)
{
    int j = 0;
    for (int i = 0; i < array.Length; i++)
        if ((array[i] % 2) != 0)
        {
            array2[j] = array[i];
            j++;
        }
    return array2;
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
int[] arrayEven = ArrayEven(array);
int[] arrayOdd = ArrayOdd(array);
InputArrayEven(array, arrayEven);
InputArrayOdd(array, arrayOdd);

Console.WriteLine($"Все дни: {string.Join(", ", array)}\n{string.Join(" ", arrayEven)}\n{string.Join(" ", arrayOdd)}");

if (arrayEven.Length > arrayOdd.Length) Console.WriteLine("Расслабься, четверка обеспечена");
else Console.WriteLine("Кранты, тройка будет");









