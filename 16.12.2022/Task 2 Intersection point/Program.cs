Console.Clear();
Console.Write("Введите k1, k2, b1, b2: ");
int[] x = Console.ReadLine().Split(" ").Select(x => int.Parse(x)).ToArray();

Console.WriteLine($"Точка пересечение: {(double)(x[2] - x[3]) / Math.Abs(x[0] - x[1])}; {(double)(x[1] * (double)(x[2] - x[3]) / Math.Abs(x[0] - x[1])) + x[3]}");


