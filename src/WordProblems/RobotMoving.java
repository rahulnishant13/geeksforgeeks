/*
 * A robot is located in the upper-left corner of a 4×4 grid.
 * The robot can move either up, down, left, or right, but cannot go to the same location twice.
 * The robot is trying to reach the lower-right corner of the grid.
 * Your task is to find out the number of unique ways to reach the destination.
 */

package WordProblems;

/**
 *
 * @author RAHUL
 */
import java.util.Scanner;
class RobotMoving
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the x position");
		int m=sc.nextInt();
		System.out.println("Enter the y position");
		int n=sc.nextInt();
		int ways=findWays(m-1,n-1);
		System.out.println("No. of ways are "+ways+"\n");
	}
	static int findWays(int m,int n)
	{
		if(m==0 || n==0)
		{
			if(m==0)
				return n;
			else
				return m;
		}
		int a[][]=new int[m+1][n+1];
		a[0][0]=0;
		for(int i=1; i<m+1; i++)
			a[i][0]=1;
		for(int j=1; j<n+1; j++)
			a[0][j]=1;
		for(int i=1;i<m+1;i++)
		{
			for(int j=1;j<n+1;j++)
			{
				a[i][j]=a[i][j-1]+a[i-1][j];
			}
		}
		return a[m][n];
	}
}