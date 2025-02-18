public class Main17 {
	public static void main(String[] args) {
		// 若分數及格或尾數是9則多加 10 分
		int score = 59;
		
		if(score >= 60 || score % 10 == 9) {
			score += 10; // score = score + 10;
		}

		System.out.println(score);
	}
}