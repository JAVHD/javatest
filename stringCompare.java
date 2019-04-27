/*
* @Author: bear
* @Date:   2019-04-26 16:25:58
* @Last Modified by:   bear
* @Last Modified time: 2019-04-26 16:42:26
*/

public class stringCompare {

	public static void main(String[] args) {

		String name01 = "bear";
		String name02 = "bear";

		String name03 = new String("bear");
		String name04 = new String("bear");

		boolean bool;
		boolean bool02;

		bool = (name01 == name02);
		bool02 = (name03 == name04);

		System.out.println(bool);
		System.out.println(bool02);

	}
}