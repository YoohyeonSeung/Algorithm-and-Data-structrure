package chap06;

import java.util.Arrays;
import java.util.Comparator;


public class Sorting_3D {
	
	static class arr3d{
		
		int x;
		int y;
		int z;
		
		arr3d(int x, int y, int z){
			this.x = x;
			this.y = y;
			this.z = z;
		}
		
		public String toString() {
			return "x : "+x+" y: "+y+" z: "+z;
		}
		
	}
	
	public static void main(String[] args) {
		
		arr3d[]  X = {				
			new arr3d(1, 2, 3),	
			new arr3d(2, 5, 3),
			new arr3d(8, 1, 4),
			new arr3d(4, 4, 4),
			new arr3d(7, 3, 1),
			new arr3d(2, 10, 8)				
		};
		
		Arrays.sort(X, new Comparator<arr3d>(){

			@Override
			public int compare(arr3d o1, arr3d o2) {
				return (o1.y > o2.y) ? 1:
					    (o1.y < o2.y) ? -1 : 0;
			}		
		}	
		);
		
		for(int i = 0 ; i<X.length; i++) {
			System.out.println(X[i].toString());
		}
		
		
		
		
	}
}
