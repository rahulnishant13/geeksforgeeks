/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UdemyMultiThreading.WaitAndNotify;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RAHUL
 */

public class PrintOddEven {
    static Object lock = new Object();

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        final int x = sc.nextInt();
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                synchronized(lock)
                {
                    for(int i =1; i <= x; i=i+2)
                    {
                        System.out.println( i );

                        try {
                            lock.notify();
                            if(i == x)
                                return;
                            lock.wait();
                        } catch (InterruptedException ex) {
                            Logger.getLogger(PrintOddEven.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){
            public void run(){
                synchronized(lock)
                {
                    for(int i =2; i <= x; i=i+2)
                    {
                        System.out.println( i );
                        try {
                            lock.notify();
                            if(i == x)
                                return;
                            lock.wait();
                        } catch (InterruptedException ex) {
                            Logger.getLogger(PrintOddEven.class.getName()).log(Level.SEVERE, null, ex);
                        }
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
            Logger.getLogger(PrintOddEven.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
