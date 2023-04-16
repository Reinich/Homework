# Требуется найти в массиве A[1..N] самый близкий по величине элемент
# к заданному числу X.Пользователь в первой строке вводит натуральное
# число N – количество элементов в массиве.В последующих строках
# записаны N целых чисел Ai.Последняя строка содержит число X

n = int(input('Введите количество эл-ов: '))
num = int(input('Введите искомый эл-т: '))
my_list = []
for i in range(1, n + 1):
    my_list.append(i)
print(*my_list)

if num <= 0:
    print(min(my_list))
if num in my_list:
    print(num)
if num > max(my_list):
    print(max(my_list))
