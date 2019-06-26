package chap02;
import java.util.*;
public class ArrayEqual {
	
	static boolean equals(int[] a, int[] b) {
		
		if(a.length != b.length) {
			return false;
		}
		for(int i = 0 ; i < a.length ; i++) {
			if(a[i]!=b[i]) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int a_num = 1+rand.nextInt(10);
		int b_num = 1+rand.nextInt(10);
		
		int[] a = new int[a_num];
		int[] b = new int[b_num];
		
		for(int i = 0 ; i <a_num ; i++) {
			a[i] = rand.nextInt(10);
		}
		for(int i = 0 ; i <b_num ; i++) {
			b[i] = rand.nextInt(10);
		}
		
		System.out.println("배열 a와 b는 " +( equals(a, b) ? "같습니다." : "다릅니다.")
				);
	}
}
