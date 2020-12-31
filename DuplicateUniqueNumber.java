package com.test.repeated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {2,3,4,5,6,7,8,9,3,4,6,7};
		
		Map<Integer,Boolean> uniqueMap= new HashMap<>();
		
		for(int i =0;i<array.length;i++) {
			if(uniqueMap.containsKey(array[i])) {
				uniqueMap.put(array[i], false);
			}else {
				uniqueMap.put(array[i], true);
			}
		}
		
		ArrayList<Integer> repeatedArr = new ArrayList<>();
		ArrayList<Integer> uniqueArr = new ArrayList<>();
		
		for(int key: uniqueMap.keySet()) {
			if(uniqueMap.get(key)) {
				uniqueArr.add(key);
			}else {
				repeatedArr.add(key);
			}
		}
		
		System.out.println("Repeated number: "+repeatedArr);
		System.out.println("Unique number: "+uniqueArr);
		
	}

}
