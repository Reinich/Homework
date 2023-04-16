# На столе лежат n монеток.Некоторые из них лежат вверх решкой, а
# некоторые – гербом.Определите минимальное число монеток, которые нужно
# перевернуть, чтобы все монетки были повернуты вверх одной и той же стороной.
# Выведите минимальное количество монет, которые нужно перевернуть

from random import randint
count_coin = int(input('Введите количество монеток: '))
num_coin = []
coin_ind, coin_1, coin_0 = 0, 0, 0

for i in range(count_coin):
    coin = randint(0, 1)
    if coin == 1:
        coin_1 += 1
    else:
        coin_0 += 1
    num_coin.append(coin)

print(num_coin)
if coin_0 > coin_1:
    print(f'Нужно перевернуть {coin_1} монетку/ок на 0')
else:
    print(f'Нужно перевернуть {coin_0} монетку/ок на 1')

