package StepikJava.ZaurJava.ProjectStudent;

public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private int year;
    private int markMath;
    private int markEconomic;
    private int markForeingLanguage;

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(int id, String firstName, String lastName, int year) {
        this(id, firstName, lastName);
        this.year = year;
    }

    public Student(int id, String firstName, String lastName, int year,
                   int markMath, int markEconomic, int markForeingLanguage) {
        this(id, firstName, lastName, year);
        this.markMath = markMath;
        this.markEconomic = markEconomic;
        this.markForeingLanguage = markForeingLanguage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMarkMath() {
        return markMath;
    }

    public void setMarkMath(int markMath) {
        this.markMath = markMath;
    }

    public int getMarkEconomic() {
        return markEconomic;
    }

    public void setMarkEconomic(int markEconomic) {
        this.markEconomic = markEconomic;
    }

    public int getMarkForeingLanguage() {
        return markForeingLanguage;
    }

    public void setMarkForeingLanguage(int markForeingLanguage) {
        this.markForeingLanguage = markForeingLanguage;
    }

    /**
     * Метод возвращает среднеарифметическое число по оценкам студента
     * @return - среднеарифметическое число по оценкам
     */
    public double markSum() {
        return (getMarkMath() + getMarkEconomic() + getMarkForeingLanguage()) / 3.0;
    }

    public void getInfo() {
        System.out.println("The Student " + firstName + " " + lastName +
                " has an average mark: " + markSum());
    }

}























