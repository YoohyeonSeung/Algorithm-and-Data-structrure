package Chap03;

public class Q3 {
	
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int cnt = 1 ;
		for(int i = 0 ; i < n ; i++) {
			
			if(a[i] == key) {
				idx[cnt-1] = i;
				cnt++;
			}		
		}	
		return cnt;
	}
}
