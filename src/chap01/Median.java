package chap01;

import java.util.Scanner;


public class Median {
	
	
	static int med3(int a, int b, int c) {
		
		if(  a >= b  )
			if( b >= c )
				return b;
			else if(  a <= c   )     // c>b인 경우이므로 a와 c를 비교해야한다.
				return a;
			else         			      // a > c인경우 -> a>c>b가된다.
				return c;
		
		else if(  a > c    )         //이경우는 a>=b가 아닌 경우이므로 b>a인 상황이다.
			return a;
		
		else if(  b > c   )          // b>a 이고 c>=a 이므로 b>c이면 중앙값은 c
			return c;
		
		else          				 // b>a이고 c>=a이고 c>=b이므로 중앙값은 b
			return b;
	}
	
	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.println("a의 값 : ");     int a = scan.nextInt();
		System.out.println("b의 값 : ");     int b = scan.nextInt();
		System.out.println("c의 값 : ");     int c = scan.nextInt();
		
		System.out.println("중앙값은 "+ med3(a, b, c)    +"입니다.");
		
		
	}
	
	
	
	
	
	

}
