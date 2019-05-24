/*
* @Author: bear
* @Date:   2019-05-24 11:48:34
* @Last Modified by:   bear
* @Last Modified time: 2019-05-24 14:00:02
*/

public class classMember {

	// private static String name = "bear";

	// public static String getString() {
	// 	return name;
	// }

	// classMember.java:17: 错误: 无法从静态上下文中引用非静态 方法 getString()
	// 	System.out.println(getString());
	// 	                   ^
	// 1 个错误
	// beardeMacBook-Pro:javatest bear$ javac classMember.java
	// classMember.java:13: 错误: 无法从静态上下文中引用非静态 变量 name
	// 		return name;

	private String name = "bear";

	public String getString() {
		return name;
	}


	public static void main(String[] args) {
		//System.out.println(getString());

		classMember cm = new classMember();
		System.out.println(cm.getString());
	}

}