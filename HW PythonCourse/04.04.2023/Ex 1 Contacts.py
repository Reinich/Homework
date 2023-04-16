# Создать телефонный справочник с возможностью импорта и экспорта данных в формате .txt. Фамилия, имя, отчество, номер
# телефона - данные, которые должны находиться в файле. Ваша программа не должна быть линейной
# 1. Программа должна выводить данные
# 2. Программа должна сохранять данные в текстовом файле
# 3. Пользователь может ввести одну из характеристик для поиска определенной записи(Например имя или фамилию человека)
# 4. Использование функций.


def find_info():
    find = input('Введите данные для поиска: ')
    with open(PATH, 'r', encoding='utf-8') as file:
        for line in file:
            if find.casefold() in line.casefold():
                print(line)


def read_file():
    with open(PATH, 'r', encoding='utf-8') as file:
        for line in file:
            print(line.strip())


def write_file():
    with open(PATH, 'a', encoding='utf-8') as file:
        file.writelines('\n' + input('Введите номер телефона и ФИО: '))


def change_file():
    find = input('Введите данные для поиска: ')
    list_info = []  # создаем лист для заполнения строками
    count_match = 0  # счетчик для повторов, для дальнейшей проверки
    with open(PATH, 'r+', encoding='utf-8') as f:
        for line_2 in f:  # Считаем количество совпадений
            if find.casefold() in line_2.casefold():
                count_match += 1
    with open(PATH, 'r+', encoding='utf-8') as f:
        for line in f:
            if find.casefold() in line.casefold():  # Если то, что мы ищем в строке:
                print()
                print(*line.strip().split(" ")[1:])
                if input("\nЭто нужный человек? Да/Нет: ") == "Да".casefold():  # Подходит ли нам эта строка
                    lst = line.strip().split(' ')  # Разделяем ее в лист
                    phrase = str('Что вы хотите изменить?:\n'
                                 'Введите 1 для изменения в номере телефона.\n'
                                 'Введите 2 для изменения фамилии.\n'
                                 'Введите 3 для изменения имени.\n'
                                 'Введите 4 для изменения отчества.\n'
                                 'Введите 5 для выхода.\n')
                    num_change = input(f'{phrase}')  # Пришлось вынести запрос дополнительно вне зацикливания
                    # чтобы можно было без изменений сразу выйти и не потерять данные
                    if num_change != '5':
                        while num_change != '5':  # Зацикливаем вопрос об изменениях
                            new_info = input('Введите информацию, на которую нужно поменять: ')  # Что нужно изменить
                            match num_change:
                                case '1':  # Если нужно изменить телефон
                                    lst[0] = new_info
                                    list_info.append(lst := ' '.join(lst))
                                    print(lst, '\n')
                                case '2':  # Если нужно изменить фамилию
                                    lst[1] = new_info
                                    list_info.append(lst := ' '.join(lst))
                                    print(lst, '\n')
                                case '3':  # Если нужно изменить имя
                                    lst[2] = new_info
                                    list_info.append(lst := ' '.join(lst))
                                    print(lst, '\n')
                                case '4':  # Если нужно изменить отчество
                                    lst[3] = new_info
                                    list_info.append(lst := ' '.join(lst))
                                    print(lst, '\n')
                            num_change = input(f'Хотите изменить что-то еще?\n{phrase}')
                    else:
                        list_info.append(lst := ' '.join(lst))
                        break
                elif count_match >= 2:  # Если это не тот человек, которого нужно изменить, и при этом есть еще -
                    # счетчик больше или равен 2
                    list_info.append(line)
                    count_match -= 1
                else:
                    list_info.append(line)  # Если совпадений по поиску больше нет, добавляем, чтобы в конце
                    # перезаписалось все, что было
                    print('Совпадений больше нет - ничего не изменится.')
            elif find.casefold() not in line.casefold():
                list_info.append(line)  # Если искомого элемента нет в строке
    with open(PATH, 'w+', encoding='utf-8') as f:  # Перезапись строк
        for el in list_info:
            el.strip().split()
            f.writelines(el)


def remove_info():
    find = input('Введите данные для поиска: ')
    list_info = []
    with open(PATH, 'r+', encoding='utf-8') as f:
        for line in f:
            if find.casefold() not in line.casefold():
                list_info.append(line)
            elif input(f"\n{line}\nЭто нужный человек? Да/Нет: ") == "Да".casefold():
                continue
            else:
                list_info.append(line)
    with open(PATH, 'w+', encoding='utf-8') as f:
        for el in list_info:
            el.strip().split()
            f.writelines(el)


PATH = "Телефонный справочник.txt"  # r'folder\new_file.txt'   r в начале делает строку - сырой, \n и \t не будут мешать
phrase_2 = str(('Главное меню.'
                'Выберите запрос:\n'
                '1. Просмотреть телефонный справочник\n'
                '2. Добавить новый контакт\n'
                '3. Найти информацию по Фамилии, Имени, Отчеству или номеру\n'
                '4. Редактировать информацию контакта\n'
                '5. Удалить контакт\n'
                '6. Выход\n'))
while (ask := input(phrase_2)) != '6':
    match ask:
        case '1':
            read_file()
            print()
        case '2':
            write_file()
            print()
        case '3':
            find_info()
            print()
        case '4':
            change_file()
            print()
        case '5':
            remove_info()
            print()


# +79002054131 Иванов Илья Борисович
# +79215411548 Петров Сергей Петрович
# +79127864131 Сидоров Андрей Сергеевич
# +75679712354 Пугачева Алла Сергеевна
# +79994578913 Андреева Ольга Семеновна
# +79184561783 Сидорова Алла Николаевна
