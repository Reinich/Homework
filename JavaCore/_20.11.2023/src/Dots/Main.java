package Dots;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
3.**** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
*/
public class Main {
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';
    private static final char DOT_EMPTY = '*';
    private static int[] dot;
    private static final int WIN_COUNT = 4;

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    private static char[][] field;
    private static int fieldSizeX;
    private static int fieldSizeY;


    public static void main(String[] args) {
        while (true) {
            initialize();
            printField();
            while (true) {
                dot = humanTurn();
                printField();
                if (checkGameState(DOT_HUMAN, "Вы победили!")) {
                    break;
                }
                aiTurn();
                printField();
                if (checkGameState(DOT_AI, "Победил компьютер!"))
                    break;
            }
            System.out.print("Желаете сыграть еще раз? (Y - да): ");
            if (!scanner.next().equalsIgnoreCase("Y"))
                break;
        }
    }

    /**
     * Инициализация игрового поля
     */
    static void initialize() {
        try {
            System.out.print("Введите количество строк: ");
            fieldSizeY = Integer.parseInt(scanner.next());
            System.out.print("Введите количество столбцов: ");
            fieldSizeX = Integer.parseInt(scanner.next());
            field = new char[fieldSizeY][fieldSizeX];
            for (int y = 0; y < fieldSizeY; y++) {
                for (int x = 0; x < fieldSizeX; x++) {
                    field[y][x] = DOT_EMPTY;
                }
            }
        } catch (NumberFormatException e){
            System.out.println("Некорреткно введено число.\nПовторите попытку: ");
            initialize();
        }
    }

    /**
     * Печать текущего состояния игрового поля
     */
    private static void printField() {
        System.out.print(" \t");

        for (int i = 0; i < fieldSizeX; i++) {
            System.out.print((i + 1) + "\t");
        }

        System.out.println();

        for (int y = 0; y < fieldSizeY; y++) {
            if (y >= 9) {
                System.out.print(y + 1 + "| ");
            } else {
                System.out.print(y + 1 + " | ");
            }

            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + " | ");
            }
            System.out.println();
        }

        System.out.print("-".repeat(fieldSizeX * 4 + 3));
        System.out.println();
    }

    /**
     * Ход игрока (человека)
     */
    static int[] humanTurn() {
        int x;
        int y;

        do {
            System.out.print("Введите координаты хода X и Y\nчерез пробел: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }
        while (!isCellValid(x, y) || !isCellEmpty(x, y));

        int[] dot = {y, x};

        field[y][x] = DOT_HUMAN;
        return dot;
    }

    /**
     * Ход игрока (компьютера)
     */
    static void aiTurn() {
        int x;
        int y;

        do {
            x = random.nextInt(fieldSizeX);
            y = random.nextInt(fieldSizeY);
        }
        while (!isCellEmpty(x, y));

        field[y][x] = DOT_AI;
    }

    /**
     * Проверка, является ли ячейка игрового поля пустой
     *
     * @param x
     * @param y
     * @return
     */
    static boolean isCellEmpty(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }

    /**
     * Проверка доступности ячейки игрового поля
     *
     * @param x
     * @param y
     * @return
     */
    static boolean isCellValid(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }


    /**
     * Метод проверки состояния игры
     *
     * @param per фишка игрока
     * @param s   победный слоган
     * @return результат проверки состояния игры
     */
    static boolean checkGameState(char per, String s) {
        if (checkWin(per, dot)) {
            System.out.println(s);
            return true;
        }
        if (checkDraw()) {
            System.out.println("Ничья!");
            return true;
        }
        return false; // Игра продолжается
    }

    /**
     * Проверка на ничью
     *
     * @return
     */
    static boolean checkDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isCellEmpty(x, y))
                    return false;
            }
        }
        return true;
    }

    /**
     * Проверка победы игрока
     *
     * @param per фишка игрока
     * @param dot координаты хода игрока
     * @return признак победы
     */
    static boolean checkWin(char per, int[] dot) {
        // Проверка по трем горизонталям
        if (checkHorizontalWin(dot[0], per)) return true;
        if (checkVerticalWin(dot[1], per)) return true;
        if (checkDiagonalRightWin(per)) return true;
        if (checkDiagonalLeftWin(per)) return true;
        return false;
    }

    /**
     * Проверка победы по горизонтали
     *
     * @param y   последняя координата строки
     * @param per фишка игрока
     * @return
     */
    static boolean checkHorizontalWin(int y, char per) {
        int winCount = 0;
        for (int x = 0; x < fieldSizeY; x++) {
            if (field[y][x] == per) {
                winCount++;
                if (winCount == WIN_COUNT) {
                    return true;
                }
            } else {
                winCount = 0;
            }
        }
        return false;
    }

    /**
     * Проверка победы по вертикали
     *
     * @param x   последняя координата столбца
     * @param per фишка игрока
     * @return
     */
    static boolean checkVerticalWin(int x, char per) {
        int winCount = 0;
        for (int y = 0; y < fieldSizeY; y++) {
            if (field[y][x] == per) {
                winCount++;
                if (winCount == WIN_COUNT) {
                    return true;
                }
            } else {
                winCount = 0;
            }
        }
        return false;
    }

    /**
     * Проверка победы по диагонали справа налево
     * @param per фишка игрока
     * @return
     */
    static boolean checkDiagonalRightWin(char per) {
        int winCount = 0;
        for (int k = 0; k < fieldSizeY + fieldSizeX; k++) {
            for (int i = 0; i < fieldSizeY; i++) {
                for (int j = 0; j < fieldSizeX; j++) {
                    if (i + j + 1 == k) {
                        if (field[i][j] == per) {
                            winCount++;
                            if (winCount == WIN_COUNT) {
                                return true;
                            }
                        } else {
                            winCount = 0;
                        }
                    }

                }
            }
        }
        return false;
    }

    /**
     * Проверка победы по диагонали слева направо
     * @param per фишка игрока
     * @return
     */
    static boolean checkDiagonalLeftWin(char per) {
        int winCount = 0;
        for (int k = 0; k < fieldSizeX + fieldSizeY + 1; k++) {
            for (int i = 0; i < fieldSizeY; i++) {
                for (int j = 0; j < fieldSizeX; j++) {
                    if (i - j + fieldSizeY == k) {
                        if (field[i][j] == per) {
                            winCount++;
                            if (winCount == WIN_COUNT) {
                                return true;
                            }
                        } else {
                            winCount = 0;
                        }
                    }

                }
            }
        }
        return false;
    }
}
