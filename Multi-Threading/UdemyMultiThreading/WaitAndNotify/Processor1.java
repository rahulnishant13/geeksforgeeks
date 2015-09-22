/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UdemyMultiThreading.WaitAndNotify;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author RAHUL
 */
public class Processor1 {
    private LinkedList<Integer> list = new LinkedList<Integer>();
    private final int Limit = 10;
    private Object lock = new Object();
    
    public void produce() throws InterruptedException {
        int value = 0;
        while(true){
            synchronized(lock){
                while(list.size() == Limit){
                    lock.wait();
                }
                list.add(value++);
                lock.notify();
            }
        }
    }

    public void consume() throws InterruptedException {

        while(true){
            Random ran = new Random();
            synchronized(lock)
            {
                while(list.size() == 0)
                {
                   lock.wait();
                }
                System.out.print("List Size is : "+list.size());
                int value = list.removeFirst();
                System.out.println(" ; Value is : "+value);
                lock.notify();
            }
            Thread.sleep(ran.nextInt(1000));
            
        }
    }

}
