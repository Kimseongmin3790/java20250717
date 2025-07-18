package day3;

import java.util.Random;
import java.util.Scanner;

public class Loop_Random1 {

	public static void main(String[] args) {
		// 랜덤한 구구단 문제를 출제
		// 맞췄을 때 점수를 준다거나, 맞춘 개수를 판단하거나
		// Math, Random
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
//		int x = ran.nextInt(10); // 0~9
//		int y = ran.nextInt(10) + 1;// 1~10
//		System.out.println(x);
		
		int x = ran.nextInt(8) + 2; // 2~9
		int y = ran.nextInt(9) + 1; // 1~9
		System.out.println("랜덤 구구단 문제 풀이");
		System.out.print(x + " * " + y + " = ");
		
		int ans = s.nextInt();
		if (x*y == ans) {
			System.out.println("정답입니다");
		} else {
			System.out.println("틀렸습니다.");
		}
		
		// 정답을 입력받고
		// 정답이면 "정답입니다.", 오답이면 "틀렸습니다." 출력
	}

}