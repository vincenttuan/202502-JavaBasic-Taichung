public class Main14 {

	public static void main(String[] args) {
		// 關係運算子
		int score = 45;
		// 判斷是否及格 ?
		if(score >= 60) {
			System.out.println("及格");
		}
		// 判斷是否不及格 ?
		if(score < 60) {
			System.out.println("不及格");
		}
		if(!(score >= 60)) {
			System.out.println("不及格");
		}
	}

}