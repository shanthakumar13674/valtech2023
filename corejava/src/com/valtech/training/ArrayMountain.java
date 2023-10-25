package com.valtech.training;

import java.util.Arrays;
import java.util.List;

public class ArrayMountain {
	
	public static void main(String[] args) {
		List<Integer> arr=Arrays.asList(4,5,6,7,3,2,1);
		int current=0;
		int previous=0;
		int next=1;
		int middle=0;
		int index=0;
		boolean asc=false;
		boolean desc=false;
		while(arr.get(index)<arr.size()) {
			while(next<arr.size() && arr.get(current)<arr.get(next)) {
				previous=current;
				current=next;
				next+=1;
				index+=1;
			}
			middle=current;
			if(arr.get(previous)<arr.get(middle) && arr.get(middle)>arr.get(next)) {
				System.out.println("Middle element is "+arr.get(middle));
				asc=true;
			}
			if(arr.get(middle)>arr.get(next)) {
				desc=true;
			}
//			while(next<arr.size() && arr.get(current)>arr.get(next)){
//				current=next;
//				next+=1;
//				index+=1;
//			}
		}
		if(asc && desc) {
			System.out.println("Mountain");
		}
	}

}
