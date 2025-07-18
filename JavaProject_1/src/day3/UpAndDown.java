package day3;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Up & Down Game Start");
		
		int random = ran.nextInt(100)+1; // 1 ~ 100
		int count = 0;
		int wrong = 0;
		int wrong2 = 0;
		while(true) {
			System.out.print("숫자 입력 : ");
			int answer = s.nextInt();
			// if (answer >= 1 && answer <= 100)
			count++;
			if(answer > 100 || answer < 1) {
				System.out.println("잘못 입력하셨습니다.");
				count--;
			} else if(random > answer) {
				System.out.println("Up");
				System.out.println(count + "번 시도하셨습니다.");
				wrong = answer;
			} else if (random < answer) {
				System.out.println("Down");
				System.out.println(count + "번 시도하셨습니다.");
				wrong2 = answer;
			} else {
				System.out.println("정답입니다!");
				break;
			}
		}
		
		System.out.println(count + "번 만에 맞추셨습니다!");
		
		// 50을 입력하고 up이 나왔는데 30을 입력했을때 더 높은수로 유도하기
		
	}

}  // 반복문의 배열 1차원 배열. 메소드.
}