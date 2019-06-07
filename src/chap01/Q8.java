package chap01;

import java.util.Scanner;


public class Q8 {
	

	
	public static void main(String[]  args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		int n = scan.nextInt();
		
		int sum = (n*(n+1))/2;
		
//		Solution
//		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);  
//      삼항연산자로 ( a ? b : c )  a가 참이면 b를 반환 a가 거짓이면 c를 반환
	
		
		System.out.println(sum);
		
		
	}
}
