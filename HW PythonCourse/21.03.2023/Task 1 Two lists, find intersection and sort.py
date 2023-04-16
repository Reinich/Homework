# Даны два неупорядоченных набора целых чисел (может быть, с
# повторениями). Выдать без повторений в порядке возрастания все те числа, которые
# встречаются в обоих наборах.
from random import randint

n = int(input('Введите количество эл-ов в первом наборе: '))
m = int(input('Введите количество эл-ов во втором наборе: '))
list_n = []
list_m = []
print('Первый список: ')
for i in range(n):
    # x = randint(1, 10)
    x = int(input(f'Элемент {i+1}: '))
    list_n.append(x)
print(*list_n)
print('Второй список: ')
for i in range(m):
    # x = randint(1, 10)
    x = int(input(f'Элемент {i+1}: '))
    list_m.append(x)
print(*list_m)

list_n, list_m = set(list_n), set(list_m)
list_new = list(list_n.intersection(list_m))

tmp = 0
if list_new is None:
    print('Совпадений нет')
else:
    list_new.sort()
    print(*list_new)
