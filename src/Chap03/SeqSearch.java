package Chap03;
import java.util.*;
import java.io.*;
public class SeqSearch {

	static int seqSearch(int[] a, int n, int key) {  //검색할 배열 a, a의 길이n, 
		
		int i = 0 ; 
		
		while(true) {
			
			if(i==n) return -1;    //모든 배열을 지나가고 n이되면 배열에 값이 없는 것이므로 -1반환
			
			if(a[i] == key) return i;		
			
			i++;
		}
		
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int[] a = new int[num];
		
		
		for(int i  = 0 ; i < num ; i++) {
			a[i] = i;
		}
		
		int ky = Integer.parseInt(br.readLine());
		
		int idx = seqSearch(a, num, ky);
		
		if( idx == -1 ) System.out.println("그 값의 요소가 없습니다.");
		else System.out.println(ky+"은(는) a["+idx+"]에 있습니다.");
		
		
		
		
		
	}
	
}
