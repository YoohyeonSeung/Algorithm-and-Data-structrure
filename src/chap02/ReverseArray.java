package chap02;
import java.util.*;

public class ReverseArray {
	
	static void swap(int[] a, int ind1, int ind2) {
		
		int tmp = a[ind1];
		
		a[ind1] = a[ind2];
		a[ind2] = tmp;	
	}
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int num =1 + rand.nextInt(10);
		
		int[] x = new int[num];
		
		System.out.println("Original Array");
		for(int i = 0 ; i < num ; i++ ) {
			
			x[i] = rand.nextInt(100);
			System.out.print(x[i]+"   ");	
		}
		for(int i = 0 ; i < num/2 ; i++ ) {
			
			swap(x, i, (num-1)-i);		
		}
		System.out.println();
		System.out.println("After reverse");
		for(int i = 0 ; i < num ; i++ ) {
			System.out.print(x[i]+"   ");	
		}
	}
}
