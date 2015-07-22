/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package careermonk;

/**
 *
 * @author RAHUL
 */
public class LogNComplexityDown {

	public static void main(String[] args) {
		int n = 19;
		System.out.println(logNUp(n));
	}

	public static int logNUp(int n){
		int count = 0;
		for (int i = n; i>0;){
			count ++;
			i = i / 2;
		}
		return count;
	}

}