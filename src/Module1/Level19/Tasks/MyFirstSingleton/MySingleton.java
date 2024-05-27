package Module1.Level19.Tasks.MyFirstSingleton;

/*
MySingleton — это пример реализации паттерна синглтон с помощью перечисления.
Сделай так, чтобы при вызове метода main перед строкой "Экземпляр синглтона: INSTANCE"
на экран вывелась строка "создание экземпляра...".*/

public enum MySingleton {
    INSTANCE;

    private MySingleton() {
        System.out.println("создание экземпляра...");
    }
}
