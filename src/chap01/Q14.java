package chap01;

import java.util.Scanner;

public class Q14 {
	
	// Solution과 같음
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		System.out.println("사각형을 출력합니다.");
		
		do {
			System.out.println("단 수 : ");
			n = scan.nextInt();
		}while(n<=0);
		
		for(int i = 0 ; i<n ; i++) {
			for(int j = 0; j<n ; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
	}
}
