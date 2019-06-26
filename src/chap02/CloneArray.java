package chap02;

public class CloneArray {
	
	public static void main(String[] args) {
		
		int[] a= {1, 2, 3, 4, 5};
		
		int[] b = a.clone();
		
		for(int i = 0 ; i < 5 ;i++) {
			
			System.out.println("a = "+a[i] +",  b = "+b[i]);
			
			
			
		}
		
		
		
		
	}

}
