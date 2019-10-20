/*
* @Author: bear
* @Date:   2019-10-20 20:43:34
* @Last Modified by:   bear
* @Last Modified time: 2019-10-20 22:02:23
* 泛型……
*/



public class GenericTypeTest {
	public static void main(String[] args) {

		//GenericType<String> genericType = new GenericType<String>("bear");
		GenericType<String, Integer> genericType = new GenericType<>("bear", 18);

		System.out.println(genericType.getName());
		//System.out.println(genericType.GenericType());

		Generic<Integer> genericInteger = new Generic<Integer>(123456);
		//genericInteger.getKey()
		System.out.println(genericInteger.getKey());

	}
}



