package class01;

public class Test01 {

	public static void main(String[] args) {

		// 제어문을 중첩하는 것은 당연함
		// 이중for문
		
		// 제어문 >> 반복문 >> for : 디버깅표 그리기 이유가 있다
		
//		2 x 1 = 2
//		2 x 2 = 4
//		...
//		2 x 9 = 18
		// 반복되는 문장이 있을 때,
		// 달라지는 부분을 변수로 둔다!
		
		// ctrl+C,V --->> 어? 똑같네? 반복인가?
		for(int a = 2; a<=9 ; a++) {
			// 8번 수행됩니다. 
			for(int i=1; i<=9 ; i++) {
				// 8 x 9=72번 수행됩니다.
				System.out.println(a + " x "+ i + " = " + (2*i));
			}
			System.out.println("-------------------------------");
		}
		
		// 내가 원하는 코드, 어디에 넣어야 할까??
		// 1. 뉘앙스 파악
		// 2. 반복문 코드 깊이마다 수행횟수 파악
		//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
