package org.opentutorials.javatutorials.numberstring;

public class CharString {
	
	public static void main(String[] args) {
		/*
		 * 문자: 
		 * 한글자를 말하며 '로 감싸서 사용하여야 한다.
		 * 
		 * 문자열:
		 * 두개이상의 문자들을 얘기하며 "로 감싸서 사용해야 한다.
		 * 
		 * 숫자나 문자를 입력할 때 사용하는 +를 연산자라고 한다.
		 */
		
	
//				문자 예제
				System.out.println('가');
				
//				문자열 예제 1
				System.out.println("가나다라");
				
//				문자열 예제 2
				System.out.println("가");
				/*
				 * 한글자(문자)는 문자열로 표기할 수 도 있다.
				 */
				
//				연산 예제 1
				System.out.println("오성택"+"입니다");
				
//				연산 예제 2
				System.out.println("1"+"1");
				/*
				 * 큰따움표로 감싸져있으면 숫자도 문자열로 인식된다
				 * 출력값 : 11
				 */
				
//			잘못된걸 보여주는 예
//				System.out.println('생활코딩');
				/*
				 * 프로블럼에 표기되어 알려준다
				 */
		
//		만약 문자열 안에 큰 따옴표를 넣고 싶다면 어떻게 해야할까?
		System.out.println("egoing said\n\"Welcome programming world\"");
		/*
		 * "앞에 \(역슬래시)를 사용하면 "를 문자로 인식한다
		 * \n : 엔터값
		 */
	}

}
