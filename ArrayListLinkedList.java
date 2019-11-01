/*
* @Author: bear
* @Date:   2019-10-30 11:45:06
* @Last Modified by:   bear
* @Last Modified time: 2019-10-31 10:08:34
* 插入速度对比
*/

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListLinkedList {
	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();

//		//开始时间
//		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			arrayList.add(i);
		}
//		//结束时间
//		long end1 = System.currentTimeMillis();
//		long time1 = end1 - start1;

//		//开始时间
//		long start2 = System.currentTimeMillis();
		LinkedList<Integer> linkedList = new LinkedList<>();
		for (int i = 0; i < 10000000; i++) {
			linkedList.addLast(i); //链表尾部
		}
//		//结束时间
//		long end2 = System.currentTimeMillis();
//		long time2 = end2 - start2;

		Integer item1;
		Integer item2;

		//读取速率
		long start1 = System.currentTimeMillis();
		for (Integer itemTemp1:
				arrayList) {
			item1 = itemTemp1;
		}
		long end1 = System.currentTimeMillis();
		long time1 = end1 - start1;

		long start2 = System.currentTimeMillis();
		for (Integer itemTemp2:
				linkedList) {
			item2 = itemTemp2;
		}
		long end2 = System.currentTimeMillis();
		long time2 = end2 - start2;

		System.out.println(time1);
		System.out.println(time2);


	}
}