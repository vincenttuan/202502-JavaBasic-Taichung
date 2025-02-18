public class Main16 {
	public static void main(String[] args) {
		// 若分數及格且是偶數則多加 10 分
		int score = 82;
		if(score >= 60 && score % 2 == 0) {
			score = score + 10;
		}
		System.out.println(score);
	}
}