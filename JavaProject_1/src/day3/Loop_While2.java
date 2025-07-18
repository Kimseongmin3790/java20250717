package day3;

import java.util.Random;
import java.util.Scanner;

public class Loop_While2 {

	public static void main(String[] args) {
		// 랜덤 구구단 문제 출력
		// 사용자가 5문제를 맞추면
		// "5문제를 맞추셨습니다" 출력하고 종료
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		System.out.println("랜덤 구구단 문제 풀이(0을 누르면 종료됩니다.)");
		
		int count = 0;
		while(true) {
			int x = ran.nextInt(8)+2;
			int y = ran.nextInt(9)+1;
			
			System.out.print(x + " * " + y + " = ");
			int answer = s.nextInt();
			
			if(answer == x*y) {
				System.out.println("정답입니다");
				count++;
			} else {
				System.out.println("오답입니다");
			}
			
			if(count == 5) {
				System.out.println("5문제를 맞추셨습니다");
				break;
			}
			
		} System.out.println("구구단 문제 종료");
	}

}
