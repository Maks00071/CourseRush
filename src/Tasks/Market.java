package Tasks;

/*
Тебя отправили в магазин за покупками и сказали, что нужно купить батон, а если будут яйца,
то взять десять штук.
Разберись, почему метод "makePurchases" независимо от переданных аргументов всегда выводит
в консоль "Купил 10 батонов", и исправь его.
Метод "main" не участвует в проверке.

Требования:
•	Нельзя изменять поле "hasEggs" класса "Market".
•	В классе "Market" должен быть статический, публичный "void" метод "makePurchases(boolean)".
•	Если метод "makePurchases(boolean)" вызывается с аргументом "false", то он должен вывести
    в консоль: "Купил 1 батон".
•	Если метод "makePurchases(boolean)" вызывается с аргументом "true", то он должен вывести
    в консоль: "Купил 10 батонов".
*/

public class Market {
    private static boolean hasEggs = true;

    public static void main(String[] args) {
        boolean hasEggs = false;
        makePurchases(hasEggs);
    }

    public static void makePurchases(boolean hasEggs) {
        if (hasEggs) {
            System.out.println("Купил 10 батонов");
        } else {
            System.out.println("Купил 1 батон");
        }
    }
}















