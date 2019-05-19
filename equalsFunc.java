/*
* @Author: bear
* @Date:   2019-05-16 11:08:44
* @Last Modified by:   bear
* @Last Modified time: 2019-05-16 11:29:21
*/

public class equalsFunc {

	public static void main(String[] args) {

		String s1 = "123";
		String s2 = "123";

		obj o1 = new obj();
		obj o2 = new obj();

		System.out.println(s1.equals(s2));
		System.out.println(o1.equals(o2));

	}

}

class obj {

}