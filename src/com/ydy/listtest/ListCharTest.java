package com.ydy.listtest;

import java.util.Arrays;
import java.util.List;
import java.util.Iterator;


public class ListCharTest {

	public static void main(String[] args) {
		
		Character[] char01 = new Character[] {'b','c','d'};
		char charValue = char01[0].charValue();
		int compareTo = char01[1].compareTo('c');
		boolean equals = char01[2].equals('d');

		List<Character> asList = Arrays.asList(char01);
		
		 Iterator<Character> iterator = asList.iterator();
		 while(iterator.hasNext())
			 System.out.println(iterator.next());
		
		
		
	}
}
