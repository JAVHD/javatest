/*
* @Author: bear
* @Date:   2019-04-26 16:25:58
* @Last Modified by:   bear
* @Last Modified time: 2019-10-20 19:55:15
*/

public class stringCompare {

	public static void main(String[] args) {

		String name01 = "bear";
		String name02 = "bear";

		String name03 = new String("bear");
		String name04 = new String("bear");

		Integer a = 100;
		Integer b = 100;

		Integer c = new Integer(100);
		Integer d = new Integer(100);

		boolean bool;
		boolean bool02;

		bool = (name01 == name02);
		bool02 = (name03 == name04);

		System.out.println(bool); //true
		System.out.println(bool02); //false
		System.out.println(name03.equals(name04)); //true
		System.out.println(a == b); //true
		System.out.println(c == d); //fasle
		System.out.println(d);

		System.out.println("name03:" + System.identityHashCode(name01));
		System.out.println("name04:" + System.identityHashCode(name02));

		System.out.println("name03:" + System.identityHashCode(name03));
		System.out.println("name04:" + System.identityHashCode(name04));

	}
}