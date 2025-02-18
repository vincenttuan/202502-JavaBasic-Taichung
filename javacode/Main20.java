public class Main20 {

	public static void main(String[] args) {
		
		String id = "A123456789";
				//   0123456789 <- 索引位置	
		System.out.printf("身分證號: %s%n", id);
		System.out.println(id.charAt(0)); // 得到 'A' 字元
		System.out.println(id.charAt(1)); // 得到 '1' 字元

		char gender = id.charAt(1); // 性別資料
		// if-else
		if(gender == '1') {
			System.out.println("男性");
		} else if(gender == '2') {
			System.out.println("女性");
		} else {
			System.out.println("性別錯誤");
		}

		// switch-case
		switch(gender) {
			case '1':
				System.out.println("男性");
				break;
			case '2':
				System.out.println("女性");
				break;
			default:
				System.out.println("性別錯誤");
		}

	}

}