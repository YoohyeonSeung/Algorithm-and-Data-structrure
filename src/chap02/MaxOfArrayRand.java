package chap02;
import java.util.*;
import java.io.*;
public class MaxOfArrayRand {

	static int maxOf(int[] arr) {
		
		int max = arr[0];
		
		for(int i =1 ; i <arr.length ; i++) {
			
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) throws IOException {
		
		Random rand = new Random();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.println("사람 수 : ");
		
		int num = Integer.parseInt(br.readLine());
		
		int[] heights = new int[num];
		
		for(int i = 0 ; i < num ; i++) {
			
			heights[i] = 100+rand.nextInt(90);
			
		}		
		
		System.out.println("최댓값은 " + maxOf(heights) + " 입니다.");
		
		
	}	
}
