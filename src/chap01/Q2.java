package chap01;

import java.util.Scanner;
// 세박의 최곳값을 구하는 min3메서드를 작성하세요.

public class Q2 {

	static int min3(int a, int b, int c) {
		int min = a;
		
		if( b < min   ) min = b;
		if( c < min   ) min = c;
		
		return min;
	}
	
	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		int a, b, c;

		System.out.println("네 정수의 최솟값을 구합니다.");
		System.out.print("a의 값：");
		a = scan.nextInt();
		System.out.print("b의 값：");
		b = scan.nextInt();
		System.out.print("c의 값：");
		c = scan.nextInt();
		

		int min = min3(a, b, c); 	// a, b, c의 최솟값

		System.out.println("최솟값은 " + min + "입니다.");
		
		
		
		
		
		
	}
	
	
	
	
	
}
