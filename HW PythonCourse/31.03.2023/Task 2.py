# Напишите функцию которая принимает в качестве аргумента функцию, вычисляющую элемент по номеру строки и столбца.
# Аргументы num_rows и num_columns указывают число строк и столбцов таблицы, которые должны быть распечатаны.
# Нумерация строк и столбцов идет с единицы


def operation_table(operation, x, y):
    for i in range(1, y + 1):
        print(*[(i*j) for j in range(1, x+1)], sep='\t')

    # arr = '\n'.join(['\t'.join([str(j) for j in i]) for i in res]) красивый вывод говна


num_rows = int(input('Введите количество строк: '))
num_columns = int(input('Введите количество столбцов: '))
operation_table(lambda x, y: x * y, num_rows, num_columns)
