package Chap03;
import java.util.Scanner;
public class BinSearch {
	
	static int binSearch(int[] a, int n, int key) {
		
		int pl = 0 ; 			  // 검색 범위의 첫 인덱스
		int pr = n-1;             // 검색 범위의 끝 인덱스
 		
		do {
			int pc = (pl+pr)/2;
			
			if( a[pc ] == key) {
				return pc;
			}
			else if(a[pc] < key)   //가운댓값보다 크므로 오른쪽 탐색
				pl = pc+1;
			else // 가운댓값보다 작으므로 오른쪽 탐색
				pr = pc-1;
		}while(pl <= pr);
		return -1 ; //검색 실패
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("요솟수 : ");
		int num = scan.nextInt();
		
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.println("x[0] = ");
		x[0] = scan.nextInt();
		
		for(int i = 1 ; i <num ; i++) {
			
			do {
				System.out.println("x["+i+"] = ");
				x[i] = scan.nextInt();
			}while(x[i-1] > x[i]);     //바로 앞 요솟수보다 작으면 다시 입력 받기
		}
		
		System.out.println("검색 할 값 : ");
		
		int key = scan.nextInt();
		
		int idx = binSearch(x, num, key);
		
		if( idx ==-1  ) System.out.println("그 값의 요소가 없습니다.");
		else System.out.println(key +"은(는) x["+idx+"]에 있습니다.");
		
		
		
		
		
	}
	

}
