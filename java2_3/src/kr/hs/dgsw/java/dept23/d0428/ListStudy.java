package kr.hs.dgsw.java.dept23.d0428;

import java.util.ArrayList;
import java.util.List;

public class ListStudy {

	public void studyList() {
		List<String> list = new ArrayList<String>();
		String[] array = new String[5];
		

		// �����ϱ�
		array[0] = "blue";
		array[1] = "black";
		array[4] = "red";
		
		list.add("blue");
		list.add("black");
		list.add("red");
		list.add("pink");
		list.add("yellow");
		list.add("green");
		
		list.add(3, "white");
		
		
		// �о����
		String color = array[1];
		
		color = list.get(1);
	
		// ũ��
		int size = array.length;
		size = list.size();
		
		for (int i = 0 ; i < list.size() ; i++) {
			System.out.println(i + " : " + list.get(i));
		}
	
		for (String str : list) {
			System.out.println(str);
		}
		
		// �����ϱ�
		String value = list.remove(1);
		System.out.println(list.get(1));
	}
	
	public static void main(String[] args) {
		ListStudy study = new ListStudy();
		study.studyList();
		
		
	}
}
