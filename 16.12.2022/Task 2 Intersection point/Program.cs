Console.Clear();
Console.Write("Введите k1, k2, b1, b2: ");
double[] x = Console.ReadLine().Split(" ").Select(x => double.Parse(x)).ToArray();

Console.WriteLine($"Точка пересечение: {(x[2] - x[3]) / Math.Abs(x[0] - x[1])}; {(x[1] * (x[2] - x[3]) / Math.Abs(x[0] - x[1])) + x[3]}");


