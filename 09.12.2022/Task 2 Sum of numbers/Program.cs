Console.Clear();

Console.Write("Введите число: ");
int n = Convert.ToInt32(Console.ReadLine());
string l = Convert.ToString(n);
int sum = 0;

for (int i = 0; i <= l.Length; i++)
{
    int tmp = n % 10;
    sum = sum + tmp;
    n /= 10;
}
Console.WriteLine(sum);