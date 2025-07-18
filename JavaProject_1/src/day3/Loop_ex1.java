package day3;

import java.util.Random;
import java.util.Scanner;

public class Loop_ex1 {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			Random ran = new Random();
			
			System.out.print("원하는 문제수를 입력해 주세요 : ");
			int num = s.nextInt();
			
			System.out.println((num) + "문제 풀이를 시작합니다. 정답에 0을 입력하면 종료됩니다.");
//			int count = 0;
			for(int i = 1; i <= num; i++) {
				int x = ran.nextInt(8)+2;
				int y = ran.nextInt(9)+1;
				System.out.print((i) + "번 : " + (x) + " * " + (y) + " = ");
				int sum = s.nextInt();  // 변수 선언으로 한문제씩 끊어주기
				if(sum == x*y) {
					System.out.println("정답 입니다.");
//					count++;
				} else if(sum == 0) {
					System.out.println("0을 입력하여 종료됩니다..");
//					num = i - 1; 3번째 문제때에 0을 입력하면 2문제만 푼거기에 -1을 해줌
					break;
				} else {
					System.out.println("틀렸습니다!");
				}
			} System.out.println("총 " + (num) + "문제 중 " + (//count) + "문제를 맞추셨습니다.");
	}

}
