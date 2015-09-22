/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UdemyMultiThreading;

/**
 *
 * @author RAHUL
 */

class Sum implements Runnable{
    int a,b;
    Sum(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    public void run()
    {
        System.out.println(a+b);
    }
}

public class Add {
    public static void main(String [] args)
    {
        Thread t1 = new Thread(new Sum(5,5));
        Thread t2 = new Thread(new Sum(10,10));

        t2.start();
        t1.start();
    }
}
