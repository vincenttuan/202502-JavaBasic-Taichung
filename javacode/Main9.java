public class Main9 {

	public static void main(String[] args) {
		char h1 = 'H';
		char h2 = '\u0048'; // 'H' 的 unicode 值
		char c = '\u9527'; // 因 unicode 無此資料所以執行後會呈現 ?

		System.out.printf("h1=%c%n", h1);
		System.out.printf("h2=%c%n", h2);
		System.out.printf("c=%c%n", c);

	}

}