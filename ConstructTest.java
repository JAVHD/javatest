
/*
* @Author: bear
* @Date:   2019-10-20 22:53:24
* @Last Modified by:   bear
* @Last Modified time: 2019-10-20 23:01:59
* class 构造方法时候可以重载的，但不可以有返回值
*/

public class ConstructTest {
	public static void main(String[] args) {

		Construct construct = new ConstructTest().new Construct("bear");
		System.out.println(construct.getName());

		Construct constructAge = new ConstructTest().new Construct(18);
		System.out.println(constructAge.getAge());
	}

	//内部类
	public class Construct {

		private String name;
		private Integer age;

		//构造函数不允许有返回值
		public Construct(String name) {
			this.name = name;
			//return this.name;
		}

		public Construct(Integer age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public Integer getAge() {
			return age;
		}


	}
}
