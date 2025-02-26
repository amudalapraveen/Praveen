package com.dev.regx;


	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class CharacterMatching {

		public static void main(String[] args) {
			Pattern pat = Pattern.compile("\\w+\\W\\w+\\.\\w+"); // for email id's.
			Matcher mat = pat.matcher("qwerty@abc.com");
			System.out.println(mat.matches());

			pat = Pattern.compile("\\w+\\s\\w+\\s\\w+"); // for first, middle, and last name
			mat = pat.matcher("A B C");
			System.out.println(mat.matches());

			pat = Pattern.compile("[A-Za-z]{1,4}\\s[A-Za-z]{1,25}"); //for names with limited chars
			mat = pat.matcher("Ivan Shishkin");
			System.out.println(mat.matches());

			pat = Pattern.compile("\\w+\\W+\\w+"); //for alphanumeric passwords
			mat = pat.matcher("afimf#4df");
			System.out.println(mat.matches());

		}

	}

	
	
	



