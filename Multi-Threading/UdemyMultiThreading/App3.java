/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UdemyMultiThreading;

/**
 *
 * @author RAHUL
 */


public class App3 {
public static void main(String[] args){
    Thread t1 = new Thread(new Runnable() {

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
    });

    t1.start();

}
}
