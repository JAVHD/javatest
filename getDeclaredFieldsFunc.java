/*
* @Author: bear
* @Date:   2019-05-21 22:18:55
* @Last Modified by:   bear
* @Last Modified time: 2019-05-21 22:43:57
*/

import java.lang.reflect.Field;

class Example {

	int a;
	public float b;
	protected boolean c;
	private String d;


}

public class getDeclaredFieldsFunc {

	public static void main(String[] args) {

		Example example = new Example();

		Class exampleClass = example.getClass();

		Field[] declaredFields = exampleClass.getDeclaredFields();

	}
}

