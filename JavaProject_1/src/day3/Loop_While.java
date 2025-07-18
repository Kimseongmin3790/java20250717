package day3;

import java.util.Scanner;

public class Loop_While {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
//		int i = 0;
//		while(i<10) {
//			System.out.println(i);
//			i++;
//		}
		
		// 1.1부터 사용자가 입력한 숫자까지 합을 구하기
		// while문 사용하기
		
		
//		System.out.println("숫자 입력 : ");
//		int num = s.nextInt();
//		
//		int i = 1;
//		int sum = 0;
//		while(i<=num) {
//			sum += i;
//			i++;
//		} System.out.println(sum);
		
		
		// 2.구구단짜기
		// while문 사용하기
		
		int i = 2;
		int j = 1; // 바깥에서 선언할 경우 안쪽에서 루프가 되지 않음
		
		while(i<=9) {
			// int j = 1;
			while(j<=9) {
				System.out.println(i + " * " + j + " = " + i*j);
				j++;
			}
			System.out.println();
			j = 1; // 안쪽에서 선언하면 됨
			i++;
			
		}
		
		
		
	}

}
