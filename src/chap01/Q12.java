package chap01;

public class Q12 {
	public static void main(String[] args) {
		
		
		for(int i = 0 ; i<= 10 ; i++) {
			
			for(int j = 0 ; j <= 10 ; j++) {
			
				if(i==0) {      //  | 1 2 3 4 5 6 7 8 9 출력
					if(j==0) System.out.printf("   ");
					else if(j==1) System.out.printf(" |");
					else 		System.out.printf("%3d", j-1);
				}
				else if(i==1) {
					if(j==1) System.out.printf("+");
					System.out.printf("---");
				}
				else {
					if(j==0) System.out.printf("%3d", i-1);
					else if(j==1) System.out.printf("|");
					else System.out.printf("%3d", (i-1)*(j-1));
				}
				
			}
			System.out.println();
		}
		
		
//		Solution		
//		System.out.print("   |");
//		for (int i = 1; i <= 9; i++)
//			System.out.printf("%3d", i);
//		System.out.println("\n---+---------------------------");
//
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("%2d |", i);
//			for (int j = 1; j <= 9; j++)
//				System.out.printf("%3d", i * j);
//			System.out.println();
//		}
	}
}
