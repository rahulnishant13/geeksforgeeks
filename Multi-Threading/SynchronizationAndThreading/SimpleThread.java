/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package SynchronizationAndThreading;

/**
 *
 * @author RAHUL
 */
class MyThred extends Thread
{
    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Running" + i);
        }
    }
}

public class SimpleThread {

    public static void main( String []args)
    {
      MyThred t1 = new MyThred();
      t1.start();
      MyThred t2 = new MyThred();
      t2.start();

    }
}
