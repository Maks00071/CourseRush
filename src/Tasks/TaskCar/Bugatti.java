package Tasks.TaskCar;

/*
Ты сделал предзаказ на новенькую Bugatti ровно полгода назад. Сейчас июнь, и было бы
неплохо все-таки ездить на кабриолете. Но ты забыл, в каком кузове заказывал машину.
Твоя задача — добавить функциональность для получения текущей конфигурации и изменения её
при необходимости. Для этого создай геттеры и сеттеры.

Требования:
•	В классе Bugatti должно быть три поля: "String" color, "int" year, "String" body.
•	В классе Bugatti должен быть конструктор по умолчанию.
•	В классе Bugatti должен быть публичный геттер "getBody" для поля body.
•	В классе Bugatti должен быть публичный сеттер "setBody(String)" для поля body.
*/

public class Bugatti {
    private String color = "BLACK";
    private int year = 2020;
    private String body = "Coupe";

    public Bugatti() {}

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
