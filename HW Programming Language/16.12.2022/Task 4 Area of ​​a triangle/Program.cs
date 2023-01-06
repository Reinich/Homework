Console.Clear();

int[] coo = Console.ReadLine().Split(" ").Select(x => int.Parse(x)).ToArray();

Console.WriteLine($"{0.5 * (Math.Abs((coo[2]-coo[0])*(coo[5]-coo[1])-(coo[4]-coo[0])*(coo[3]-coo[1])))}");


// Console.Clear();
// double[] coord = Console.ReadLine().Split(" ").Select(x => Convert.ToDouble(x)).ToArray();
// double x1 = coord[0], y1 = coord[1], x2 = coord[2], y2 = coord[3], x3 = coord[4], y3 = coord[5];
// double AB = Math.Sqrt(Math.Pow(x1 - x2, 2) + Math.Pow(y1 - y2, 2));
// double BC = Math.Sqrt(Math.Pow(x1 - x3, 2) + Math.Pow(y1 - y3, 2));
// double AC = Math.Sqrt(Math.Pow(x2 - x3, 2) + Math.Pow(y2 - y3, 2));
// double p = (AB + BC + AC) / 2;
// double S = Math.Sqrt(p * (p - AB) * (p - BC) * (p - AC));
// Console.WriteLine(Math.Round(S, 2));
