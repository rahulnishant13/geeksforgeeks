/* get first day of jan of any year */

import java.util.*;
import java.lang.*;
import java.io.*;

class GetFirstJanOfYear
{
    private static long getDayCount(int date, int month, int year){
        long sum = 0;
        int i =0;
        if (year > 2000) {
            i = 2000;
        }
        else {
            i = year;
            year = 2000;
        }
        for (; i < year; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
            {
                sum = sum + 366;
            }
            else
            {
                sum = sum + 365;
            }
        }
        
        return sum;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int year = sc.nextInt();
		long dayCount = getDayCount(0, 0, year);
		int day = (int)(dayCount % 7.0);
		if(year < 2000){
		    day = 7 - day;
		}
		switch (day)
        {
            case 0:
                System.out.println("saturday");
                break;
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;


        }
	}
}
