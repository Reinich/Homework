Console.Clear();
Console.Write("Введите первое число: ");
int n = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите второе число: ");
int m = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите третье число: ");
int i = Convert.ToInt32(Console.ReadLine());

int max=0;

if (n>m)
{    if (n>i)
        max=n;
}
else if (n==m)
    max=n;

if (m>i)
{    if (m>n)
        max=m;
}
else if (m==i)
    max=m;

if (i>n)
{    if (i>m)
        max=i;
}
else if (i==n)
    max=i;

Console.WriteLine("Наибольшее значение: " + max);


