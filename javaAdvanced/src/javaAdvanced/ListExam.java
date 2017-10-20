package javaAdvanced;

import java.util.*;

public class ListExam{
  public List<String> addArray(String[]arr1, String[]arr2){
    List<String> list = new ArrayList<String>();

    for(String str : arr1){
      System.out.println(str);     
    }

    for(String str : arr2){
      System.out.println(str);
    }
    

    return list;
  }

  public static void main(String[] args){
	  String[] arr1 = {"a","b"};
	  String[] arr2 = {"d","e","f"};
	  ListExam le = new ListExam();
      le.addArray(arr1,arr2);
  }
}