/*
* @Author: bear
* @Date:   2019-09-19 10:21:02
* @Last Modified by:   bear
* @Last Modified time: 2019-09-19 10:32:12
*/

interface ia {}

interface ib extends ia {}

class classa implements ib {}

class classb extends classa {}

public class instanceofKeywords {
	public static void main(String[] args) {

		classa instancea = new classa();

		//boolean

		System.out.println(instancea instanceof ia);
		System.out.println(instancea instanceof ib);

	}
}