Console.Clear();
Console.Write("Введите числа: ");
int count = 0;
int[] s = Console.ReadLine().Split(" ").Select(x => int.Parse(x)).ToArray();
    foreach (int element in s)
    {
        if (element > 0) count++;
    }
Console.WriteLine(count);