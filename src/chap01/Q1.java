package chap01;

import java.util.Scanner;

public class Q1 {

	static int Max4(int a, int b, int c, int d) {
		
		int max = a;
		
		if( b>max ) max = b;
		if( c>max ) max = c;
		if( d>max ) max = d;
		
		return max;
		
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b, c, d;

		System.out.println("네 정수의 최댓값을 구합니다.");
		System.out.print("a의 값：");
		a = scan.nextInt();
		System.out.print("b의 값：");
		b = scan.nextInt();
		System.out.print("c의 값：");
		c = scan.nextInt();
		System.out.print("d의 값：");
		d = scan.nextInt();

		int max = Max4(a, b, c, d); 	// a, b, c, d의 최댓값

		System.out.println("최댓값은 " + max + "입니다.");
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
