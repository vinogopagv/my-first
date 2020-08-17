package com.vinogopa.main.javabasics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 
 * @author Vinothkumar
 *
 */
public class BasicsTrainig {

	public static void main(String[] args) {
		BasicsTrainig obj1 = new BasicsTrainig();
		obj1.methodOne();
		obj1.toLowerStr("VINOTH");
		
	}

protected void methodOne() {
	String arr[] = {"0","1","2","3","6","5","7","4"};
	String arr1[] = {"A","B","C","D","E","F","G","H"};
	List<String> listOne  = Arrays.asList(arr);
	List<String> listTwo  = Arrays.asList(arr1);
	List<Integer> listThree = listOne.stream().map(Integer::valueOf).map(mapper -> mapper +10).sorted().collect(Collectors.toList());
	System.out.println(listThree);
}

protected String toLowerStr(String str) {
	String str1 = Optional.ofNullable(str).map(Object::toString).map(String::toLowerCase).orElse(null);
	System.out.println(str1);
	return str1;
}
}
