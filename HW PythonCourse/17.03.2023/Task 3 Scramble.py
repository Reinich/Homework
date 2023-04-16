#  Английский алфавит: A, E, I, O, U, L, N, S, T, R – 1 очко;
#  D, G – 2 очка; B, C, M, P – 3 очка; F, H, V, W, Y – 4 очка; K – 5 очков; J, X – 8 очков;
#  Q, Z – 10 очков. Русский алфавит: А, В, Е, И, Н, О, Р, С, Т – 1 очко; Д, К, Л, М, П, У – 2 очка;
#  Б, Г, Ё, Ь, Я – 3 очка; Й, Ы – 4 очка; Ж, З, Х, Ц, Ч – 5 очков; Ш, Э, Ю – 8 очков; Ф, Щ, Ъ – 10 очков.
#  Напишите программу, которая вычисляет стоимость введенного пользователем слова.
#  Будем считать, что на вход подается только одно слово, которое содержит либо только
#  английские, либо только русские буквы.

en_dict = {1: ['A', 'E', 'I', 'O', 'U', 'L', 'N', 'S', 'T', 'R'],
           2: ['D', 'G'],
           3: ['B', 'C', 'M', 'P'],
           4: ['F', 'H', 'V', 'W', 'Y'],
           5: ['K'],
           8: ['J', 'X'],
           10: ['Q', 'Z']
           }
ru_dict = {1: ['А', 'В', 'Е', 'И', 'Н', 'О', 'Р', 'С', 'Т'],
           2: ['Д', 'К', 'Л', 'М', 'П', 'У'],
           3: ['Б', 'Г', 'Ё', 'Ь', 'Я'],
           4: ['Й', 'Ы'],
           5: ['Ж', 'З', 'Х', 'Ц', 'Ч'],
           8: ['Ш', 'Э', 'Ю'],
           10: ['Ф', 'Щ', 'Ъ']
           }
word = input('Введите слово: ')
sum_char = 0
ru_word, en_word = 0, 0

for i in word:
    for k in ru_dict.keys():
        if i.upper() in ru_dict.get(k):
            ru_word += 1
        elif i.upper() in en_dict.get(k):
            en_word += 1
if ru_word > 0 and en_word > 0:
    print('В слове присутствует буква другого языка. Повторите попытку.')
else:
    for i in word:
        for j in ru_dict.keys():
            for k in range(len(ru_dict[j])):
                if i.casefold() == ru_dict[j][k].casefold():
                    sum_char += j

    for i in word:
        for j in en_dict.keys():
            for k in range(len(en_dict[j])):
                if i.casefold() == en_dict[j][k].casefold():
                    sum_char += j
    print(sum_char)