Console.Clear();

Console.WriteLine("Введите номер дня: ");
int n = Convert.ToInt32(Console.ReadLine());

if (n>7) Console.Write("Такого дня не существует");
if (n==1) Console.Write("No");
if (n==2) Console.Write("No");
if (n==3) Console.Write("No");
if (n==4) Console.Write("No");
if (n==5) Console.Write("No"); 
if (n==6) Console.Write("Yes");
if (n==7) Console.Write("Yes");   
