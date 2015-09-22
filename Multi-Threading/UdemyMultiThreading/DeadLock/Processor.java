/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UdemyMultiThreading.DeadLock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author RAHUL
 */
class Processor {
    Account acc1 = new Account();
    Account acc2 = new Account();
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    private void aquireLocks(Lock first, Lock second)
    {
        while(true){
        boolean gotFirst = false;
        boolean gotSecond = false;
        try{
            gotFirst = first.tryLock();
            gotSecond = second.tryLock();
        }
        finally{
            if(gotFirst && gotSecond)
                return;

            if(gotFirst)
                first.unlock();

            if(gotSecond)
                second.unlock();
        }
        }
    }

    public void firstThread() throws InterruptedException
    {
        Random ran = new Random();
        for (int i = 0; i < 10000; i++)
        {
            aquireLocks(lock1, lock2);
            try{
                Account.tranfer(acc1, acc2, ran.nextInt(100));
            }
            finally{
                lock1.unlock();
                lock2.unlock();
            }
        }
    }
    public void secondThread() throws InterruptedException
    {
        Random ran = new Random();
        for (int i = 0; i < 10000; i++)
        {
            aquireLocks(lock2, lock1);
            try{
                Account.tranfer(acc2, acc1, ran.nextInt(100));
            }
            finally{
                lock1.unlock();
                lock2.unlock();
            }
        }
    }
    public void finished()
    {
        System.out.println("Acnt 1 balance : "+acc1.getBalance());
        System.out.println("Acnt 2 balance : "+acc2.getBalance());
        System.out.println("Total balance : "+(acc1.getBalance() + acc2.getBalance()));
    }
}
