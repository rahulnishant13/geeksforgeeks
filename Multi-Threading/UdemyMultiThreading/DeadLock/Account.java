/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UdemyMultiThreading.DeadLock;

/**
 *
 * @author RAHUL
 */
public class Account {
    private int balance = 10000;

    public void deposit(int amnt)
    {
        balance += amnt;
    }
    public void withdrawl(int amnt)
    {
        balance -= amnt;
    }
    public int getBalance()
    {
        return balance;
    }
    public static void tranfer(Account acc1, Account acc2, int amnt)
    {
        acc1.withdrawl(amnt);
        acc2.deposit(amnt);
    }
}
