/*
* @Author: bear
* @Date:   2019-11-05 23:58:07
* @Last Modified by:   bear
* @Last Modified time: 2019-12-08 12:15:55
*/

public class ClassInClass {
	public static void main(String[] args) {

		System.out.println(InClass.sayHello()); //Hello
		System.out.println(new InClass().sayHello()); //Hello

	}


	public static class InClass {
		public static String sayHello() {
			return "Hello";
		}
	}
}
