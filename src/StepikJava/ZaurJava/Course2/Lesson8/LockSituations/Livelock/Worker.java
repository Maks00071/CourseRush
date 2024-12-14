package StepikJava.ZaurJava.Course2.Lesson8.LockSituations.Livelock;

public class Worker {

    private String name;
    private boolean active;

    public Worker(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public synchronized void work(CommonResource commonResource, Worker otherWorker) {
        while (active) {

            // wait for the resource to become available
            if (commonResource.getOwner() != this) {
                try {
                    wait(10);
                } catch (InterruptedException e) {
                    // ignore
                }
                continue;
            }

            // if other worker is also active let it do it's work first
            if (otherWorker.isActive()) {
                System.out.println(getName() +
                        ": handover the resource to the worker " +
                        otherWorker.getName());

                commonResource.setOwner(otherWorker);
                continue;
            }

            // now use the commonResource
            System.out.println(getName() + ": working on the common resource");
            active = false;
            commonResource.setOwner(otherWorker);

        }
    }
}





































