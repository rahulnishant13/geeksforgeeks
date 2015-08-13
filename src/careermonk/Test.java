/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package careermonk;
/**
 *
 * @author RAHUL
 */
public class Test {
 public static void main(String args[]){
   String s=" Sachin ";
   String z=" Tendulkar ";
   String x = " Apple ";
   // x = z.intern();

    String a = s.trim() + z + x.trim();
    System.out.print( a);
//   System.out.println(x);//he
//   System.out.println(z.startsWith("hello "));
//   System.out.println(z.endsWith( "rahul"));
//   System.out.println(s.substring(6));//Tendulkar
//   System.out.println(s.substring(0,6));//Sachin
//
//   System.out.println( this );
//    StringBuffer sb=new StringBuffer("Henmo");
//    sb.reverse();
//    sb.replace(1,4,"Java");
//    System.out.println(sb);
 }

}
