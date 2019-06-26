package chap02;
import java.util.*;
public class Q1 {
	
	static int maxOf(int[] arr) {
		int max = arr[0];
		
		for(int i = 1 ; i < arr.length ; i++) {
			if(arr[i] > max) max = arr[i];
			
		}
		
		
		return max;
	}
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int num = 1+rand.nextInt(100);  //0부터 99까지 값중 하나를 찾아내기 때문에 +1이 필요하다
		
		int[] heights = new int[num];
		
		
		for(int i = 0 ; i <num ; i++) {
			
			heights[i] = 100+rand.nextInt(100);
						
		}
		
		
		System.out.println("키의 최댓값 : "+ maxOf(heights));
		
		
		
	}
	

}
