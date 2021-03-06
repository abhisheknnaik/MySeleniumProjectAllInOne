package basicJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AllBasicPrograms {

	/**
	 * @param args
	 * @throws IOException
	 * @throws ParseException
	 */
	public static void main(String[] args) throws IOException, ParseException {
		dateBetween2Date();
//		fibonasis();
//		factorial();
//		bubbleSort();
//		swapTwoNum();
//		PalindromeNumber();
//		PalindromeString();
//		armstrongNumber();
//
//		sumOfDigitFromString();
//		readTxtFileInReverseOrder();
//		primeNumberWithinRange();
//		primeNumber();
//		primeNumberUsingWhile();
//		stringRevese("Abhishek");
//		paraWithReveseOrderOfChar();
//		strToNumber();
//		convertBinaryToDigit();
//		convertDigitToBinaryUsingArrayList(8);
//		convertDigitToBinary(8);
//		convertDigitToBinary(10);
//		System.out.println(" using mothod " + Integer.toBinaryString(8));
//		convertDigitToBinaryUsingStack(8);
//		System.out.println(convert(119));
//		firstNonRepetingChar();
//		readCSVFileDataLineByLine("./MyCSV.csv");
//		readConfigFile();
	}

	// fibonacies series
	public static void fibonasis() {
		int a = 0, b = 1, temp, num;
		System.out.println("fibonacies");
		num = 10;
		for (int i = 0; i < num; i++) {
			System.out.print(a + " ");
			temp = a + b;
			a = b;
			b = temp;
		}

	}

	public static void readConfigFile() throws IOException {

		Properties prop = new Properties();
		// File file = new File("config.properties");
		// FileInputStream is = new FileInputStream(file);
		// both above and below code work
		FileInputStream is = new FileInputStream("config.properties");
		prop.load(is);
		System.out.println("updated code");
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("userName"));
		System.out.println(prop.getProperty("password"));
	}

	public static void dateBetween2Date() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		// sdf.setLenient(false);

		Date d1 = sdf.parse("11-12-2015");
		Date d2 = sdf.parse("15-12-2015");
		Date d3 = sdf.parse("18-12-2015");

		// if (d2.compareTo(d1) >= 0) {
		if (d2.compareTo(d1) >= 0 && d2.compareTo(d3) <= 0) {
			System.out.println("d2 is in between d1 and d2");
		} else {
			System.out.println("d2 is NOT in between d1 and d2");
		}
//          } else {
//                System.out.println("d2 is NOT in between d1 and d2");
//          }
	}

	public static void factorial() {
		int num, fac = 1;
		System.out.println("factorial");
		num = 6;
		for (int i = 1; i <= num; i++) {
			fac = fac * i;
		}
		System.out.println("Factorial of num " + num + " is " + fac);

	}

	public static void bubbleSort() {
		System.out.println("Bubble sort");
		int[] arr = { 11, 3, 24, 5, 13 };
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < (arr.length - i) - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	public static void swapTwoNum() {
		int a = 10, b = 5;
		System.out.println("Before swap: a:" + a + " b:" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swap: a:" + a + " b:" + b);

	}

	// Palindrome 123321
	public static void PalindromeNumber() {
		int num, rev = 0, temp;
		System.out.println("PalindromeNumber");
		num = 12321;
		temp = num;
		while (temp != 0) {
			rev = rev * 10 + temp % 10;
			temp = temp / 10;
		}
		System.out.println("Reverse Num:" + rev);
		if (num == rev) {
			System.out.println("Number is palindrom number");
		} else {
			System.out.println("Number is Not a palindrom number");
		}

	}

	public static void PalindromeString() {
		String str;
		Boolean isPalindrome = true;
		System.out.println("PalindromeString");
		str = "abhiihba";
		int stringLength = str.length();
		for (int i = 0; i < stringLength / 2; i++) {
			if (str.charAt(i) != str.charAt(stringLength - i - 1)) {
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome) {
			System.out.println("String is palindrome ");
		} else {
			System.out.println("String is Not a palindrome ");
		}

	}

	// sum of the cubes of its digits is equal to the number itself.
	public static void armstrongNumber() {
		int num, sumOfCube = 0, temp, n;
		System.out.println("armstrongNumber");
		num = 153;
		temp = num;
		while (temp != 0) {
			n = temp % 10;
			sumOfCube = sumOfCube + n * n * n;
			temp = temp / 10;
		}
		System.out.println("Sum of cube of num is " + sumOfCube);
		if (num == sumOfCube) {
			System.out.println("Number is Armstrong number");
		} else {
			System.out.println("Number is not Armstrong number");
		}
	}

	public static void primeNumberWithinRange() {
		int num;
		Boolean isPrime = true;
		System.out.println("primeNumberWithinRange");
		num = 29;
		System.out.println("Prime number within range 1 -" + num);
		for (int n = 2; n < num; n++) {
			isPrime = true;

			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.println(n);
			}
		}
	}

	public static void primeNumber() {
		int num;
		boolean isPrime = true;
		System.out.println("primeNumber");
		num = 47;
		isPrime = true;

		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println("Prime");
		} else {
			System.out.println("Not a Prime");
		}
	}

	public static void primeNumberUsingWhile() {
		int num;
		boolean isPrime = true;
		System.out.println("primeNumberUsingWhile");
		num = 29;
		isPrime = true;
		int i = 2;
		while (i < num) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
			i++;
		}

		if (isPrime) {
			System.out.println("Prime");
		} else {
			System.out.println("Not a Prime");
		}
	}

	public static void stringRevese(String a) {
		// String a = "Hellow";
		// System.out.println("stringRevese");

		StringBuilder sb = new StringBuilder();

		for (int i = a.length() - 1; i >= 0; i--) {
			sb.append(a.charAt(i));
		}
		// System.out.println("Using String Builder :" + sb.toString());
		System.out.print(sb.toString());
	}

	public static void paraWithReveseOrderOfChar() {
		String str = "Abhishek Naik Pune Khadki";
		// out put :kehsihbA kiaN enuP ikdahK
		String[] arr = str.split(" ");
		for (String s : arr) {
			stringRevese(s + " ");
		}

	}

	public static void firstNonRepetingChar() {
		String str = "hellow world hellow";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] cArray = str.toCharArray();
		for (char c : cArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);

			} else {
				map.put(c, 1);
			}

		}
		System.out.println(map);

		for (Map.Entry me : map.entrySet()) {

			if ((Integer) me.getValue() == 1) {
				System.out.println(me.getKey());
				break;
			}
		}

	}

	public static void readTxtFileInReverseOrder() throws IOException {
		FileReader fs = new FileReader("C:\\MyText.txt");
		BufferedReader br = new BufferedReader(fs);
		String currentline;
		List<String> strlist = new ArrayList<String>();
		while ((currentline = br.readLine()) != null) {
			System.out.println(currentline);
			strlist.add(currentline);
		}
		System.out.println(strlist);
		Collections.reverse(strlist);
		System.out.println(strlist);
	}

	// Java code to illustrate reading a
	// CSV file line by line
	public static void readCSVFileDataLineByLine(String file) {

		try {
//			System.out.println("Reading csv");
//			// Create an object of filereader
//			// class with CSV file as a parameter.
//			FileReader filereader = new FileReader(file);
//
//			// create csvReader object passing
//			// file reader as a parameter
//			CSVReader csvReader = new CSVReader(filereader);
//			String[] nextRecord;
//
//			// we are going to read data line by line
//			while ((nextRecord = csvReader.readNext()) != null) {
//				for (String cell : nextRecord) {
//					System.out.print(cell + "\t");
//				}
//				System.out.println();
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sumOfDigitFromString() {
		String str = "abhishek 3452naik";
		int sum = 0;

		char[] cArray = str.toCharArray();
		for (char c : cArray) {
			if (Character.isDigit(c)) {
				System.out.println(c + " is digit");
				sum = sum + Character.getNumericValue(c);
			} else if (Character.isLetter(c)) {
				System.out.println(c + " is char");
			}
		}
		System.out.println("sum of char " + sum);
	}

	public static void strToNumber() {
		String numStr = "1224";
		int num = Integer.parseInt(numStr);
		System.out.println(num);
		System.out.println(num + 6);

	}

	public static void convertBinaryToDigit() {
		int binaryNum = 1101;
		int power = 0, temp, digit = 0, add;
		temp = binaryNum;
		while (temp != 0) {
			add = temp % 10;
			digit = (int) (digit + add * Math.pow(2, power));
			System.out.println(digit);
			power++;
			temp = temp / 10;
		}
		System.out.println(digit);
	}

	public static void convertDigitToBinary(int num) {
		int binary[] = new int[40];
		int index = 0;
		while (num > 0) {
			binary[index++] = num % 2;
			num = num / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}

	public static void convertDigitToBinaryUsingArrayList(int num) {
		List<Integer> arrlist = new ArrayList<Integer>();

		while (num != 0) {
			arrlist.add(num % 2);
			num = num / 2;
		}
		System.out.println(arrlist);
		Collections.reverse(arrlist);
		System.out.println(arrlist);
		for (int a : arrlist) {
			System.out.print(a);
		}
	}

	public static void convertDigitToBinaryUsingStack(int num) {

		Stack<Integer> st = new Stack<Integer>();
		int index = 0;
		while (num > 0) {
			st.push(num % 2);
			num = num / 2;
		}

		while (!st.isEmpty())
			System.out.print(st.pop());
	}

	public static final String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };

	public static final String[] tens = { "", // 0
			"", // 1
			"Twenty", // 2
			"Thirty", // 3
			"Forty", // 4
			"Fifty", // 5
			"Sixty", // 6
			"Seventy", // 7
			"Eighty", // 8
			"Ninety" // 9
	};

	public static String convert(final int n) {
		if (n < 0) {
			return "Minus " + convert(-n);
		}

		if (n < 20) {
			return units[n];
		}

		if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
		}

		if (n < 1000) {
			return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
		}

		if (n < 100000) {
			return convert(n / 1000) + " Thousand" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);
		}

		if (n < 10000000) {
			return convert(n / 100000) + " Lakh" + ((n % 100000 != 0) ? " " : "") + convert(n % 100000);
		}

		return convert(n / 10000000) + " Crore" + ((n % 10000000 != 0) ? " " : "") + convert(n % 10000000);
	}

}
