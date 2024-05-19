package Module1.Level18.MyGameMinesweeper;

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

/********Игра "Сапер"**************
Напишем увлекательную игру "Сапер".

Правила игры:
 1. Игровое поле разделено на смежные ячейки (квадраты), некоторые из которых «заминированы».
 2. Цель игры — разминировать поле, то есть открыть все ячейки без мин.
 3. Если открыта ячейка с миной, игра считается проигранной.
    Мины расставляются в случайном порядке.
 4. Если под открытой ячейкой мины нет, в ней появляется число, показывающее,
    сколько соседствующих с открытой ячейкой "заминировано". Используя эти числа,
    можно рассчитать расположение мин.
 5. Если под соседними ячейками тоже нет мин, открывается некоторая "незаминированная" область
    до ячеек, в которых есть цифры.
 6. "Заминированные" ячейки можно помечать флагом, чтобы случайно не открыть их.
    Количество флагов равно количеству мин на игровом поле.
 7. Если все "незаминированные" ячейки открыты, игра считается выигранной.

 Теперь приступаем к реализации игры:

    - Для начала создадим класс игры "MinesweeperGame", который будет реализовывать логику игры.
 Данный класс должен быть унаследован от класса "Game", который является частью
 крутого "игрового движка" JavaRush.
    - Этот и другие классы "движка" находятся в пакете com.javarush.engine.cell,
 и чтобы ими пользоваться, класс "MinesweeperGame" должен содержать такой импорт:
    import com.javarush.engine.cell.*;

Если ты все сделал правильно, после запуска приложения увидишь игровое поле.

Прежде чем ты начнешь, советуем прочесть статью про раздел "Игры".
 В ней ты найдешь информацию, которая будет полезна при написании игр.
Требования:
•	Должен существовать публичный класс "MinesweeperGame".
•	Класс "MinesweeperGame" должен быть наследником класса "Game".
•	В классе "MinesweeperGame" должен быть импорт всего содержимого
    пакета com.javarush.engine.cell.
 */

public class MinesweeperGame extends Game{
    private static final int SIDE = 9;
    private final GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;
    private static final String MINE = "\uDCA3"; //символ мины

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        openTile(x, y);
    }

    private void createGame() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                int randomNumber = getRandomNumber(10); //получаем цифры 0..9
                boolean isMine = randomNumber < 1;
                if (isMine) {
                    countMinesOnField++;
                }
                gameField[y][x] = new GameObject(x, y, isMine);
                setCellColor(x, y, Color.ORANGE);
            }
        }
        countMineNeighbors();
    }

    /***
     Метод проверяет все объекты игрового поля gameField на наличие мин.
     Если в ячейке находится мина, то кладем объект в массив
     ***/
    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> result = new ArrayList<>();
        for (int y = gameObject.y - 1; y <= gameObject.y + 1; y++) {
            for (int x = gameObject.x - 1; x <= gameObject.x + 1; x++) {
                if (y < 0 || y >= SIDE) {
                    continue;
                }
                if (x < 0 || x >= SIDE) {
                    continue;
                }
                if (gameField[y][x] == gameObject) {
                    continue;
                }
                result.add(gameField[y][x]);
            }
        }
        return result;
    }

    /**
     Считаем кол-во примыкающих ячеек с минами
     Метод проверяет каждую ячейку "gameField" на наличие мины. Если мины нет, то
     значит мы считаем кол-во примыкающих ячеек с минами. Кол-во записываем в
     переменную объекта "countMineNeighbors"
     */
    private void countMineNeighbors() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                GameObject gameObject = gameField[y][x];
                if (!gameObject.isMine) {
                    for (GameObject neighbor : getNeighbors(gameObject)) {
                        if (neighbor.isMine) {
                            gameObject.countMineNeighbors++;
                        }
                    }
                }
            }
        }
    }

    /**
     * Если в ячейке есть мина (isMine == true), то
     * метод отрисовывает в ячейке символ мины.
     * Иначе - метод отрисовывает количество примыкающих ячеек-мин
     * @param x - координата x
     * @param y - координата y
     */
    private void openTile(int x, int y) {
        GameObject gameObject = gameField[y][x];
        if (gameObject.isMine) {
            setCellValue(gameObject.x, gameObject.y, MINE);
        } else {
            setCellNumber(x, y, gameObject.countMineNeighbors);
        }
        gameObject.isOpen = true;
        setCellColor(x, y, Color.GREEN);
    }
}





















