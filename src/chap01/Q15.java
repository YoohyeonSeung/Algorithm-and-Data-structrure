package chap01;

import java.util.Scanner;

public class Q15 {
	
	static void triangleLB(int n) {
		// 왼쪽 아래가 직각인 이등변 삼각형을 출력	
		for(int i = 1; i<=n ; i++) {
			for(int j = 1 ; j<=i ;j++) 
				System.out.print("*");
			System.out.println();
		}
	}
	static void triangleLU(int n) {
		// 왼쪽 위가 직각인 이등변 삼각형을 출력	
		for(int i = 0; i<=n ; i++) {
			for(int j = n ; j>i ; j--) // for (int i = 1; i <= n; i++)
				System.out.print("*");
			System.out.println();
		}
	}
	static void triangleRU(int n) {
		// 오른쪽 위가 직각인 이등변 삼각형을 출력
		for(int i = 0; i<n ; i++) {
			for(int j = 0 ; j<i ;j++) 
				System.out.print(" ");
			for(int k = 0 ; k < n-i ; k++)
				System.out.print("*");
			System.out.println();
		}
		
	}
	static void triangleRB(int n) {
		// 오른쪽 아래가 직각인 이등변 삼각형을 출력
		for(int i = 1 ; i <=n ;i++) {
			for(int j = n-i ; j>=1 ; j-- )
				System.out.print(" ");
			for(int k = 0 ; k < i ; k++)
				System.out.print("*");
			System.out.println();
			
		}
//		solution
//		for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,ln)
//			for (int j = 1; j <= n - i; j++) 		// n-i개의 ' '를 나타냄
//				System.out.print(' ');
//			for (int j = 1; j <= i; j++) 			// i개의 '*'를 나타냄
//				System.out.print('*');
//			System.out.println(); 					// 개행(줄변환)
//		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.println("단 수를 입력해주세요.");
			n = scan.nextInt();
		}while(n<=0);
		triangleLB(n);
		triangleLU(n);
		triangleRU(n);
		triangleRB(n);
		
	}
}
