package org.intel.dcg;
public class Solution{
	public double myPow(double x, int n) {
		// System.out.println(x);
		// System.out.println(n);
		if(n == 0){
			return 1;
		}
		//long exp =(long)n;
		if(n<0){
            if( n == Integer.MIN_VALUE) {
                n++; // Make -2147483648 to -2147483647
                if(x < 0) {
                    x = -x; //we made n odd so need to update sign
                }
            }
            n = -n;
            x = 1/x;
		}
		// System.out.println(x);
		// System.out.println(n);
        return (n%2==0)?myPow(x*x,(int)n/2):x*myPow(x*x,(int)n/2);
    }
}