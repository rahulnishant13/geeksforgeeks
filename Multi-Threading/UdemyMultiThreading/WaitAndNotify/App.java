/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UdemyMultiThreading.WaitAndNotify;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RAHUL
 */
public class App {

    public static void main(String[] args) {
       // final Processor processor = new Processor(); //for wait nd notify
        final Processor1 pro = new Processor1();//for low-level synchronisation
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //processor.produce(); //for wait nd notify
                    pro.produce(); //for low-level synchronisation
                } catch (InterruptedException ignored) {}
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //processor.consume();  //for wait nd notify
                    pro.consume(); //for low-level synchronisation
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
    }
}