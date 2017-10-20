package javaAdvanced;

import java.util.ArrayList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("kim");
		list.add("kang");
		list.add("kim");
		
		System.out.println(list.size());
		
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
