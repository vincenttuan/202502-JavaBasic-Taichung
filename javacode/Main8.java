public class Main8 {

	public static void main(String[] args) {
		float x = 3.14f; // float 必需要強迫在數字後面加上 f 或 F
		double y = 3.14; // java 浮點數的預設值就是 double 所以數字後面可不做更動
		double z = 3.14d; // 可以加 d 或 D
		System.out.printf("x=%f%n", x);
		System.out.printf("y=%f%n", y);
		System.out.printf("z=%f%n", z);

		System.out.printf("x=%.1f%n", x);
		System.out.printf("y=%.2f%n", y);
		System.out.printf("z=%.3f%n", z);
	}

}