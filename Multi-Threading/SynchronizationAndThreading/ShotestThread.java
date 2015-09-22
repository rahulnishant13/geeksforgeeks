/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package SynchronizationAndThreading;

/**
 *
 * @author RAHUL
 */
public class ShotestThread {

    public static void main(String [] Arg)
    {
        Thread t1 = new Thread(new Runnable() {

            public void run() {
                for (int i = 0; i < 10; i++) {
                     System.out.println("Running"+i);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {

            public void run() {
                for (int i = 0; i < 10; i++) {
                     System.out.println("Running"+i);
                }
            }
        });

        t1.start();
        t2.start();
    }
}
