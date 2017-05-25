package HakerRank_Java.AlgorithmProblems;

import java.util.Scanner;

public class Time_Conversion {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        String ap = s.substring(8);
        String hr = s.substring(0,2);
        
        int hour = Integer.parseInt(hr);
        
        if(ap.trim().equals("PM")){
        	if(hour != 12){
        		hour += 12;
        	}
            System.out.println(hour+s.substring(2,8));
            sc.close();
            return;
        }
        else{
        	if(hour == 12){
        		System.out.println("00"+s.substring(2,8));
        		sc.close();
        		return;
        	}
            System.out.println(s.substring(0,8));
        }
        sc.close();
    }

}
