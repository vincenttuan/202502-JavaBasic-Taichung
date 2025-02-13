public class Main10 {

	public static void main(String[] args) {
		// char 可以與 int 互動
		// char 的 int 範圍是 0~65535
		char a1 = 'A';
		char a2 = 65; // 指的是 ASCII 65 = A
		char at = 64; // 指的是 ASCII 64 = @
		System.out.printf("a1=%c%n", a1);
		System.out.printf("a2=%c%n", a2);
		System.out.printf("at=%c%n", at);
		//-----------------------------------
		int a = '我';
		int b = '愛';
		int c = '你';
		System.out.printf("a=%d%n", a);
		System.out.printf("b=%d%n", b);
		System.out.printf("c=%d%n", c);
		System.out.println(a+b+c);
	}

}