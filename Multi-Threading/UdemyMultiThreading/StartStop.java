/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UdemyMultiThreading;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RAHUL
 */

class Start extends Thread
{
    private volatile boolean running = true;
    // during optimisation it will store running true as it is not get cought
    // in shutdown so its being updated by main thread
    @Override
    public void run()
    {
        while(running)
        {
            System.out.println( "Rahul");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    void shutDown()
    {
        running = false;
    }

}

public class StartStop
{
    public static void main(String [] args)
    {
        Start ob = new Start();
        ob.start();

        System.out.println("Press anything to stop... ");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        ob.shutDown();
    }
}
