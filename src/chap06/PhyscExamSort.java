package chap06;

import java.util.Arrays;
// import java.util.Scanner;
import java.util.Comparator;

public class PhyscExamSort {

	static class PhyscData{
		
		String name;      //이름
		int height;         //키
		double vision;    //시력
		
		//생성자
		PhyscData(String name, int height, double vision){
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		public String toString() {
			return name+" "+height+" "+vision;
		}
		
		static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData>{
			public int compare(PhyscData d1, PhyscData d2) {
				
				return (d1.height > d2.height) ? 1 :
						(d1.height < d2.height ) ? -1 : 0;
				
			}
		}
	}
	public static void main(String[] args) {
		
		PhyscData[] X = {
			new PhyscData("짐구", 170, 0.8),
			new PhyscData("그뤁", 183, 0.8),
			new PhyscData("꼰택", 180, 0.8),
			new PhyscData("ㅅㅂ", 174, 0.8)				
		};
		
		Arrays.sort(X, PhyscData.HEIGHT_ORDER);
		
		System.out.println("신체검사 리스트");
		System.out.println("이름         키        시력");
		System.out.println("==============");
		for(int i = 0; i< X.length ; i++ ) {
			System.out.println(X[i].name +"     "+X[i].height+"      "+X[i].vision);
		}
		
		
		
		
		
	}
}
