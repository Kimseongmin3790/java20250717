package day2;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // s = 객체(변수 + 메소드)
		System.out.print("숫자를 입력해 주세요 : ");
		int num1 = s.nextInt(); // 숫자를 입력 받는 것
		System.out.print("이름을 입력해 주세요 : ");
		String name = s.next(); // 문자를 입력 받는 것
		
		System.out.println("입력한 숫자 : " + num1);
		System.out.println("입력한 이름 : " + name);
	}

}
