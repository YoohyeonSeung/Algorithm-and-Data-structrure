package chap01;

import java.util.Scanner;

public class Q9 {
	
	static int sumof(int a, int b) {
		
		int sum = 0;
		
		int min = a;
		int max = b;
		
		if(b<a) {
			min = b;
			max = a;
		}
		
		
		sum = ((  max-min+1      )*(min+max))/2;     // 첫항 a, 끝항 l, 항의 갯수 n일때 합 = n*(a+l)/2
		
//		Solution
//		for (int i = min; i <= max; i++)
//			sum += i;
//		return (sum);
		
		
		
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("a와 b의 값을 입력하세요.");
		
		System.out.println("a의 값 :" );
		int a = scan.nextInt();
		
		System.out.println("b의 값 : ");
		int b = scan.nextInt();
		
		
		int result = sumof(a, b);
		
		System.out.println(result);
	}
}
