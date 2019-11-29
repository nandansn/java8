package com.nanda.java8.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ForEachExp1 {

	public static void main(String[] args) {
		
			List<String> names = new ArrayList<>();
		      Scanner in = new Scanner(System.in);
		      
		      Map<Integer, String> nameMap = new HashMap<Integer, String>();
		     int i =1;   
			String input =  in.nextLine();
			while (!input.equals("q")){
				names.add(input);
				nameMap.put(i, input);
				input =  in.nextLine();
				++i;
			}
			
			names.forEach(name -> System.out.println(name));
			
			// using method reference
			
			names.forEach(System.out::println);
			
			nameMap.entrySet().forEach(entry -> {
				System.out.println("Key:"+entry.getKey()+";"+"Value:"+entry.getValue()); 
			});
	}

}
