package StepikJava.ZaurJava.Course2.Lesson8.SynchronizedBlocks.MobileExample;

public class MobileCalls {

    static final Object lock = new Object();

    public void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends");
        }
    }

    public void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call ends");
        }
    }

    public void whatsappCall() {
        synchronized (lock) {
            System.out.println("Whatsapp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Whatsapp call ends");
        }
    }

    public static void main(String[] args) {
        // создадим потоки
        Thread thread1 = new Thread(new MobileRunnableImpl());
        Thread thread2 = new Thread(new SkypeRunnableImpl());
        Thread thread3 = new Thread(new WhatsappRunnableIMpl());

        // запустим потоки
        thread1.start();
        thread2.start();
        thread3.start();

    }
}


































