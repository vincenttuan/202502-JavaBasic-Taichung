public class Main21 {
	// 位元運算子 &(and) |(or) ^(xor)
	public static void main(String[] args) {
		int x = 5 & 3;
		/*
		    0...00101 <- 5
		  & 0...00011 <- 3
		---------------------
		    0...00001 <- 1
		*/
		System.out.println(x);

		int y = 5 | 3;
		/*
		    0...00101 <- 5
		  | 0...00011 <- 3
		---------------------
		    0...00111 <- 7
		*/
		System.out.println(y);

		int z = 5 ^ 3;
		/*
		    0...00101 <- 5
		  | 0...00011 <- 3
		---------------------
		    0...00110 <- 6
		*/
		System.out.println(z);

	}


}