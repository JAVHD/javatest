/*
* @Author: bear
* @Date:   2019-12-08 12:37:52
* @Last Modified by:   bear
* @Last Modified time: 2019-12-08 12:39:48
*/

public class DeprecatedTest {
	public static void main(String[] args) {
		System.out.println(sayHello());
	}

	@Deprecated
	public static String sayHello() {
		return "Hello";
	}
}