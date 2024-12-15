package StepikJava.ZaurJava.Course2.Lesson8.LockAndReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Call {

    private Lock lock = new ReentrantLock();

    /**
     * Method of mobile call
     */
    public void mobileCall() {
        lock.lock();

        try {
            System.out.println("Mobile call starts!");
            Thread.sleep(1000);
            System.out.println("Mobile call ends!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    /**
     * Method of Skype call
     */
    public void skypeCall() {
        lock.lock();

        try {
            System.out.println("Skype call starts!");
            Thread.sleep(5000);
            System.out.println("Skype call ends!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    /**
     * Method of WhatsApp call
     */
    public void whatsappCall() {
        lock.lock();

        try {
            System.out.println("WhatsApp call starts!");
            Thread.sleep(7000);
            System.out.println("WhatsApp call ends!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


}












































