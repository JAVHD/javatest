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

		String s3 = new String("123");
		String s4 = new String("123");

		Integer age1 = 18;
		Integer age2 = 18;

		Integer age3 = new Integer(18);
		Integer age4 = new Integer(18);

		obj o1 = new obj();
		obj o2 = new obj();

		System.out.println(s1 == s2); //true
		System.out.println(s3 == s4); //false
		System.out.println(s3.equals(s4)); //true

		System.out.println(age1 == age2); //true
		System.out.println(age3 == age4); //false
		System.out.println(o1 == o2); //false
		System.out.println(s1.equals(s2)); //true
		System.out.println(o1.equals(o2)); //false

		//
		Object1 object1 = new Object1();
		Object2 object2 = new Object2();
		System.out.println(object1 == object2); //== 用于基本类型比较
		System.out.println(object1.equals(object2));



	}

}

class obj {

}

class Object1 {
	public Integer age;
}

class Object2 {
	public Integer age;
}


