Console.Clear();
int n = 5;
Console.WriteLine("Вводите числа: ");

int numbers = Convert.ToInt32(Console.ReadLine());
string b = numbers.ToString();

int count = 0;

for (int i = 0; i < (n/2); i++)
{
    if (b[i]==b[n-i-1]) count++;
    else 
    {
        Console.WriteLine("Это число не палиндром");
        break;
    }
    if (count == 2) Console.WriteLine("Это число палиндром");
}
