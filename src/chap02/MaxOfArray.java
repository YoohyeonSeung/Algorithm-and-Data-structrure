package chap02;
import java.util.*;
import java.io.*;


public class MaxOfArray {
	
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
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.println("사람 수를 입력해주세요.");
		
		int num = Integer.parseInt(br.readLine());
		
		int[] heights = new int[num];
		
		for(int i = 0 ; i < num ; i++) {
			
			System.out.println("heights["+i+"] = ");
			heights[i] = Integer.parseInt(br.readLine());
			
			
		}
		
		System.out.println("최댓값은 " + maxOf(heights) + " 입니다. ");
		
		
		
	}
}
