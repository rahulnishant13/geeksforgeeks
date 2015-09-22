/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package SynchronizationAndThreading;

import java.util.logging.Level;
import java.util.logging.Logger;
import sun.font.TrueTypeFont;

/**
 *
 * @author RAHUL
 */

public class SyncThread {

    private  int count = 0;
    private boolean status = true;
    public synchronized boolean statusdata()
    {
        return status;
    }
    public synchronized void incriment()
    {
        count = count +  1;
       // System.out.print(count);
    }

    public static void main(String [] args)
    {

         final SyncThread obj1 = new SyncThread();


        Thread t1 = new Thread(new Runnable() {

            public void run() {
                for (int i = 0; i < 50;) {
                    if(obj1.statusdata()== false)
                    {
                 obj1.incriment();
                  System.out.println("t1"+obj1.count);
                 obj1.status= true;
                 i++;
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {

            public void run() {
                for (int i = 0; i < 50; ) {
                    if(obj1.statusdata()== true)
                    {
                 obj1.incriment();
                  System.out.println(obj1.count);
                 obj1.status= false;
                 i++;
                    }

                }
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
             t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(SyncThread.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        System.out.println(obj1.count);
    }
}
