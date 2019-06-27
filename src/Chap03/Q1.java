package Chap03;

public class Q1 {

	static int seqSearchSen(int[] a, int n, int key){
		int result = -1;
		for(int i = 0 ; i < n ; i++) {
			
			if( a[i] == key  ) {
				result  = 1;
				break;
			}
		}
		return result;
	}
	
	
//	솔루션
//	static int seqSearchSen(int[] a, int n, int key) {
//		int i;
//
//		a[n] = key; // 보초를 추가
//
//		for (i = 0; a[i] != key; i++)
//			;
//		return i == n ? -1 : i;
//	}
	
	
	
	
	
	
	
	
}
