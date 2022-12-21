int Factorial(int n)
{
    if (n == 1) return n;
    else return n * Factorial(n - 1);
}

int[] Move(int[] firstArray)
{
    int[] temporaryArray = new int[firstArray.Length];
    // for (int i = 0; i < temporaryArray.Length; i++)
    //     temporaryArray[i] = firstArray[i];
    Console.WriteLine($"Начальный массив: [{string.Join(", ", firstArray)}]");
    int l = temporaryArray.Length;
    
    if (l < 1) return firstArray;
    else
    {
        for (int j = 0; j < l - 1; j++)
        {
            for (int i = 0; i < l - 1; i++)
            {
                if (i < l / 2)
                {
                    temporaryArray[i - 1] = firstArray[i];

                }
                else
                {
                    temporaryArray[l - i - 1] = firstArray[i];

                }
            }
            Console.WriteLine($"Сдвиг: [{string.Join(", ", temporaryArray)}]");
        }
    }



    return firstArray;
    // return Move(temporaryArray, count + 1);

}





// int[] firstArray = Console.ReadLine().Split(" ").Select(x => int.Parse(x)).ToArray();
// int n = ;
int[] firstArray = new int[3] { 1, 2, 3 };
Console.WriteLine($"{Move(firstArray)}");



