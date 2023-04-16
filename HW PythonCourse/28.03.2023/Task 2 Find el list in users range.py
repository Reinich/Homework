# Определить индексы элементов массива,значения которых принадлежат заданному диапазону

my_list = [int(i) for i in input('Введите элементы массива через пробел: ').split()]
users_range = [int(i) for i in input('Введите начало и конец диапазона через пробел: ').split()]

for i in range(len(my_list)):
    if my_list[i] in range(users_range[0], users_range[1] + 1):
        print(i, end=' ')