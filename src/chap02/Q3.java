package chap02;
import java.util.*;
public class Q3 {
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i = 0 ; i <a.length ; i++) {
			
			sum +=a[i];
			
		}		
		return sum;
	}
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[] arr = new int[10];
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			arr[i] = rand.nextInt(10);
			
		}
		
		System.out.println("요소들의 합 : " +sumOf(arr));
		
		
		
	}

}
