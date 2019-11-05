/*
* @Author: bear
* @Date:   2019-11-05 23:58:07
* @Last Modified by:   bear
* @Last Modified time: 2019-11-06 00:10:47
*/

public class ClassInClass {
	public static void main(String[] args) {
		//InClass inclass = new InClass();
		System.out.println(InClass.sayHello());
	}


	public static class InClass {
		public static String sayHello() {
			return "hello";
		}
	}
}
