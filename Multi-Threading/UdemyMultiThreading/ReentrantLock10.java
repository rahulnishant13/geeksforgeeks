/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UdemyMultiThreading;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RAHUL
 */

class ImplementReentrant
{
    private double count =0;
    private Lock lock = new ReentrantLock();
    private Condition con = lock.newCondition();
    
    private void increment()
    {
        for (double i = 0; i < 10; i++) {
            count++;
        }
    }

    public void firstThread() throws InterruptedException
    {
        lock.lock();
        System.out.println("waiting...");
        con.await();
        try{
            increment();
        }
        finally{
            lock.unlock();
        }
    }

    public void secondThread() throws InterruptedException
    {
        Thread.sleep(1000);
        lock.lock();
        System.out.println("Press Return key");
        new Scanner(System.in).nextLine();
        System.out.println("Return Pressed...");
        con.signal();
        try{
            increment();
        }
        finally{
            lock.unlock();
        }
    }
    public void finished()
    {
        System.out.println("Count is : "+count);
    }
}

public class ReentrantLock10 {
    public static void main(String [] arg){
        final ImplementReentrant obj = new ImplementReentrant();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    obj.firstThread();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ReentrantLock10.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    obj.secondThread();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ReentrantLock10.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ReentrantLock10.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.finished();
    }
}