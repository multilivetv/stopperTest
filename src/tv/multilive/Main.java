package tv.multilive;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.Timer;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {

    private JButton b1,b3;
    private JTextField t1;
    private JPanel panel1;
    private boolean stopFlag;
    private Timers t;

    public Main() {
        t = new Timers();
        JFrame frame = new JFrame("TEST");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnStartMouseClicked();
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopFlag = true;
            }
        });
    }

    private void btnStartMouseClicked() {//GEN-FIRST:event_btnStartMouseClicked
        stopFlag = false;

        Timer timer = new Timer();
        TimerTask tt = new TimerTask() {

            public void run() {
                    t.Starten();
                    t1.setText(t.sMinutes + ":" + t.sSeconds);
                    System.out.println(t.sMinutes + ":" + t.sSeconds);
                    if (stopFlag) {
                        timer.cancel();
                    }
            };

        };
        timer.schedule(tt, 1000, 1000);
    }

    public static void main(String[] args) {
        Main g = new Main();
    }
}
