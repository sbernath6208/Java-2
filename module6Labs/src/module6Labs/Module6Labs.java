// Stuart Bernath	uin: 669791508    4/13/23 

package module6Labs;

import java.math.BigInteger;

public class Module6Labs 
{
	/**
	* Do NOT change any of the method headers or the class name in this file.
	*
	* All problems should be solved using recursion.
	*
	* If needed, you can create other methods and you can use global (or class
	* level) variables to keep track of other relevant information.
	*
	*/
		
		
	/**
	* Problem 1
	*
	* Complete the method below that uses only the String class and recursion to
	* reverse a given string. Return the reversed string.
	*/
	// I used this JavaScript site to help guide me in the right direction: 
	// https://learnersbucket.com/examples/algorithms/reverse-a-string-using-recursion/
	
	public String Problem1(String s) 
	{
		if (s.length() == 0) 
		{
			return ""; 
		}
		else 
		{
			return s.substring(s.length()-1, s.length()) + Problem1(s.substring(0, s.length()-1));
		}
		
//		char[] charStr = new char[s.length()]; // original solution 
//		
//		for (int i = 0; i < s.length(); i++) 
//		{
//			charStr[i] = s.charAt(i); 
//		}
//				
//		return Problem1(charStr, 0); 
	}
	
//	public String Problem1(char[] s, int i) // original solution 
//	{
//		if (i >= s.length / 2) 
//		{
//			String reversed = new String(s); 
//			return reversed; 
//		}
//		else 
//		{
//			char tmp = s[i]; 
//			s[i] = s[s.length - 1 - i]; 
//			s[s.length - 1 - i] = tmp; 
//			
//			i++; 
//			
//			return Problem1(s, i); 
//		}
//	}
	
	
	/**
	* Problem 2
	*
	* Complete the method below that uses only the String class and recursion to
	* determine if a String is a palindrome. Return true if the string is a
	* palindrome, and false otherwise.
	*/
	public boolean Problem2(String s) 
	{
		// pretty much by the book 
		if (s.length() <= 1)
		{
			return true; 
		}
		else if (s.charAt(0) != s.charAt(s.length() - 1)) 
		{
			return false; 
		}
		else 
		{
			return Problem2(s.substring(1, s.length() -1 )); 
		}
	}
	
	
	/**
	* Problem 3
	*
	* Complete the method below that returns the result of a factorial using
	only
	* recursion.
	*/
	public int Problem3(int n) 
	{
		// by the book, can't make it much different 
		if (n == 0)
		{
			return 1; 
		}
		else 
		{
			return n * Problem3(n -1); 
		}
		
	}
	
	
	/**
	* Problem 4
	*
	* Write a program that recursively traverses an array of integers and
	* returns the total sum of all integers in the list.
	*/
	int sum = 0; 
	
	public int Problem4(int[] myArray) 
	{
		int length = myArray.length; 
		return Problem4(myArray, length); 
	}
	
	public int Problem4(int[] myArray, int len) 
	{
		if (len == 0)
		{
			return 0; 
		}
		else 
		{
			// when I tried this without help, I had the bottom two operands switched somewhat
			// and it didn't quite work so I looked up help at: 
			// https://www.geeksforgeeks.org/sum-array-elements-using-recursion/
			return Problem4(myArray, len-1) + myArray[len-1]; 
		}
	
	}
	
	
	/**
	* Problem 5
	*
	* Given an array of integers, use recursion to reverse the entire list. You
	* should only use recursion and you should not create a second array. Return
	* the reversed array
	*/
	public int[] Problem5(int[] myArray) 
	{
		int last = myArray[myArray.length-1]; 
		return Problem5(myArray, 0, last); 
	}
	
	public int[] Problem5(int[] myArray, int start, int last) 
	{
		if (start >= myArray.length / 2)
		{
			return myArray; 
		}
		else 
		{
			int tmp = myArray[last -1]; 
			myArray[last -1] = myArray[start]; 
			myArray[start] = tmp; 
			return Problem5(myArray, start+1, last-1); 
		}
	}
	
	/**
	* Problem 6
	*
	* Given two arrays that are full of integers, recursively merge these two
	* arrays into one large array. The large array should have items from the
	first
	* array in even indices (0,2,4 ...) and items from the second array in odd
	* indices (1,3,5 ...). Only use recursion to complete this task.
	*/
	// I used this YouTube video with the C language to help me: 
	// https://www.youtube.com/watch?v=fzW-qP4JdVI&t=1125s  
	int i = 0; 
	int j = 0; 
	int k = 0; 
	
	public void Problem6(int[] arrayOne, int[] arrayTwo, int[] mergedArray) 
	{
		int lenOne = arrayOne.length; 
		int lenTwo = arrayTwo.length; 
		int lenMerged = mergedArray.length;
		Problem6(arrayOne, lenOne, arrayTwo, lenTwo, mergedArray, lenMerged); 		
		
	}
	
	public void Problem6(int[] arrayOne, int lenOne, int[] arrayTwo, int lenTwo, int[] mergedArray, int lenMerged) 
	{
		if (lenOne != 0 || lenTwo != 0 || lenMerged != 0) 
		{
			if (lenMerged % 2 == 1) 
			{
				mergedArray[k] = arrayTwo[j]; 
				j++; 
				k++; 
				Problem6(arrayOne, lenOne, arrayTwo, lenTwo -1, mergedArray, lenMerged -1); 
			}
			else if (lenMerged % 2 == 0)
			{
				mergedArray[k] = arrayOne[i]; 
				i++; 
				k++; 
				Problem6(arrayOne, lenOne -1, arrayTwo, lenTwo, mergedArray, lenMerged -1); 
			}
		}
		
	}
	
	
	/**
	* Problem 7
	*
	* Given one array that is filled with random integers, split this large
	array
	* into two equal sized smaller arrays. Use only recursion to perform this
	task.
	* All items at even indices in the large array should be put in array one,
	and
	* all items at the odd indices in the large array should be put in array
	two.
	*/
	// I used this YouTube video with the C language to help me as above: 
	// https://www.youtube.com/watch?v=fzW-qP4JdVI&t=1125s  
	int m = 0; 
	int n = 0; 
	int p = 0; 
	
	public void Problem7(int[] largeArray, int[] arrayOne, int[] arrayTwo) 
	{
		int lenOne = arrayOne.length; 
		int lenTwo = arrayTwo.length; 
		int lenLarge = largeArray.length;
		Problem7( largeArray, lenLarge, arrayOne, lenOne, arrayTwo, lenTwo); 	
	}
	
	public void Problem7(int[] largeArray, int lenLarge, int[] arrayOne, int lenOne, int[] arrayTwo, int lenTwo) 
	{
		if (lenOne != 0 || lenTwo != 0 || lenLarge != 0) 
		{ 
			if (lenLarge % 2 == 1) 
			{
				arrayTwo[n] = largeArray[p]; 
				n++; 
				p++; 
				Problem7( largeArray, lenLarge -1, arrayOne, lenOne, arrayTwo, lenTwo -1); 
			}
			else if (lenLarge % 2 == 0)
			{
				arrayOne[m] = largeArray[p]; 
				m++; 
				p++; 
				Problem7(largeArray, lenLarge -1, arrayOne, lenOne -1, arrayTwo, lenTwo); 
			}
			
		}
		
	}
	
	
	/**
	* Problem 8
	*
	* Given a long string, use recursion to traverse the string and replace
	every
	* vowel (A,a,E,e,I,i,O,o,U,u) with an @ sign. Use only recursion to solve
	this problem.
	*/
	// I used this JavaScript site to help guide me in the right direction: 
	// https://learnersbucket.com/examples/algorithms/reverse-a-string-using-recursion/
	public String Problem8(String s) 
	{
		if (s.length() == 0) 
		{
			return ""; 
		}
		else if (s.charAt(0) == 'a' || s.charAt(0) == 'A' || 
				s.charAt(0) == 'e' ||s.charAt(0) == 'E' || 
				s.charAt(0) == 'i' || s.charAt(0) == 'I' || 
				s.charAt(0) == 'o' || s.charAt(0) == 'O' || 
				s.charAt(0) == 'u' || s.charAt(0) == 'U' ) 
		{
			return "@" + Problem8(s.substring(1, s.length())); 
		}
		else 
		{
			return s.charAt(0) + Problem8(s.substring(1, s.length())); 
		}
		
//		char[] charStr = new char[s.length()]; // original solution 
//		
//		for (int i = 0; i < s.length(); i++) 
//		{
//			charStr[i] = s.charAt(i); 
//		}
//				
//		return Problem8(charStr, 0); 
		
	}
	
//	public String Problem8(Character[] s, int i) // original attempt 
//	{
//		if (i == s.length-1)
//		{
//			String changed = s.toString(); 
//			return changed; 
//		}
//		else if (s[i].equals('a') || s[i].equals('A') || 
//				s[i].equals('e') || s[i].equals('E') || 
//				s[i].equals('i') || s[i].equals('I') || 
//				s[i].equals('o') || s[i].equals('O') || 
//				s[i].equals('u') || s[i].equals('U') ) 
//		{
//			s[0] = '@'; 
//			return Problem8(s, i+1); 
//		}
//		else if (! (s[i].equals('a') || s[i].equals('A') || 
//				s[i].equals('e') || s[i].equals('E') || 
//				s[i].equals('i') || s[i].equals('I') || 
//				s[i].equals('o') || s[i].equals('O') || 
//				s[i].equals('u') || s[i].equals('U') ) )
//		{
//			return Problem8(s, i+1); 
//		}
//		else 
//		{
//			String changed = s.toString(); 
//			return changed; 
//		}
//		
//		
//	}
	
	
	/**
	* Problem 9
	*
	* For this problem you will accept a single BigInteger value. This number
	can
	* potentially get VERY large, so we don't want to just use Integer. You can
	* find documentation about BigInteger here:
	* https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html (Links
	to
	* an external site)
	*
	* If the number passed into our recursive method is even, pass half of that
	* value back into our method. If the number passed in is odd then multiply
	it
	* by 3, add one, and then pass it back into our method.
	*
	* Our method will only stop executing if the value passed into our method is
	a
	* 1.
	*
	* For full credit, keep track of how many times through this method it takes
	* for the original number passed in to reach 1. This can be maintained in a
	* class level variable that can be incremented within your method.
	*
	* Note: Every number that has EVER been tested using this formula will
	ALWAYS
	* eventually return to one. Mathematicians have brute force tested values
	from
	* 1 to 295,147,905,179,352,825,856.
	*
	* That is nearly 300 Quintillion values.
	*
	* Return the final number of steps.
	*/
	int count = 0; 
	
	public int Problem9(BigInteger value) 
	{
		// Collatz Sequence 
		final BigInteger TWO = BigInteger.valueOf(2); 
		final BigInteger THREE = BigInteger.valueOf(3); 
		final BigInteger ONE = BigInteger.valueOf(1); 
		final BigInteger ZERO = BigInteger.valueOf(0); 

		if (value.equals(ONE))
		{
			return count; 
		}
		else if (value.mod(TWO).equals(ZERO))
		{
			count++; 
			return Problem9(value.divide(TWO)); 
		}
		else 
		{
			count++; 
			return Problem9(value.multiply(THREE).add(ONE)); 
		}

	}
	
	
	/**
	* Problem 10
	*
	* Given a list of integers L and a target integer T, return true or false if
	* there exists a sublist of integers whose sum is equal to T.
	*
	* For this particular problem, both positive and negative numbers are
	allowed.
	* To keep things simple, we will assume 0 is not allowed and that T cannot
	be
	* 0. Let's see some examples of inputs and the expected outputs.
	*
	* Examples
	*
	* Input: L = [1, 2, 3] T = 4
	*
	* Output: True. The sublist [1, 3] sums to 4.
	*
	*
	*
	* Input: L = [5, 1, 6, 7] T = 17
	*
	* Output: False. There are no sublists that have a sum equal to 17.
	*
	*
	*
	* Input: L = [13, 16, -9, 24, -19, 16, -25, -15, 18, 4] T = 10
	*
	* Output: True. A sublist (as there are many) is [13, -19, 16].
	*/
	// I used this site to help me recursively generate a powerset: 
	// https://www.geeksforgeeks.org/recursive-program-to-generate-power-set/
	boolean found = false; 
	
	public boolean Problem10(int[] L, int T) 
	{	
		Integer[] thisOne = new Integer[L.length];
		return Problem10(L, -1, thisOne, T); 
	}
	
	public boolean Problem10(int[] L, int j, Integer[] thisOne, int T) 
	{
		int len = L.length; 
		
		if (j == len && found == false) 
		{
			return found;  
		}
		
//		for (int i = 0; i < thisOne.length; i++) // for debugging, display powerset 
//		{
//			if (thisOne[i] != null)
//				System.out.print(thisOne[i]); 
//		}
//		System.out.print("\n");
		
		int sum = 0; 
		
		for (int i = 0; i < thisOne.length; i++) 
		{
			if (thisOne[i] != null) 
			{
				sum += thisOne[i]; 
			}
		}
		
		if (sum == T)
		{
			found = true; 
			return found; 
		}
		
		for (int i = j + 1; i < len; i++) 
		{
			for (int m = 0; m < thisOne.length; m++) 
			{
				if (thisOne[m] == null) 
				{
					thisOne[m] = L[i]; 
					break; 
				}
			}
			
			
			Problem10(L, i, thisOne, T); 
			
			int count = 0; 
			for (int m = 0; m < thisOne.length; m++)
			{
				if (thisOne[m] != null)
				{
					count++; 
				}
			}
			
			for (int m = 0; m < thisOne.length; m++)
			{
				if (m == count-1)
				{
					thisOne[m] = null;
				}
				
			}
			
		}
		
		return found; 
		
	}

}

