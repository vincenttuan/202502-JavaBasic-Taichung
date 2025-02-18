public class Main18 {
	public static void main(String[] args) {
		// 在分數是及格的狀況下尾數是9或是偶數則多加 10 分
		int score = 59;

		if(score >= 60) {

			if(score % 10 == 9 || score % 2 == 0) {
				score += 10;
			}

		}

		System.out.println(score);
	}
}