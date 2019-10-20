/*
* @Author: bear
* @Date:   2019-10-20 21:44:09
* @Last Modified by:   bear
* @Last Modified time: 2019-10-20 22:02:19
*/


// public class GenericType<N> {

// 	// public static void main(String[] args) {

// 	// }

// 	private N name;

// 	public GenericType(N name) {
// 		this.name = name;
// 	}

// 	public N getName() {
// 		return name;
// 	}


// }

public class GenericType<N, A> {

	// public static void main(String[] args) {

	// }

	private N name;
	private A age;

	public GenericType(N name, A age) {
		this.name = name;
		this.age = age;
	}

	// public Integer GenericType(N name, A age) {
	// 	// this.name = name;
	// 	// this.age = age;
	// 	return 2019
	// }

	public N getName() {
		return name;
	}

	public A getAge() {
		return age;
	}

}