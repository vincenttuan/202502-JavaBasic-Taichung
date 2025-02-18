public class Main19 {
	// 月份 12, 1, 2 冬
	// 月份  3, 4, 5 春
	// 月份  6, 7, 8 夏
	// 月份  9, 10, 11 秋

	public static void main(String[] args) {
		int month = 2;

		// 請印出季節
		if(month == 12 || month == 1 || month == 2) {
			System.out.println("冬");
		}
		if(month == 3 || month == 4 || month == 5) {
			System.out.println("春");
		}
		if(month == 6 || month == 7 || month == 8) {
			System.out.println("夏");
		}
		if(month == 9 || month == 10 || month == 11) {
			System.out.println("秋");
		}

		// ---------------------------------------------
		if(month == 12 || month == 1 || month == 2) {
			System.out.println("冬");
		} else if(month == 3 || month == 4 || month == 5) {
			System.out.println("春");
		} else if(month == 6 || month == 7 || month == 8) {
			System.out.println("夏");
		} else if(month == 9 || month == 10 || month == 11) {
			System.out.println("秋");
		}

		// ---------------------------------------------
		// 改用 switch-case
		switch(month) {
			case 12:
			case 1:
			case 2:
				System.out.println("冬");
				break;	
			case 3:
			case 4:
			case 5:
				System.out.println("春");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏");
				break;	
			case 9:
			case 10:
			case 11:
				System.out.println("秋");
				break;	
			default:
				System.out.println("錯誤");
		}
		// JDK 12(含)以後的 switch-case
		switch(month) {
			case 12, 1, 2:
				System.out.println("冬");
				break;	
			case 3, 4, 5:
				System.out.println("春");
				break;
			case 6, 7, 8:
				System.out.println("夏");
				break;	
			case 9, 10, 11:
				System.out.println("秋");
				break;	
			default:
				System.out.println("錯誤");
		}
		
	}
}