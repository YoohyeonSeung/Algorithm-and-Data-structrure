package chap01;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.println("숫자를 입력해주세요.");
			n = scan.nextInt();
		}while(n<=0);
					
		int i=1;
		
		while(n>=10) {
			n = n/10;
			i++;
		}
		System.out.println("그 수는 "+i+"자리 입니다.");
		
		
	}
}
