/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UdemyMultiThreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RAHUL
 */
public class Synchrnizd
{
    private int count = 0;
    private synchronized void increment()
    {
        count++; // it will creat a insentric mutex or lock providing only 1 thread access at a tym
    }

    public static void main(String [] args)
    {
        Synchrnizd obj = new Synchrnizd();
        obj.getCount();
    }

    void getCount()
    {
        Thread t1 = new Thread(new Runnable()
        {
            public void run()
            {
                for(int i =0; i<1000; i++)
                {
                    //count++;
                    increment();
                }
            }
        });
        
        Thread t2 = new Thread(new Runnable()
        {
            public void run()
            {
                for(int i =0; i<1000; i++)
                {
                    //count++;
                    increment();
                }
            }
        });

        t1.start(); // return immediately bt thread continue executing
        t2.start();
        try {
            t1.join(); // it will nt allow return till the whole thread executed
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Synchrnizd.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(count);
    }
}
