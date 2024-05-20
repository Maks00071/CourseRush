package Module1.Level19;

public class ExampleEnum {
    public static void main(String[] args) {
        enum Day {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }

        Day day = Day.MONDAY;
        System.out.println(day);
        System.out.println("-----------------");

        Day[] days = Day.values();
        for (Day elem : days) {
            System.out.println(elem);
        }
        System.out.println("-----------------");

        System.out.printf("Номер элемента \"MONDAY\" в массиве: %s%n", Day.MONDAY.ordinal());
        System.out.printf("Номер элемента \"FRIDAY\" в массиве: %s%n", Day.FRIDAY.ordinal());
        System.out.println("-----------------");

        System.out.printf("This is a String: %s%n", Day.MONDAY.toString());
        System.out.println("-----------------");
        System.out.printf("This is a object: %s%n", Day.valueOf("MONDAY"));
        System.out.println("-----------------");

        Day monday = Day.MONDAY; //записываем понедельник
        int indexOfMonday = monday.ordinal(); //получаем индекс понедельника
        Day newDay = Day.values()[indexOfMonday+2]; //получаем день недели на 2 дня позже понедельника
        System.out.printf("This is a new day: %s%n", newDay);
    }
}
















