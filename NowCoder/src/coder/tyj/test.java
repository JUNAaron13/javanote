package coder.tyj;

public class test {
      public static void main (String args[]) {
    	  int A [][] = new int[][] {{1,2},{3,5}} ;
    	  int t = A.length;
    	  System .out.println(t);
    	  Solution sl = new Solution();
    	  boolean a = sl.Find(1,A);
    	  if (a==true) {
    		  			System.out.println("yes");
    	  			}
    	  else {
    		  System.out.println("no");

    	  			}
    	  
    	  
      }   
	 
 
    	   
	
}
