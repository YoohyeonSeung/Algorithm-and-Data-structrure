package chap02;

import java.util.*;

public class Q4 {
	
	static void copy(int[] a, int[] b) {
		
		
		for(int i = 0 ; i <a.length ; i++) {
			b[i] = a[i];
		}
		
		
	}
	public static void main(String[] args) {
		
		int[] a = new int[10];
		int[] b = new int[a.length];
		
		Random rand = new Random();
		
		for(int i = 0 ; i < a.length ; i++) {
			a[i] = rand.nextInt(10);
		}
		copy(a, b);
		
		
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println( "a["+i+"] = "+a[i]+" , b["+i+"] = "+ b[i]      );
		}
	}
}
