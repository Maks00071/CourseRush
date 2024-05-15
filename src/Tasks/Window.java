package Tasks;

/*
    <Оконные работы>
В классе "Window" есть метод "changeSize", который должен менять размеры окна на значения,
переданные в метод.
Но если ты запустишь программу, то убедишься, что этот метод не работает.
Тебе нужно исправить ошибки так, чтобы метод заработал.

Требования:
•	Объявление и инициализацию полей класса "Window" изменять нельзя.
•	Метод "changeSize" класса "Window" должен изменять значения полей класса согласно переданным данным.
•	Объявление метода "changeSize" и названия параметров изменять нельзя.
*/

public class Window {
    private int height = 2;
    private int width = 3;

    public void changeSize(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void printSize() {
        System.out.println("Height = " + height);
        System.out.println("Width = " + width);
    }
}
















