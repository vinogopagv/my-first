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

	static BasicsTrainig objToAccess = new BasicsTrainig();
	public static void main(String[] args) {
		objToAccess.methodOne();
		
	}

protected void methodOne() {
	String arr[] = {"0","1","2","3","6","5","7","4"};
	String arr1[] = {"A","B","C","D","E","F","G","H"};
	List<String> listOne  = Arrays.asList(arr);
	List<String> listTwo  = Arrays.asList(arr1);
	List<Integer> listThree = listOne.stream().map(Integer::valueOf).map(mapper -> mapper +10).sorted().collect(Collectors.toList());
	List<String> listFour = listTwo.stream().map(objToAccess::toLowerStr).collect(Collectors.toList());
	System.out.println(listThree);
	System.out.println(listFour);
}
/**
 * method to convert upper to lower case of string
 * @param str
 * @return
 */
protected String toLowerStr(String str) {
	//System.out.println(str1);
	return Optional.ofNullable(str).map(Object::toString).map(String::toLowerCase).orElse(null);
}
}
