/*
* @Author: bear
* @Date:   2019-05-24 11:48:34
* @Last Modified by:   bear
* @Last Modified time: 2019-05-24 11:53:43
*/

public class classMember {

	private static String name = "bear";

	public static String getString() {
		return name;
	}

	public static void main(String[] args) {
		System.out.println(getString());
	}

}