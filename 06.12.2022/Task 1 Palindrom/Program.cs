Console.Clear();
int n = 5;
Console.WriteLine("Вводите числа: ");

string? num = Convert.ToString(Console.ReadLine());
int count = 0;

for (int i = 0; i < (n/2); i++)
{
    if (num?[i]==num?[n-i-1]) count++;
    else 
    {
        Console.WriteLine("Это число не палиндром");
        break;
    }
    if (count == 2) Console.WriteLine("Это число палиндром");
}
