/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UdemyMultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author RAHUL
 */

class Proccessor implements Runnable
{
    private int id;

    public Proccessor(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("Strating : " +id);
        try {
            if(id == 2)
                Thread.sleep(4000);
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
        }

        System.out.println("Completed : "+id);
    }
}

public class ThreadPool {
    public static void main(String [] args)
    {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            executor.submit(new Proccessor(i));
        }

        executor.shutdown();

        System.out.println("All task Submitted.");
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException ex) {
        }

        System.out.println("All cmpleted ");
    }
}
