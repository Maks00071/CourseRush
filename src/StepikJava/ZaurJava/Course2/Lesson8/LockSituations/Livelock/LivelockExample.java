package StepikJava.ZaurJava.Course2.Lesson8.LockSituations.Livelock;

public class LivelockExample {

    public static void main(String[] args) {

        final Worker worker1 = new Worker("Worker 1", true);
        final Worker worker2 = new Worker("Worker 2", true);

        final CommonResource commonResource = new CommonResource(worker1);

        new Thread(() -> {
            worker1.work(commonResource, worker2);
        }).start();

        new Thread(() -> {
            worker2.work(commonResource, worker1);
        }).start();

    }

    /*
    Worker 1: handover the resource to the worker Worker 2
    Worker 2: handover the resource to the worker Worker 1
    Worker 1: handover the resource to the worker Worker 2
    Worker 2: handover the resource to the worker Worker 1
    Worker 1: handover the resource to the worker Worker 2
    Worker 2: handover the resource to the worker Worker 1
    Worker 1: handover the resource to the worker Worker 2
    Worker 2: handover the resource to the worker Worker 1
    Worker 1: handover the resource to the worker Worker 2
    Worker 2: handover the resource to the worker Worker 1
    Worker 1: handover the resource to the worker Worker 2
    Worker 2: handover the resource to the worker Worker 1
    Worker 1: handover the resource to the worker Worker 2
    ...
    бесконечная работа
     */
}
