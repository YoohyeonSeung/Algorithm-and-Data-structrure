package chap01;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int no;
		
		System.out.println("2자리 정수를 입력하세요.");
		
		do {
			System.out.println("입력 : ");
			
			no = scan.nextInt();
			
		}while(no < 10 || no > 99 );   // no가 10보다 작거나 no가 99보다 큰 경우 do로 묶인 부분이 계속 실행됨
		
		System.out.println("변수 no의 값은 "+ no + " 가(이) 되었습니다.");
		
		
		
	}
}
