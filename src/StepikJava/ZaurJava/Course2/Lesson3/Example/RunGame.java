package StepikJava.ZaurJava.Course2.Lesson3.Example;

public class RunGame {
    public static void main(String[] args) {

        // создадим участников игры
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 15);
        Schoolar schoolar3 = new Schoolar("Sergey", 12);
        Schoolar schoolar4 = new Schoolar("Olga", 14);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Ksenia", 18);
        Student student3 = new Student("Petr", 21);
        Student student4 = new Student("Nina", 19);

        Employee employee1 = new Employee("Maks", 37);
        Employee employee2 = new Employee("Mikhail", 47);
        Employee employee3 = new Employee("Makar", 29);
        Employee employee4 = new Employee("Tanya", 31);

        // создадим три команды
        Team<Schoolar> schoolarTeam1 = new Team<>("Dragons");
        Team<Schoolar> schoolarTeam2 = new Team<>("Sages");

        Team<Student> studentTeam1 = new Team<>("Force");
        Team<Student> studentTeam2 = new Team<>("Nick");

        Team<Employee> employeeTeam1 = new Team<>("Manager");
        Team<Employee> employeeTeam2 = new Team<>("Worker");

        // заполним команды участниками

        System.out.println("------------ Team of schoolar --------------");

        schoolarTeam1.addNewParticipant(schoolar1);
        schoolarTeam1.addNewParticipant(schoolar2);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        System.out.println("------------ Team of student --------------");

        studentTeam1.addNewParticipant(student1);
        studentTeam1.addNewParticipant(student2);
        studentTeam2.addNewParticipant(student3);
        studentTeam2.addNewParticipant(student4);

        System.out.println("------------ Team of employee --------------");

        employeeTeam1.addNewParticipant(employee1);
        employeeTeam1.addNewParticipant(employee2);
        employeeTeam2.addNewParticipant(employee3);
        employeeTeam2.addNewParticipant(employee4);

        System.out.println("------------ Start of Games --------------");

        // начнем игру
        schoolarTeam1.playWith(schoolarTeam2);
        studentTeam2.playWith(studentTeam1);
        employeeTeam1.playWith(employeeTeam2);

    }
}





























