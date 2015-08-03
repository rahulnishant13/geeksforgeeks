/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java_Array;

/**
 *
 * @author RAHUL
 */

public class StaticTest
{
    static int x;
    StaticTest()
    {
        x++;
    }
    public static void main(String a[])
    {
        StaticTest ob1 = new StaticTest();
        StaticTest ob2 = new StaticTest();

        System.out.print("total object : " + x);
    }

}
