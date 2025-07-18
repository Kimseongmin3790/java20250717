package day3;

import java.util.Scanner;

public class Day2_Review5 {

	public static void main(String[] args) {
		// 1. 숫자를 하나 입력받아서 홀수면 '홀수' 짝수면 '짝수' 출력
		// 2. 숫자를 5번 입력받아서 해당 숫자들의 합을 출력
		// 3. 숫자를 5번 입력받아서 입력받은 수 중에서 가장 큰 수만 출력
		
		Scanner s = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 : ");
//		int num = s.nextInt();
//		
//		if(num % 2 == 1) {
//			System.out.println("홀수");
//		} else {
//			System.out.println("짝수");
//		}
//		
//		Scanner s = new Scanner(System.in);
//		System.out.println("1번째 숫자를 입력하세요 : ");
//		int num1 = s.nextInt();
//		System.out.println("2번째 숫자를 입력하세요 : ");
//		int num2 = s.nextInt();
//		System.out.println("3번째 숫자를 입력하세요 : ");
//		int num3 = s.nextInt();
//		System.out.println("4번째 숫자를 입력하세요 : ");
//		int num4 = s.nextInt();
//		System.out.println("5번째 숫자를 입력하세요 : ");
//		int num5 = s.nextInt();
//		
//		System.out.println("입력한 숫자들의 합은 : " + (num1 + num2 + num3 + num4 + num5));
//		
//		
//		Scanner s = new Scanner(System.in);
//		System.out.println("1번째 숫자를 입력하세요 : ");
//		int num1 = s.nextInt();
//		System.out.println("2번째 숫자를 입력하세요 : ");
//		int num2 = s.nextInt();
//		System.out.println("3번째 숫자를 입력하세요 : ");
//		int num3 = s.nextInt();
//		System.out.println("4번째 숫자를 입력하세요 : ");
//		int num4 = s.nextInt();
//		System.out.println("5번째 숫자를 입력하세요 : ");
//		int num5 = s.nextInt();
//		
//		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
//			System.out.println("입력한 숫자 중 가장 큰 수 : " + (num1));
//		} else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
//			System.out.println("입력한 숫자 중 가장 큰 수 : " + (num2));
//		} else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
//			System.out.println("입력한 숫자 중 가장 큰 수 : " + (num3));
//		} else if (num4 > num1 && num4 > num3 && num4 > num2 && num4 > num5) {
//			System.out.println("입력한 숫자 중 가장 큰 수 : " + (num4));
//		} else if (num5 > num1 && num5 > num3 && num5 > num4 && num5 > num2) {
//			System.out.println("입력한 숫자 중 가장 큰 수 : " + (num5));
//		}
//		
		// 음수 입력시 0이 출력됨
		int sum = 0;
		for(int i=1; i<=5; i++) {
			System.out.println(i + "번째 숫자 입력 : "); 
			int num = s.nextInt();
//			if (i == 1) { // 모두 음수를 입력했을 때 정상 동작시키는 조건문
//				sum = num;
//			}
			if (num > sum) {
				sum = num;
			} else {}
		}  System.out.println("입력한 수 중 가장 큰 수는 : " + (sum));
		
		
	}

}
