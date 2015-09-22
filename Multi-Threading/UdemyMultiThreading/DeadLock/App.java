/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UdemyMultiThreading.DeadLock;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RAHUL
 */
public class App {

    public static void main(String[] args) {
        final Processor pro = new Processor();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pro.firstThread();
                } catch (InterruptedException ignored) {}
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pro.secondThread();
                } catch (InterruptedException ignored) {}
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        pro.finished();
    }
}