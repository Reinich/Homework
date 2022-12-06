Console.Clear();
int n = 5;
int[] a = new int[n];
Console.WriteLine("Вводите числа: ");
for (int i = 0; i < n; i++)
{
    a[i] = Convert.ToInt32(Console.ReadLine());
}

int count = 0;

for (int i = 0; i < (n/2); i++)
{
    if (a[i]==a[n-i-1]) count++;
    else 
    {
        Console.WriteLine("Это число не палиндром");
        break;
    }
    if (count == 2) Console.WriteLine("Это число палиндром");
}
