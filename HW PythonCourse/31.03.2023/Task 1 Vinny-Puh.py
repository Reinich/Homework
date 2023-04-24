# Ритм есть, если число слогов (т.е. число гласных букв) в каждой фразе стихотворения одинаковое.
# Фраза может состоять из одного слова, если во фразе несколько слов, то они разделяются дефисами. Фразы
# отделяются друг от друга пробелами. “Парам пам-пам”, если с ритмом все ok и “Пам парам”, если с ритмом все не ok

def rhythm(f, text):
    return len(set(map(f, text))) <= 1


poem = list([i for i in input('Введите стихотворение через пробел: ').split()])
if rhythm(lambda x: x.count('а'), poem):
    print('Парам-пам-пам')
else:
    print('Пам парам')