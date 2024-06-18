package Module1.Level24.Lesson.PatternDecorator;

/**
 * Строим наш дом
 */

public class Building {
    public static void main(String[] args) {

        System.out.println("Построим кирпичный двухэтажный дом с гаражом");
        System.out.println("------------------------------------------");
        //создадим дом
        House brickHouse = new BrickHouse();

        //добавим дому второй этаж
        brickHouse = new SecondFloor(brickHouse);
        //получим инфо о доме
        System.out.println(brickHouse.getInfo()); //=> Кирпичный дом + второй этаж
        //получим цену дома
        System.out.println(brickHouse.getPrice()); //=> 40000
        //добавим к дому гараж
        brickHouse = new Garage(brickHouse);
        System.out.println(brickHouse.getInfo()); //=> Кирпичный дом + второй этаж + гараж
        System.out.println(brickHouse.getPrice()); //=> 45000
        System.out.println("==========================================");
        System.out.println("Построим деревянный двухэтажный дом с гаражом");
        System.out.println("------------------------------------------");

        House woodenHouse = new WoodenHouse();
        woodenHouse = new SecondFloor(woodenHouse);
        System.out.println(woodenHouse.getInfo()); //=> Деревянный дом + второй этаж
        System.out.println(woodenHouse.getPrice()); //=> 45000
        woodenHouse = new Garage(woodenHouse);
        System.out.println(woodenHouse.getInfo()); //=> Деревянный дом + второй этаж + гараж
        System.out.println(woodenHouse.getPrice()); //=> 50000
        System.out.println("==========================================");
    }
}




























