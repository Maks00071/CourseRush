package Module2.Level28.Tasks.LoadWindows;

/***** Переустановка винды *****
 * Реализуй классы OperatingSystem и Laptop.
 * -----
 * В OperatingSystem нужно:
 *  - добавить приватные поля name и version типа String, причем name должно быть неизменяемым,
 *    а version — изменяемым;
 *  - реализовать конструктор с двумя параметрами типа String, устанавливающий значения полям;
 *  - добавить геттеры и сеттеры для полей (сеттеры — там, где это возможно).
 * В Laptop нужно:
 *  - добавить приватные неизменяемые поля String name и OperatingSystem os;
 *  - реализовать конструктор с тремя параметрами типа String, устанавливающий значения полям;
 *  - добавить геттер для поля name;
 *  - добавить метод public void updateOS(String version), который должен обновлять версию операционной системы;
 *  - добавить метод public void printInfo(), который должен выводить в консоль имя ноутбука,
 *    имя и версию операционной системы в произвольном формате.
 * Требования:
 * • Должны быть созданы поля name и version в классе OperatingSystem и поля name и os в классе Laptop.
 * • В классах OperatingSystem и Laptop должны быть реализованы конструкторы согласно условию.
 * • В классах OperatingSystem и Laptop должны быть добавлены геттеры и сеттеры согласно условию.
 * • В классе Laptop должен быть реализован метод updateOS согласно условию.
 * • В классе Laptop должен быть реализован метод printInfo согласно условию.
 */

public class Solution {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("HP", "Windows", "3.1");
        Laptop laptop2 = new Laptop("Lenovo", "Linux Ubuntu", "16.4");
        Laptop laptop3 = new Laptop("Apple", "MacOS Monterey", "12.1");
        Laptop laptop4 = new Laptop("Google", "Chrome OS", "1.0");

        laptop1.updateOS("95");
        laptop1.printInfo();
    }
}
















