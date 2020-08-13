package org.powerapi.jjoules;

public class Fibonacci {
	
	public static final Fibonacci FIB = new Fibonacci();
	
    public long fibo(int n) {
        return n < 2 ? n : fibo(n - 1) + fibo(n - 2);
    }
    
    public static void test() {
    	
    }
}
