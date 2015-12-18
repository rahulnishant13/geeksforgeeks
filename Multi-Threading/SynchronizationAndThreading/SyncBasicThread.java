/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package SynchronizationAndThreading;


import java.util.Scanner;

class MyThread extends Thread
{
    private volatile boolean  running = true;
    
    @Override
    public void run()
    {
        while(running)
        {
            System.out.println("Running");
        }
    }
    void shutDown()
    {
        running = false;
    }
}
/**
 *
 * @author RAHUL
 */
public class SyncBasicThread {

    public static void main(String [] args)
    {
        MyThread t1= new MyThread();
        t1.start();
       
        Scanner input = new Scanner(System.in);
        input.nextLine();
        t1.shutDown();
    }

}
