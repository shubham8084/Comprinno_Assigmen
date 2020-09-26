package com.comprinno.assigment;

import java.util.ArrayList;
import java.util.List;

public class ArrayManipulation {

	
	//loci to Assing tha Array with input value and return Array with index
	public static List<Integer> assignArray(int a,int b,int c)
	{
		
		List<Integer> list=new ArrayList<>();
		list.add(a);list.add(b);list.add(c);
		return list;
	}//
	
	//find the sum of given Array and return Sum of arrayIndex
	public static int SumOfArray(List<Integer> list) {
		
		int sum=list.get(0)+list.get(1)+list.get(2);
		return sum;
	}
}
