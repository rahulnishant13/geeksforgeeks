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

class ScndWay implements Runnable
{
    public void run()
    {
        for(int i=0; i<10;i++)
        {
            System.out.println(i);

            try
            {
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class App2 {
    public static void main(String [] args)
    {
        try {
            Thread t1 = new Thread(new ScndWay());
            Thread t2 = new Thread(new ScndWay());
            t1.start();
            t1.join();
            t2.start();
            
            t2.join();
            System.out.print("Done");
        } catch (InterruptedException ex) {
            Logger.getLogger(App2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
