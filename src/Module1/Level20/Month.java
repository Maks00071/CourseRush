package Module1.Level20;

import java.util.Arrays;

public enum Month {
    JANUARY("Январь", 31),
    FEBRUARY("Февраль", 28),
    MARCH("Март", 31),
    APRIL("Апрель", 30),
    MAY("Май", 31),
    JUNE("Июнь", 30),
    JULY("Июль", 31),
    AUGUST("Август", 31),
    SEPTEMBER("Сентябрь", 30),
    OCTOBER("Октябрь", 31),
    NOVEMBER("Ноябрь", 30),
    DECEMBER("Декабрь", 31);

    private String name;
    private int daysCount;

    Month(String name, int daysCount) {
        this.name = name;
        this.daysCount = daysCount;
    }

    public static Month[] getSummerMonths() {
        return new Month[] {JUNE, JULY, AUGUST};
    }

    public static Month[] getAutumnMonths() {
        return new Month[] {SEPTEMBER, OCTOBER, NOVEMBER};
    }

    public static Month[] getWinterMonths() {
        return new Month[] {DECEMBER, JANUARY, FEBRUARY};
    }

    public static Month[] getSpringMonths() {
        return new Month[] {MARCH, APRIL, MAY};
    }

    /**
     * Геттер
     * @return name - название месяца
     */
    public String getName() {
        return name;
    }

    /**
     * Сеттер
     * @param name - название месяца
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Геттер
     * @return daysCount - кол-во дней в месяце
     */
    public int getDaysCount() {
        return daysCount;
    }

    /**
     * Сеттер
     * @param daysCount - кол-во дней в месяце
     */
    public void setDaysCount(int daysCount) {
        this.daysCount = daysCount;
    }

    /**
     * Переопределние метода String toString
     * @return
     */
    @Override
    public String toString() {
        return "Month {" +
                "name = \'" + name + '\'' +
                ", daysCount = " + daysCount +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Month.getSummerMonths()));
    }
}




















