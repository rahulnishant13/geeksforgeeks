/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UdemyMultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RAHUL
 */



public class MultipleLock
{
    private Object block1 = new Object();
    private Object block2 = new Object();
    List<Integer> list1 = new ArrayList<Integer>();
    List<Integer> list2 = new ArrayList<Integer>();
    Random rd = new Random();

    void stage1(){
    synchronized(block1){
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(MultipleLock.class.getName()).log(Level.SEVERE, null, ex);
        }
        list1.add(rd.nextInt(100));
        }
    }
    void stage2(){
        synchronized(block2){
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(MultipleLock.class.getName()).log(Level.SEVERE, null, ex);
        }
        list2.add(rd.nextInt(100));
        }
    }

    void process(){
        for(int i=0; i<1000; i++){
            stage1();
            stage2();
        }
    }

    public void main()
    {
        System.out.println("Hello");
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                process();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                process();
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(MultipleLock.class.getName()).log(Level.SEVERE, null, ex);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time : "+(end - start));
        System.out.println("List1 : "+list1.size() +"; List2 : "+list2.size());

    }
}
