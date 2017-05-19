package HakerRank_Java.DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        int x = sc.nextInt();
        
        for(int i=0; i<x; i++)
            al.add(sc.nextInt());
        
        x = sc.nextInt();
        for(int i=0; i<x; i++){
            String s = sc.next();
            if(s.equals("Insert"))
                al.add(sc.nextInt(), sc.nextInt());
            if(s.equals("Delete"))
                al.remove(sc.nextInt());
        }
        
        for(int i : al)
            System.out.print(i+" ");
        
        sc.close();
    }

}
