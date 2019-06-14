package chap06;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortTester {

	public static void main(String[] args) {
		
		// Arrays.sort()를 이용하여 정렬합니다.(퀵정렬)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		
		int num = scan.nextInt();
		
		int[] X = new int[num];
		for(int i = 0; i<num ; i++) {
			X[i] = scan.nextInt();
		}
		
		Arrays.sort(X);
		
		for(int i = 0; i<num ; i++) {
			System.out.println(X[i]);
		}
		
		
	}
}
