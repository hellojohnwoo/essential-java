package chap12;

import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread {
    private JLabel timerLabel;

    public TimerThread(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    @Override
    public void run() {
        int n = 0;
        while (true) {
            timerLabel.setText(Integer.toString(n));
            n++;
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                return;
            }
        }
    }
}

public class ThreadTimerEx01 extends JFrame {
    public ThreadTimerEx01() {
        setTitle("Thread of inherited TimeThreadEx01");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
        container.add(timerLabel);

        TimerThread timethread = new TimerThread(timerLabel);

        setSize(250,150);
        setVisible(true);

        timethread.start();
    }
    public static void main(String[] args) {
        new ThreadTimerEx01();
    }
}

