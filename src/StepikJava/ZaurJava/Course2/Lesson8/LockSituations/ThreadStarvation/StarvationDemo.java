package StepikJava.ZaurJava.Course2.Lesson8.LockSituations.ThreadStarvation;

import javax.swing.*;
import java.awt.*;


public class StarvationDemo {

    // the object to synchronize
    final static Object sharedObj = new Object();

    public static void main(String[] args) {
        JFrame frame = createFrame();
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        for (int i = 0; i < 5; i++) {
            ProgressThread progressThread = new ProgressThread();
            frame.add(progressThread.getProgressComponent());
            progressThread.start();
        }

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static JFrame createFrame() {
        // Создает новый, изначально невидимый файл Frame с указанным заголовком
        JFrame frame = new JFrame("Starvation Demo");
        // Задаёт действие, которое будет выполняться по умолчанию, когда пользователь нажмёт «Закрыть» в этом окне
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300, 200));
        return frame;
    }


    private static class ProgressThread extends Thread {
        JProgressBar progressBar;

        ProgressThread() {
            progressBar = new JProgressBar();
            progressBar.setString(this.getName());
            progressBar.setStringPainted(true);
        }

        JComponent getProgressComponent() {
            return progressBar;
        }

        @Override
        public void run() {

            int c = 0;

            while (true) {
                synchronized (sharedObj) {
                    if (c == 100) {
                        c = 0;
                    }
                    progressBar.setValue(++c);
                    try {
                        // sleep the thread to simulate long-running task
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}














































