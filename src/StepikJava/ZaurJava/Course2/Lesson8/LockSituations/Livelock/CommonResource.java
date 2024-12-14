package StepikJava.ZaurJava.Course2.Lesson8.LockSituations.Livelock;

public class CommonResource {

    private Worker owner;

    public CommonResource(Worker owner) {
        this.owner = owner;
    }

    public Worker getOwner() {
        return owner;
    }

    // только один поток в моменте может устанавливать владельца
    public synchronized void setOwner(Worker owner) {
        this.owner = owner;
    }
}
