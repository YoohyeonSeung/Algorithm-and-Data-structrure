package chap01;

public class Q13 {
	public static void main(String[] args) {
		System.out.print("   |"); 
		for(int i = 1; i<=9 ; i++) {         //첫번째줄 출력
			System.out.printf("%3d", i);
		}
		System.out.println("\n---+----------------------------");    //두번째 줄 출력
		
		for(int i=1; i<=9 ; i++) {     // +에 대한 table출력
			System.out.print(i+"|");       // 솔루션과 다른점 System.out.printf("%2d |", i);
			for(int j=1 ; j<=9 ;  j++) {
				System.out.printf( "%3d", i+j );				
			}
			System.out.println();
		}		
	}
}
