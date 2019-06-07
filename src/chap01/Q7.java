package chap01;

import java.util.Scanner;

public class Q7 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		int n = scan.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i<=n;i++) {
			sum+=i;
			
			System.out.print( i );
			
			if(i<n) System.out.print(" + ");
			else    System.out.print(" = ");
		}
		System.out.println(sum);
	}
}
