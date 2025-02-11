/*
今有雞、兔同籠，上有三十五頭，下九十四足。問雉、兔各幾何？
雞有 x 隻 兔有 y 隻
x + y = 35 (頭)
2x + 4y = 94 (足)
-----------------
x = 35 - y
2(35 - y) + 4y = 94
70 - 2y + 4y = 94
2y = 94 - 70
y = (94 - 70)/2
*/
public class Main6 {
	public static void main(String[] args) {
		int total = 35;
		int feet = 94;
		int y = (feet - total*2)/2;
		int x = total - y;
		System.out.printf("x = %d y = %d%n", x, y);
	}
}