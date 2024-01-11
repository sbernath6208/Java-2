package module6Labs;

import java.math.BigInteger;

public class ModuleSixDriver
{
	Module6Labs module6Labs = new Module6Labs(); 
	
	public static void main(String[] args) 
	{
		new ModuleSixDriver(); 
	}
	
	public ModuleSixDriver() 
	{
		System.out.println("Problem 1, reverse a string: " + module6Labs.Problem1("abcde")); 
		
		System.out.println("Problem 2, is it a palindrome? " + module6Labs.Problem2("abcdefdcba")); 
		
		System.out.println("Problem 3 factorial is: " + module6Labs.Problem3(5)); 
		
		int[] numArr = new int[] {1,2,3,4,5,6,7,8,9,10} ; 
		System.out.println("Problem 4: " + module6Labs.Problem4(numArr)); 
		
		System.out.println("Problem 5: "); 
		module6Labs.Problem5(numArr); 
		for (int i = 0; i < numArr.length; i++) 
		{
			System.out.println(numArr[i]); 
		}
		
		int[] arrTwo = new int[] {2,4,6,8,10}; 
		int[] arrOne = new int[] {1,3,5,7,9}; 
		int[] mergedArr = new int[arrOne.length + arrTwo.length]; 
		
		System.out.println("Problem 6: "); 
		module6Labs.Problem6(arrOne, arrTwo, mergedArr); 
		for (int i = 0; i < mergedArr.length; i++) 
		{
			System.out.println(mergedArr[i]); 
		}
		
		arrTwo = new int[5]; 
		arrOne = new int[5]; 
		int[] largeArr = new int[] {1,2,3,4,5,6,7,8,9,10}; 
		System.out.println("Problem 7: "); 
		module6Labs.Problem7(largeArr, arrOne, arrTwo); 
		for (int i = 0; i < arrOne.length; i++) 
		{
			System.out.println(arrOne[i]); 
		}
		System.out.println("\n\n"); 
		for (int i = 0; i < arrTwo.length; i++) 
		{
			System.out.println(arrTwo[i]); 
		}
		
		System.out.println("Problem 8: "); 
		System.out.println(module6Labs.Problem8("All good boys do fine.")); 
		
		BigInteger bigInt = new BigInteger("124432423"); 
		System.out.println("Problem 9: "); 
		System.out.println(module6Labs.Problem9(bigInt)); 
		
//		int[] arrInts = new int[] {13, 16, -9, 24, -19, 16, -25, -15, 18, 4}; 
		int[] arrInts = new int[] {1, 2, 3, 4}; 
		System.out.println("Problem 10: "); 
		System.out.println(module6Labs.Problem10(arrInts, 11)); 
//		module6Labs.Problem10(arrInts, 4); 
		
	}
	
}
