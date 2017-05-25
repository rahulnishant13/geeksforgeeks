package HakerRank_Java.AlgorithmProblems;

import java.util.Scanner;

public class CatsAndMouse {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            
            x = x - z > 0 ? x - z : (x - z)*(-1);
            y = y - z > 0 ? y - z : (y - z)*(-1);

            if(x > y){
            	System.out.println("Cat B");
            }
            else if(x < y){
            	System.out.println("Cat A");
            }
            else{
            	System.out.println("Mouse C");
            }
        }

        in.close();
    }
}
