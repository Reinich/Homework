Console.Clear();

int[] coo = Console.ReadLine().Split(" ").Select(x => int.Parse(x)).ToArray();

Console.WriteLine($"{0.5 * (Math.Abs((coo[2]-coo[0])*(coo[5]-coo[1])-(coo[4]-coo[0])*(coo[3]-coo[1])))}");