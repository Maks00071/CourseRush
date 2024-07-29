package Module2.Level3.Tasks;

/**
 * В этой задаче тебе нужно:
 * Создать интерфейс CanMove с методом speed.
 * Сделать так, чтобы speed возвращал значение типа Double и ничего не принимал в качестве аргументов.
 * Создать и унаследовать интерфейс CanFly от интерфейса CanMove.
 * Добавить в интерфейс CanFly метод speed.
 * Убедиться, что speed возвращает значение типа Double и принимает один параметр типа CanFly.
 * Требования:
 * • В классе Solution должен быть объявлен интерфейс CanMove.
 * • В классе Solution должен быть объявлен интерфейс CanFly.
 * • Интерфейс CanFly должен наследоваться от интерфейса CanMove.
 * • В интерфейсе CanMove должен быть объявлен метод speed без параметров и с типом возвращаемого значения Double.
 * • В интерфейсе CanFly должен быть объявлен метод speed c одним аргументом типа CanFly
 *   и с типом возвращаемого значения Double.
 */

public class AllThatMove {
    public static void main(String[] args) {

    }

    interface CanMove {
        Double speed();
    }

    interface CanFly extends CanMove {
        Double speed(CanFly canFly);
    }
}
































