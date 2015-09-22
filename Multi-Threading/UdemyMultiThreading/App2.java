/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UdemyMultiThreading;

/**
 *
 * @author RAHUL
 */

class ScndWay implements Runnable
{
    public void run()
    {
        for(int i=0; i<20;i++)
        {
            System.out.println(i);

            try
            {
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class App2 {
    public static void main(String [] args)
    {
        Thread t1 = new Thread(new ScndWay());
        Thread t2 = new Thread(new ScndWay());
        t1.start();
        t2.start();
    }
}
