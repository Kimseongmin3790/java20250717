package day3;

import java.util.Scanner;

public class Loop_For4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		// 9단 => 2단
		// 9 * 9 = 81
		// 9 * 8 = 72
		// ....
		// 2 * 1 = 2
		
//		for(int i=9; i>=2; i--) {
//			System.out.println("====== " + i + " 단 ======");
//			for(int j=9; j>=1; j--) {
//				System.out.println(i + " * " + j + " = " + (i*j));
//			}
//			System.out.println();
//		}
		
		// 숫자를 하나 입력받아서 해당 숫자만큼 늘어나는 별찍기
		// ex) 4를 입력
		// 결과
		// *
		// **
		// ***
		// ****
		
		System.out.print("숫자를 입력하세요 : ");
		int num = s.nextInt();
		
		for(int i = 1; i<=num; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*"); // 줄바꿈 ln 빼기
			}
			System.out.println();
			
		}
			
		}
		
		
}

