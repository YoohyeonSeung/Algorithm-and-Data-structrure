package chap02;

import java.util.*;

public class Q5 {
	
	static void rcopy(int[] a, int[] b) {
		
		
		for(int i = 0 ; i <a.length ; i++) {
			b[a.length-1-i] = a[i];
		}
		
		
	}
	public static void main(String[] args) {
		
		int[] a = new int[10];
		int[] b = new int[a.length];
		
		Random rand = new Random();
		
		for(int i = 0 ; i < a.length ; i++) {
			a[i] = rand.nextInt(10);
		}
		rcopy(a, b);
		
		
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println( "a["+i+"] = "+a[i]+" , b["+i+"] = "+ b[i]      );
		}
	}
}
