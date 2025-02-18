public class Main13 {
	public static void main(String[] args) {
		System.out.println("Java 遞增++ 遞減-- 運算子");

		int var = 10;
		int age = 10;
		//var = ++age; // 前序遞增: age 的值加上 1 之後才給 var
		var = age++;   // 後序遞增: age 的值會先給 var 之後 age 再自己加上 1
		
		System.out.printf("age = %d%n", age);
		System.out.printf("var = %d%n", var);

	}
}