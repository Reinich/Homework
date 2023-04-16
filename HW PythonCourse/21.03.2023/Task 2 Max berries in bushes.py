# Собираем ягоды с кустов
from random import randint

n = int(input('Количество кустов: '))
bush = list()
for i in range(n):
    x = randint(1, 10)
    bush.append(x)
print(bush)

sum_max = 0
count_berries = []

for x in range(0, n):
    if x == n - 1:
        count_berries.append(sum_max := bush[-1] + bush[0] + bush[-2])
    else:
        count_berries.append(sum_max := bush[x - 1] + bush[x] + bush[x + 1])

print(f'Максимальное количество ягод: {max(count_berries)}')
