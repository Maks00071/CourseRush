package StepikJava.ZaurJava.Course2.Lesson8.SynchronizedBlocks.MobileExample;

public class WhatsappRunnableIMpl implements Runnable {

    @Override
    public void run() {
        new MobileCalls().whatsappCall();
    }
}
