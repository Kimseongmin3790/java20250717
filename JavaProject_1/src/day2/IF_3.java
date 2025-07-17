package day2;

import java.util.Scanner;

public class IF_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 나이를 입력받아서 나이에 따라 성인인지 아닌지 구분
		System.out.print("나이를 입력해 주세요 : ");
		int num1 = s.nextInt();
		
		if(num1 >= 19) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("성인이 아닙니다.");
		}
		
			
		
	}

}
