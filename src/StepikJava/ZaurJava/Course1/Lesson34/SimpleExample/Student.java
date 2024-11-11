package StepikJava.ZaurJava.Course1.Lesson34.SimpleExample;

public class Student {

    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;


    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Student(String name, char sex, int age, int course) {
        this(name, sex, age);
        this.course = course;
    }

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this(name, sex, age, course);
        this.avgGrade = avgGrade;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return sex
     */
    public char getSex() {
        return sex;
    }

    /**
     *
     * @param sex
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    /**
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return course
     */
    public int getCourse() {
        return course;
    }

    /**
     *
     * @param course
     */
    public void setCourse(int course) {
        this.course = course;
    }

    /**
     *
     * @return avgGrade
     */
    public double getAvgGrade() {
        return avgGrade;
    }

    /**
     *
     * @param avgGrade
     */
    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

}






























