package Tasks.NestedClass;

/*
Двигатель — сложный механизм, для описания которого недостаточно обычной переменной.
В классе "Car" создай внутренний класс ("inner class") "Engine". В классе "Engine" создай
"boolean" поле "isRunning", которое принимает значение "true", если двигатель запущен,
и "false" в противном случае. Также в этот класс добавь методы "start" и "stop", которые
будут запускать/останавливать двигатель (устанавливать соответствующее значение полю "isRunning").
Чтобы использовать двигатель, создай поле "engine" типа "Engine" в классе "Car".

Требования:
•	В классе "Car" нужно создать внутренний класс ("inner class") "Engine".
•	В классе "Engine" должно существовать приватное поле "isRunning" типа "boolean".
•	В классе "Engine" должен существовать публичный метод "void start", который устанавливает
        значение "true" полю "isRunning".
•	В классе "Engine" должен существовать публичный метод "void stop", который устанавливает
        значение "false" полю "isRunning".
•	В классе "Car" должно существовать поле "engine" типа "Engine".
*/

public class Car {
    private Engine engine = new Engine();
    class Engine {
        private boolean isRunning;

        public void start() {
            isRunning = true;
        }

        public void stop() {
            isRunning = false;
        }
    }
}
