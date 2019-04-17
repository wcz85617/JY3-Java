package com.alibaba.tt;

import java.util.Arrays;

public class test1 {
	public static void main(String[] args) {
		Car car= new Car();
		String str = "hello";
		String str1 = "LOVES";
		
		String string = new String("hello");
		System.out.println(str);
		System.out.println(string);
		System.out.println(str==string);
		char[] c = {'中','国','人'};
		String string3 = new String(c);
		System.out.println(string3);
		String string4 = new String(c,0,2);
		System.out.println(string4);
		System.out.println(str.length());
		char charAt = str.charAt(4);
		System.out.println(charAt);
		String substring = str.substring(1, 3);
		System.out.println(substring);
		int compareto= str.compareTo(str1);
		System.out.println(compareto);
		String concat = str.concat(str1);
		System.out.println(concat);
		int indexOf = str.indexOf("e",0);
		System.out.println(indexOf);
		String toUpper = str.toUpperCase();
		System.out.println(toUpper );
		String tolower = str1.toLowerCase();
		System.out.println(tolower);
		
		String replace= str.replace('e','a');
		System.out.println(replace);
		
		String str2 = "     aabbcc    ";
		String trim = str2.trim();
		System.out.println(trim);
		
		String str3 = "1,Tomi,天津";
		String[] split = str3.split(",");
		System.out.println(Arrays.toString(split));
		System.out.println(split[2]);
		
		String string2= String.valueOf(2.5);
		System.out.println(string2);
	    int parseInt = Integer.parseInt("55");
	    System.out.println(parseInt);
		 
				
 	
		
	}

}
