package Module2.Level5.Tasks.Generics;

/***** Несколько суперклассов для дженерика *****
 * Дан класс Solution, параметризированный T.
 * Ограничьте параметр T.
 * T должен быть наследником класса ClassForGenerics и одновременно реализовывать интерфейс InterfaceForGenerics.
 * Менять можно только класс Solution.
 * -----
 * Требования:
 * • Класс Solution должен быть параметризирован типом который является
 *   наследником класса ClassForGenerics и одновременно реализовывать интерфейс InterfaceForGenerics.
 * • Интерфейс InterfaceForGenerics не должен расширять другие интерфейсы.
 * • Класс ClassForGenerics не должен поддерживать интерфейс InterfaceForGenerics.
 * • Класс Solution не должен быть наследником класса ClassForGenerics.
 */

public class Solution<T extends ClassForGenerics & InterfaceForGenerics> {
    public static void main(String[] args) {
        Solution<TestClassGood> testClassSolution = new Solution<>();
        testClassSolution.check();
    }

    public void check() {
        System.out.println("Works!");
    }

    public static class TestClassGood extends ClassForGenerics implements InterfaceForGenerics {

    }

    public static class TestClassWrong1 extends ClassForGenerics {

    }

    public static class TestClassWrong2 implements InterfaceForGenerics {

    }
}





















