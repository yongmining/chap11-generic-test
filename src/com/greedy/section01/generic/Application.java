package com.greedy.section01.generic;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		/* ���׸�(generic) 
		 * ������ Ÿ���� �Ϲ�ȭ �Ѵ�.
		 * 
		 * JDK 1.5���� �߰��� �����̴�.
		 * �������� ���Ŀ� �������� �ʰ� �ϳ��� ���� ���� �ٸ� ������ Ÿ�Ե��� ���� �� �ִ� ����� ������ �ξ�
		 * ���뼺�� ���� �� �ִ� ���α׷��� ����̴�.
		 * */
		GenericTest<Integer> gt1 = new GenericTest<Integer>();
		gt1.setValue(1);
		System.out.println(gt1.getValue());
		System.out.println(gt1.getValue() instanceof Integer);
		
		/* JDK 7���� Ÿ�� ���� �� Ÿ�Ժ����� �ۼ��Ǹ� Ÿ�� �߷��� �����ϱ� ������
		 * ������ ȣ�� ���� ���� Ÿ���� �����ϰ� ����� �� �ְ� �Ǿ���.
		 * ��, Ÿ���� ��õ��� ���� �� ���̾Ƹ�� �����ڴ� ����ؾ� �Ѵ�.
		 *  */
		GenericTest<String> gt2 = new GenericTest<>();
		gt2.setValue("ȫ�浿");
		System.out.println(gt2.getValue());
		System.out.println(gt2.getValue() instanceof String);
		
//		List<String> list = new ArrayList<>();
//		list.add("1234");
//		list.add(1234);
//		
//		List<Integer> list2 = new ArrayList<>();
//		list2.add(1234);
//		list2.add("1234");
	}

}
