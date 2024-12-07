package StepikJava.ZaurJava.Course2.Lesson8.MethodsOfMultithreading.GetNameAndGetPriorityt;

public class Example1 {
    public static void main(String[] args) {

        MyThread5 myThread5 = new MyThread5();
        System.out.println("The Name of thread is '" + myThread5.getName() +
                "', and the priority is " + myThread5.getPriority());
        // "The Name of thread is 'Thread-0', and the priority is 5"

        System.out.println("--------------------------------------------------");

        MyThread5 myThread6 = new MyThread5();
        System.out.println("The Name of thread is '" + myThread6.getName() +
                "', and the priority is " + myThread6.getPriority());
        // "The Name of thread is 'Thread-1', and the priority is 5"

        System.out.println("--------------------------------------------------");

        // переопределим имя и приоритет потока
        myThread5.setName("myThread5");
        myThread5.setPriority(9);
        System.out.println("The Name of thread is '" + myThread5.getName() +
                "', and the priority is " + myThread5.getPriority());
        // "The Name of thread is 'myThread5', and the priority is 9"


        // можно установить дефолтные приоритеты:
        // .setPriority(Thread.MIN_PRIORITY) (== 1)
        // .setPriority(Thread.NORM_PRIORITY) (== 5)
        // .setyPriority(Thread.MAX_PRIORITY) (== 10)

        System.out.println("--------------------------------------------------");

        myThread6.setName("myThread6");
        myThread6.setPriority(Thread.NORM_PRIORITY);
        System.out.println("The Name of thread is '" + myThread6.getName() +
                "', and the priority is " + myThread6.getPriority());
        // "The Name of thread is 'myThread6', and the priority is 5"
    }
}
