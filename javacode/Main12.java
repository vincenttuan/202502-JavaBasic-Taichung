/*
	飲料一瓶 10 元
	買二送一
	請問買 10 瓶要多少錢 ?
*/
public class Main12 {
	public static void main(String[] args) {
		int price = 10; // 飲料價格
		int buy = 10;    // 要買的瓶數

		int set = (buy/3)*2; // 有幾組
		int mod = buy%3; // 餘數

		int total = (set + mod) * price;

		// 印出 total
		System.out.printf("total=%d%n", total);
	}
}
