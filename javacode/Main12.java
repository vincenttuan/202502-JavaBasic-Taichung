/*
	飲料一瓶 10 元
	買二送三
	請問買 11 瓶要多少錢 ?
*/
public class Main12 {
	public static void main(String[] args) {
		int price = 10; // 飲料價格
		int buy = 11;    // 要買的瓶數

		int set = (buy/5)*2; // 有幾組
		int mod = buy%5; // 餘數

		int total = (set + mod) * price;

		// 印出 total
		System.out.printf("total=%d%n", total);
	}
}
