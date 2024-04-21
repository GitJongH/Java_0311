package ex_first;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("학번 입력>>");
		Scanner scan = new Scanner(System.in); // ctrl + shitf + o : 자동 클래스 import;
		String num = scan.next(); // 문자열 입력 함수 : next()
		
		
		System.out.print("나이 입력>>");
		int age = scan.nextInt(); // 정수 입력 함수 : nextInt()
		
		System.out.println("학번 : " + num + ", 나이 : " + age); // 자바에서 자주 사용하는 println()
		System.out.printf("학번 : %s, 나이 : %d\n", num, age); // C언어 printf()
		
		// 이름 입력받아 출력해보기
		String name = scan.next();
		System.out.print("이름 입력>>");
		System.out.println("이름 : " + name);
	}

}
