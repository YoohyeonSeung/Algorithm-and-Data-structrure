package chap01;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("b-a값을 구합니다.");
		
		System.out.println("a의 값 : ");
		a = scan.nextInt();
		
		do {
			System.out.println("b의 값 : ");
			b = scan.nextInt();
			if(b<=a) System.out.println("a보다 큰 값을 입력하세요!");
			
		}while(b<=a);
		
//     Solution		
//		int b=0;
//		while (true) {
//			System.out.print("b의 값：");
//			b = scan.nextInt();
//			if (b > a)
//				break;
//			System.out.println("a보다 큰 값을 입력하세요!");
		
		
		
		System.out.println(b+" - "+a+" = "+(b-a));
	}
}
