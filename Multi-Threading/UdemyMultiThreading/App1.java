/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UdemyMultiThreading;

/**
 *
 * @author RAHUL
 */

class Runner extends Thread
{
    @Override
    public void run()
    {
        for(int i=0; i<20;i++)
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

public class App1 {
    public static void main(String [] args)
    {
        Runner t1 = new Runner();
        Runner t2 = new Runner();

        t1.start();
        t2.start();
    }

}
