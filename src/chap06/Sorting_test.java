package chap06;

import java.util.Arrays;
import java.util.Comparator;


public class Sorting_test {
	
	public static void main(String[] args) {
		

						
		int[][] Arr = 
			{ new int[] {10, 4},
			   new int[] {4, 5},
			   new int[] {1, 10},
			   new int[] {2, 3},
			   new int[] {9, 8},
			   new int[] {5, 5}					
			};
		
//		Arrays.sort(Arr, new Comparator<int[]>() {
//
//			@Override
//			public int compare(int[] o1, int[] o2) {
//				return (o1[0] > o2[0]) ? 1:      //큰게 아래로 간다.. 
//					    (o1[0] < o2[0]) ? -1 : 0;
//			}		
//			
//		}				
//				
//		);    x축을 기준으로 오름차순(1->2->3->4...)
		
//		결과물
//		1  10
//		2  3
//		4  5
//		5  5
//		9  8
//		10  4
		
		
//		Arrays.sort(Arr, new Comparator<int[]>() {
//
//			@Override
//			public int compare(int[] o1, int[] o2) {
//				// TODO Auto-generated method stub
//				return (o1[0] < o2[0] ) ? 1 :    //작은것이 아래로 간다. 
//						(o1[0] > o2[0]) ? -1: 0 ;
//			}
//		});      x축을 기준으로 내림차순(10>9>8>7....)
	
//		결과물
//		10  4
//		9  8
//		5  5
//		4  5
//		2  3
//		1  10
		

		
		for(int i = 0 ; i <Arr.length ; i++) {
			System.out.println(Arr[i][0]+"  "+Arr[i][1]);
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
