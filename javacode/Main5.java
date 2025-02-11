/*
	半徑 = 10 求計算圓面積(area)與球體積(volume)
	圓面積公式: pi * r * r
	球面積公式: 4/3.0 * pi * r * r * r;
*/
public class Main5 {
	public static void main(String[] args) {
		int r = 10; // 半徑
		double pi = 3.1415926; // 圓周率
		double area = pi * r * r;
		double volume = 4/3.0 * pi * r * r * r;
		System.out.printf("Area = %,.2f%n", area);
		System.out.printf("Volume = %,.2f%n", volume);
	}
}