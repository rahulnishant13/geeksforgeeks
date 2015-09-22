/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UdemyMultiThreading;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RAHUL
 */

public class ProducerConsumer {
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

    public static void main(String [] args)
    {
        Thread t1 = new Thread(new Runnable() {

            public void run() {
                try {
                    producer();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {

            public void run() {
                try {
                    consumer();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void producer() throws InterruptedException
    {
        Random random = new Random();

        while(true)
        {
            queue.put(random.nextInt(100));
        }
    }

    private static void consumer() throws InterruptedException
    {
        Random random = new Random();

        while(true)
        {
            Thread.sleep(200);
            if(random.nextInt(10) == 0){
                Integer val = queue.take();

                System.out.println("Taken Value : "+val + " ; Queue Size : " +queue.size());
            }
        }
    }
}
