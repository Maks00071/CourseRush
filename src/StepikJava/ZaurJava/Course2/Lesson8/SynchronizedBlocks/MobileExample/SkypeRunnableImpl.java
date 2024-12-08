package StepikJava.ZaurJava.Course2.Lesson8.SynchronizedBlocks.MobileExample;

public class SkypeRunnableImpl implements Runnable {

    @Override
    public void run() {
        new MobileCalls().skypeCall();
    }
}
