package chap01;

import java.util.Scanner;

public class Q17 {
	static void spira(int n) {
		
		for(int i = 1; i<=n ; i++ ) {
			//띄어 쓰기 파트 1 (i행엔 i-1개의 띄어쓰기가 양옆에 생김)
			for(int j = 1 ; j <=n-i ; j++ )
				System.out.print(" ");
			for(int j = 1 ; j <= (2*i) -1 ; j++)
				System.out.print(i);
			//띄어 쓰기 파트 2 
			for(int j = 1 ; j <=n-i ; j++ )
				System.out.print(" ");
			System.out.println();
		}		
	}
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.println("단 수를 입력해주세요. :");
			n = scan.nextInt();
		}while(n<=0);
		
		spira(n);
		
	}
}
