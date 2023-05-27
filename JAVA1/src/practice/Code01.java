package practice;

public class Code01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, n, best = 0, b = 0 ;
		
		System.out.println("약수표");
		for (n = 2 ; n <= 10000 ; n++) //숫자 카운트
		{
			System.out.print(n + ": ");
			while (n >= a) // 숫자의 약수 확인 반복
			{
				if(n % a == 0) // 약수일때 동작
				{
					b++;
					System.out.print(n / a + ", ");
				}//약수일때 동작 - 끝 
				a++;
			}// 약수 확인 반복 - 끝
			
			if(b >= best) 
				best = b;
			a = 1;//
			b = 0;
			System.out.println();
		}// 숫자 카운트 - 끝
		System.out.println("최고 약수 개수 : " + best);
		System.out.println("end");
	}
}
