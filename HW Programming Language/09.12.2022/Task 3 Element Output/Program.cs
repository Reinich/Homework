Console.Clear();
Console.Write("Введите количество элементов: ");
int n = Convert.ToInt32(Console.ReadLine());
int[] array = new int[n];
Console.Write("Введите элементы: ");
for (int i = 0; i < array.Length; i++)
{
    array[i] = Convert.ToInt32(Console.ReadLine());
}

Console.WriteLine($"[{string.Join(", ", array)}]"); // Первый вариант

// for (int i = 0; i < array.Length; i++)           // Второй вариант
// {
//     Console.Write($"{array[i]} ");
// }