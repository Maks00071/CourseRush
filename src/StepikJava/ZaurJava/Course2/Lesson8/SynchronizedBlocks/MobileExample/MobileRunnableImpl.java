package StepikJava.ZaurJava.Course2.Lesson8.SynchronizedBlocks.MobileExample;

public class MobileRunnableImpl implements Runnable {

    @Override
    public void run() {
        new MobileCalls().mobileCall();
    }
}
