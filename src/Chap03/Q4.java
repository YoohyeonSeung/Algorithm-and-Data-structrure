package Chap03;

import java.util.Scanner;

public class Q4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int[] x = new int[num];
		
		System.out.println("오름 차순으로 숫자를 입력해주세요");
		System.out.println("x[0] = ");
		x[0] = scan.nextInt();
		
		for(int i  = 1 ; i <num ; i++) {
			do {
				System.out.println("x["+i+"] = ");
				x[i] = scan.nextInt();
				
			}while(  x[i-1] > x[i]     ) ;
		}
		System.out.println("찾으려는 요솟값  : ");
		int key = scan.nextInt();
		
		
		for(int i = 0 ; i < num+1 ; i++) {
			if(i == 0 ) System.out.print("    |");
			else System.out.print(" "+(i-1));			
		}
		System.out.println();
		for(int i = 0 ; i < num+1 ; i++) {
			if(i == 0 ) System.out.print("---+");
			else System.out.print("---");			
		}
		System.out.println();
		int pl = 0;
		int pr = num-1;
		int pc = (pl+pr)/2;
		
		while(true) {
			if(pl <= pr) {
				
				for(int i = 0 ; i <num+1 ; i++) {
					if(i == 0 ) System.out.print("    |");
					else {
						if(i-1 == pc) System.out.print(" * ");
						else if(i-1 == pl) System.out.print("<- ");
						else if(i-1 == pr) System.out.print(" ->");
						else System.out.print("   ");
					}   // <-,->, *표현 완료
				}
				System.out.println();
				for(int j = 0 ; j <num+1 ; j++) {
					if(j==0) System.out.print(" "+pc+" |");
					else {
							System.out.print(" "+x[j-1]+" ");
					}
				} //배열 표현 완료
				System.out.println();
				if( x[pc] ==  key  ) { //만약 요솟값과 찾은 값이 일치 한다면 맞다고 입력 할것
					System.out.println(key+"는 x["+pc+"]에 있습니다.");
					break;
				}
				else {
					System.out.println("    |");
					if(x[pc] < key) { //가운뎃 값과 입력된 key값보다 작으면 오른쪽 탐색
						pl = pc+1;
					}
					else {//가운뎃 값과 입력된 key값보다 크면 왼쪽 탐색
						pr = pc-1;
					}
					pc = (pl+pr)/2;
				}
			}
			else {
				System.out.println("찾으려는 요솟값을 찾을 수가 없습니다.");
				break;
			}
		}		
	}	

}



// 솔루션
//class BinSearchEx_03_04 {
//	// 배열 a의 앞쪽 n개 요소에서 key와 같은 요소를 선형 검색 (보초법)
//	static int binSearchEx(int[] a, int n, int key) {
//		System.out.print("   |");
//		for (int k = 0; k < n; k++)
//			System.out.printf("%4d", k);
//		System.out.println();
//
//		System.out.print("---+");
//		for (int k = 0; k < 4 * n + 2; k++)
//			System.out.print("-");
//		System.out.println();
//
//		int pl = 0; // 검색범위 맨 앞의 index
//		int pr = n - 1; // 검색범위 맨 뒤의 index
//
//		do {
//			int pc = (pl + pr) / 2; // 중앙요소의 index
//			System.out.print("   |");
//			if (pl != pc)
//				System.out.printf(String.format("%%%ds<-%%%ds+", (pl * 4) + 1, (pc - pl) * 4), "", "");
//			else
//				System.out.printf(String.format("%%%ds<-+", pc * 4 + 1), "");
//			if (pc != pr)
//				System.out.printf(String.format("%%%ds->\n", (pr - pc) * 4 - 2), "");
//			else
//				System.out.println("->");
//			System.out.printf("%3d|", pc);
//			for (int k = 0; k < n; k++)
//				System.out.printf("%4d", a[k]);
//			System.out.println("\n   |");
//			if (a[pc] == key)
//				return pc; // 검색성공
//			else if (a[pc] < key)
//				pl = pc + 1; // 검색범위를 뒤쪽 절반으로 좁힘
//			else
//				pr = pc - 1; // 검색범위를 앞쪽 절반으로 좁힘
//		} while (pl <= pr);
//		return -1; // 검색실패
//	}
//
//	public static void main(String[] args) {
//		Scanner stdIn = new Scanner(System.in);
//
//		System.out.print("요솟수：");
//		int num = stdIn.nextInt();
//		int[] x = new int[num]; // 요솟수 num인 배열
//
//		System.out.println("오름차순으로 입력하세요.");
//
//		System.out.print("x[0]："); // 맨 앞 요소를 읽어 들임
//		x[0] = stdIn.nextInt();
//
//		for (int i = 1; i < num; i++) {
//			do {
//				System.out.print("x[" + i + "]：");
//				x[i] = stdIn.nextInt();
//			} while (x[i] < x[i - 1]); // 하나 앞의 요소보다 작으면 다시 입력
//		}
//
//		System.out.print("찾는 값："); // 키 값을 입력 받음
//		int ky = stdIn.nextInt();
//
//		int idx = binSearchEx(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색
//
//		if (idx == -1)
//			System.out.println("그 값의 요소가 없습니다.");
//		else
//			System.out.println(ky + "은 x[" + idx + "]에 있습니다.");
//	}
//}

