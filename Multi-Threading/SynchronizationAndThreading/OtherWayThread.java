/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package SynchronizationAndThreading;

class TestThread implements Runnable
{
    public void run()
    {
        for (int i = 0; i<10; i++) {
          System.out.println("Running" + i);

        }
    }
}

public class OtherWayThread {

    public static void main(String [] args)
    {
        Thread t1 = new Thread(new TestThread());
        Thread t2 = new Thread(new TestThread());
        t1.start();
        t2.start();
    }
}
