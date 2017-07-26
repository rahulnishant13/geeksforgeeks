/*
Flipping a Bit
Flipping a Bit (binary digit) means changing from 0 to 1 and from 1 to 0. An operation OP(i) of bit flipping is defined on a binary number as follows:Performing OP(i) would result into flipping of each ith bit from the starting (i>0). 

An n-bit number is given as input and two operations OP(j) and OP(k) are applied on it one after the other. Objective is to tell how many bits will remain the same after applying these two operations.


Input Format
You will be given a function which contains three arguments. Argument 1 will represent the Binary number as String, argument 2 will represent the integer j and argument 3 will represent the integer k.

Output Format
You need to return the Number of bits(in the form of integer) will remain the same after applying these two operations {Integer}
Or 
-1 in  case of invalid values of j, k or both 


Sample Test Case 1: 
Sample Input: 
10110101101
3
4

Sample Output: 
6

Sample Test Case 2: 
Sample Input: 
10110101101
3
0

Sample Output: 
-1
*/

#include <math.h>
#include <string.h>
#include <limits.h>


class BeginnerCodeChamp
{
	public static int nochange_bits(String input1,int i1,int i2)
    {
	    
        try{
            int len=input1.length();
            if(i1<1 || i2<1){
                return -1;
            }else if(i1>len && i2>len){
                return len;
            }else if(i1==i2){
                return len;
            }else{
                return (int)(len-Math.floor(len/i1)-Math.floor(len/i2)+2*Math.floor(len/(Math.abs(i1*i2) / GCF(i1, i2))));
            }
        }
        catch(Exception e){
                e.printStackTrace();
                return -1;
            }
    }
    
    public static int GCF(int a, int b) {
        if (b == 0) return a;
        else return (GCF (b, a % b));
    }
    
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int output = 0;
        String ip1 = in.nextLine().trim();
        int ip2 = Integer.parseInt(in.nextLine().trim());
        int ip3 = Integer.parseInt(in.nextLine().trim());
        output = nochange_bits(ip1,ip2,ip3);
        System.out.println(String.valueOf(output));
    }
}
