package chap02;
import java.util.*;

public class Q2 {
	
	static void swap(int[] a, int ind1, int ind2) {
		
		int tmp = a[ind1];
		
		a[ind1] = a[ind2];
		a[ind2] = tmp;	
		System.out.println("a["+ind1+"]과(와) a["+ind2+"]를 교환합니다. ");
		for(int i = 0 ; i < a.length ; i++ ) {
			System.out.print(a[i]+"   ");	
		}
	}
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int num =1 + rand.nextInt(10);
		
		int[] x = new int[num];
		
		for(int i = 0 ; i < num ; i++ ) {
			x[i] = rand.nextInt(100);
			System.out.print(x[i]+"   ");	
		}
		System.out.println();
		for(int i = 0 ; i < num/2 ; i++ ) {
			
			swap(x, i, (num-1)-i);		
			System.out.println();
		}
		
	}
}