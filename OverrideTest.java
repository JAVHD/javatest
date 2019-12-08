/*
* @Author: bear
* @Date:   2019-12-08 11:56:45
* @Last Modified by:   bear
* @Last Modified time: 2019-12-08 12:17:07
*/

public class OverrideTest {
	public static void main(String[] args) {
		System.out.println(bclass.sayHello());
	}

	static class aclass {
		public static String sayHello() {
			return "";
		}
	}

	static class bclass extends aclass {
		@Override //声明重写，便于编译器检查
		public static String sayHello() {
			return "Hello";
		}
	}
}