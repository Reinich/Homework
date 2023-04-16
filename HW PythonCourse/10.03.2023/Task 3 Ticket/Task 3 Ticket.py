# Вам требуется написать программу, которая проверяет счастливость билета.
# Т.е. билет с номером 385916 – счастливый, т.к. 3+8+5=9+1+6.

t = int(input('Введите номер билета: '))

f_half = t // 1000
s_half = t % 1000
Sum_f = 0
Sum_s = 0

while f_half != 0:
    Sum_f += f_half % 10
    f_half = f_half // 10
while s_half != 0:
    Sum_s += s_half % 10
    s_half = s_half // 10
if Sum_f == Sum_s:
    print('Билет счастливый!')
else:
    print('Билет выкидной:(')
