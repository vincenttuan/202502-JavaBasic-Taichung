public class Main15 {

	public static void main(String[] args) {
		int score = 85;

		if(score >= 60) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}

		// 三元運算子 ? :
		System.out.println( (score >= 60) ? "及格" : "不及格" );


	}

}