package Tasks.TaskEarth;

/*
Как известно, на планете Земля есть 6 материков. Создай для каждого материка собственный класс.
В каждом классе должно быть поле, которое хранит площадь соответствующего материка.
Площадь материка нужно указывать при его создании, и она должна быть неизменяемой.
Ты можешь использовать любые числа для задания площади материков.

Требования:
•	В отдельных файлах создай публичные классы Africa, Antarctica, Australia, Eurasia,
    NorthAmerica, SouthAmerica.
•	В каждом из созданных классов должно быть private final int поле area.
•	В каждом из созданных классов должен быть публичный конструктор с аргументом типа int,
    который будет инициализировать поле area.
•	В методе main класса Earth создай 6 разных материков и передай в них значения площадей.
*/

public class Earth {
    public static void main(String[] args) {
        SouthAmerica southAmerica = new SouthAmerica(17_800_000);
        NorthAmerica northAmerica = new NorthAmerica(24_400_000);
        Eurasia eurasia = new Eurasia(54_600_000);
        Australia australia = new Australia(7_700_000);
        Antarctica antarctica = new Antarctica(14_100_000);
        Africa africa = new Africa(30_300_000);
    }
}


















