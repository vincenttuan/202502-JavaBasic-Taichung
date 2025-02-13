public class Main7 {
	public static void main(String[] args) {
		int x1 = 0b11; // 0b 開頭表示後面的資料是二進位
		int x2 = 017;  // 0 開頭表示後面的資料是八進位
		int x3 = 25;   // 十進位
		int x4 = 0xAB; // 0x 開頭表示後面的資料是16進位

		System.out.printf("x1=%d%n", x1);
		System.out.printf("x2=%d%n", x2);
		System.out.printf("x3=%d%n", x3);
		System.out.printf("x4=%d%n", x4);
	}
}