/*
* @Author: bear
* @Date:   2019-11-07 17:39:01
* @Last Modified by:   bear
* @Last Modified time: 2019-11-07 17:39:52
*/

public class StaticFunc {
	public static void main(String[] args) {
		System.out.println(sayHello()); // 错误: 无法从静态上下文中引用非静态 方法
	}

	public String sayHello() {
		return "hello";
	}
}
