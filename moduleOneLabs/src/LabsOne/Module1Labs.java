package LabsOne; 

import java.lang.Math; 
import java.util.Random; 
import java.util.Scanner; 

public class Module1Labs {
	/**
	 * Problem 1
	 * 
	 * Write a program that creates an array of length n, and fills it with
	 * numbers (0-99) according to the index of each array. Once this is done,
	 * return the array
	 */

	public int[] Problem1(int n) {
		int[] numArr = new int[n]; 
		for (int i = 0; i < numArr.length; i++)
		{
			numArr[i] = i; 
		}
		
		return numArr;
	}

	/**
	 * Problem 2
	 * 
	 * Write a program that creates an array of length 100, and fills it with odd
	 * numbers starting at one and increasing until the array is full. Once this is
	 * done, return the array
	 */

	public int[] Problem2() {
		int[] numArr = new int[100]; 
	    int j = 1; 
		
	    for (int i = 0; i < numArr.length; i++)
		{
			numArr[i] = j;
            j += 2; 
		}
	    
		return numArr;
	}

	/**
	 * Problem 3
	 * 
	 * Write a program that creates an array of length 100, and fills it with only
	 * numbers that are multiples of 3 or 5 (3,5,6,9,10,12,15 ...). Once this is
	 * done, return the array
	 */

	public int[] Problem3() {
		int[] numArr = new int[100]; 
	    int i = 0; 
	    
		for (int j = 1; i < numArr.length; j++)
		{
	        if ((j % 3 == 0) || (j % 5 == 0))
	        {
	  		   numArr[i] = j;
	           i++; 
	        }      
		}
		
		return numArr;
	}

	/**
	 * Problem 4
	 * 
	 * Write a program that creates an array of length 25, and fills it with
	 * Fibonacci sequence until the array is full. Once this is done, return the
	 * array.
	 * 
	 * The Fibonacci sequence is the series of numbers where each number is the sum
	 * of the two preceding numbers.
	 * 
	 * Hint: The sequence starts at 0 and the last value is 46368
	 */

	public int[] Problem4() {
	    int[] numArr = new int[25];
	    int tmp; 
	    int first = 0;
	    int second = 1; 
	    int currentSolution = 0; 
	    numArr[0] = first; 
	    numArr[1] = second; 
	    
	    for (int i = 2; i < numArr.length; i++)
	    {
	      currentSolution = first + second; 
	      numArr[i] = currentSolution; 
	      tmp = second; 
	      second = currentSolution;
	      first = tmp; 
	    }
	    
		return numArr;
	}

	/**
	 * Problem 5
	 * 
	 * Write a method that accepts an array of ints that has been filled with a
	 * random number between 1-10 at each index. Your method should count the number
	 * of times that the number 7 appears in the array. Return this value.
	 */
	public int Problem5(int[] myArray) {
		
	    int count = 0; 

	    for (int i =0; i < myArray.length; i++)
	    {
	      if(myArray[i] == 7)
	      {
	        count++; 
	      }
	    }
	    
		return count;
	}

	/**
	 * Problem 6
	 * 
	 * You are given 2 different arrays of the same size that are filled with
	 * numbers.
	 * 
	 * Write a method that joins these two arrays together. Every item from the
	 * first array should be the first half of your new array, and every item of the
	 * second array should be the second half of your new array. Once this is done,
	 * return the array.
	 */

	public int[] Problem6(int[] firstArray, int[] secondArray) {
	  
	    int[] numArr = firstArray; 
	    int[] numArrTwo = secondArray; 
	    int largeLen = numArr.length + numArrTwo.length; 
	    int[] largeArr = new int[largeLen]; 
	    int j = 0; 

        for (int i = 0; i < largeArr.length; i++)
        {
          if (i < numArr.length)
          {
            largeArr[i] = numArr[i]; 
          }
        
          if (i >= numArr.length)
          {
            largeArr[i] = numArrTwo[j]; 
            j++; 
          }
        
        }
      
	    return largeArr;
	}

	/**
	 * Problem 7
	 * 
	 * You are given 2 different arrays of the same size that are filled with
	 * numbers.
	 * 
	 * Write a method that merges these two arrays together. Every item from the
	 * first array should be in the even indices of your new array and every item
	 * from the second array should be in the odd indices. The order of each array
	 * should be preserved. Once this is done, return the array.
	 */

	public int[] Problem7(int[] firstArray, int[] secondArray) {

	    int[] numArr = firstArray; 
	    int[] numArrTwo = secondArray; 
	    int largeLen = numArr.length + numArrTwo.length; 
	    int[] largeArr = new int[largeLen]; 

	    int l = 0; 
	    int m = 0; 


      for (int i = 0; i < largeArr.length; i++)
      {
        if (i % 2 == 0)
        {
          largeArr[i] = numArr[l]; 
          l++; 
        }
        
        else  
        {
          largeArr[i] = numArrTwo[m]; 
          m++; 
          
        }
        
      }
      
      return largeArr;
	}

	/**
	 * Problem 8
	 * 
	 * You are given 2 different arrays of the different sizes that are filled with
	 * numbers.
	 * 
	 * Write a method that zips these two arrays together. Each index should
	 * alternate like the merge from problem 7, but once one array has been emptied
	 * all other elements from the non-empty array should be added consecutively.
	 * Once this is done, return the array
	 * 
	 * Example input: firstArray = {1,3,5}, secondArray = {2,4,6,8,10}
	 * 
	 * Example Output: {1,2,3,4,5,6,8,10}
	 */
	public int[] Problem8(int[] firstArray, int[] secondArray) {

	    int[] numArr = firstArray; 
	    int[] numArrTwo = secondArray; 
	    int largeLen = numArr.length + numArrTwo.length; 
	    int[] largeArr = new int[largeLen]; 

	    int l = 0; 
	    int m = 0; 
	    

	    // I believe this only works if the first array
	    // is the shortest array 
	    for (int i = 0; i < largeArr.length; i++)
	    {
	      if (i < (numArr.length * 2)) 
	      {
	          if (i % 2 == 0)
	          {
	            largeArr[i] = numArr[l];
	            l++; 
	          }
	          else 
	          {
	            largeArr[i] = numArrTwo[m];
	            m++; 
	          }
	      }
	      else
	      {
	        largeArr[i] = numArrTwo[m];
	        m++; 
	      }
	      
	        
	    }
	    
		return largeArr;
	}

	/**
	 * Problem 9
	 * 
	 * You are given an array that is randomly filled with either 1's or 2's. Your
	 * job is to move all of the 1's to the start of the array, and all of the 2's
	 * to the end of the array. Once this is done, return the array.
	 * 
	 * Example input: array = {1,2,2,2,1,1,1,2,1,2}
	 * 
	 * Example Output: {1,1,1,1,1,2,2,2,2,2}
	 */

	public int[] Problem9(int[] myArray) {
		Random num = new Random(java.lang.System.currentTimeMillis()); 
		  
	    int[] numArr = myArray; 
	    int[] numArrCopy = new int[30]; 
	    int j = 0; 
	    
	    


	    for (int i = 0; i < numArr.length; i++)
	    {
	      if (numArr[i] == 1)
	      {
	        numArrCopy[j] = numArr[i]; 
	        j++;
	      }
	    }

	    for (int i = 0; i < numArr.length; i++)
	    {
	      if (numArr[i] == 2)
	      {
	        numArrCopy[j] = numArr[i]; 
	        j++; 
	      }
	    }
	    
		return numArrCopy;
	}

	/**
	 * Problem 10
	 * 
	 * You are given an array that is partially filled with Strings. These strings
	 * will be random and are inconsequential to the problem. Some of the spots in
	 * the array will be empty (null). Your job is to traverse the array and save
	 * each non-null value to a string. You will then return that string from the
	 * method. If the spot in the array contains a null value, skip it completely.
	 * 
	 * Example Input: {"Baseball","Football",null, null, "Soccer",null, "Paintball",
	 * null}
	 * 
	 * Example Output: Baseball Football Soccer Paintball
	 */

	public String Problem10(String[] myArray) {
	    String[] stringArr = myArray; 
	    String stringConcated = "";
	    
	    for (int i = 0; i < stringArr.length; i++) 
	    {
	        if (stringArr[i] != null)
	        {
	          stringConcated += stringArr[i] + "\t "; 
	        }
	         
	    }
	    
		return stringConcated;
	}

	/**
	 * Problem 11
	 * 
	 * You are given an array that is partially filled with Strings. These strings
	 * will be random and are inconsequential to the problem. Some of the spots in
	 * the array will be empty (null). Your job is to traverse the array and move
	 * all null items to the end of the array. Once this is done, return the array.
	 * 
	 * Example Input: {"Baseball","Football",null, null, "Soccer",null, "Paintball",
	 * null}
	 * 
	 * Example Output: {"Baseball", "Football", "Soccer", "Paintball", null, null,
	 * null, null}
	 */
	public String[] Problem11(String[] myArray) {

	    String[] stringArr = myArray;  
	    String[] stringArrCopy = new String[stringArr.length]; 
	    int j = 0; 
	    int k = stringArr.length - 1; 
	    
	    
        for (int i = 0; i < stringArr.length; i++)
	    {
	      if (stringArr[i] != null)
	      {
	        stringArrCopy[j] = stringArr[i]; 
	        j++;
	      }
	      else
	      {
	    	 stringArrCopy[k] = stringArr[i]; 
	    	 k--; 
	      }
	    }


		return stringArrCopy;
	}

	/**
	 * Problem 12
	 * 
	 * You are given an array of integers that is of length n. Your job is to rotate
	 * the numbers in the array one index to the right. Once this is done, return the array.
	 * 
	 * Example Input: {1,2,3,4,5}
	 * 
	 * Example Output: {5,1,2,3,4}
	 */
	public int[] Problem12(int[] myArray) {

		int[] numArr = myArray; 
	    int[] numArrCopy = new int[10];  
	    int finalInt = 0; 
	    
	   
	    for (int i = 0; i < numArr.length ; i++) 
	    {
	      if (i == numArr.length - 1)
	      {
	        finalInt = numArr[numArr.length-1]; 
	      }
	      else 
	      {
	        numArrCopy[i+1] = numArr[i]; 
	      }
	    }

	    numArrCopy[0] = finalInt; 
		
		
		return numArrCopy;
	}

	/**
	 * Problem 13
	 * 
	 * You are given an array of integers that is of length n, and a positive
	 * integer x where x < n. Your job is to rotate the numbers in the array x
	 * indices to the right. Once this is done, return the array.
	 * 
	 * Example Input: {1, 2, 3, 4, 5}, 3
	 * 
	 * Example Output: {3, 4, 5,1, 2}
	 */
	public int[] Problem13(int[] myArray, int rotation) {

	    
	    int[] numArr = myArray;
	    int[] numArrCopy = new int[myArray.length]; 
	    int[] tmp = new int[myArray.length]; 
	    int rotateInput = rotation; 
	    int rotateNum = rotateInput; 
	    int j = 0; 

	    
	    for (int i = (numArr.length - rotateInput); i < numArr.length; i++)
	    {
	      
	      tmp[j] = numArr[i]; 
	      j++; 
	    }

	    for (int i = 0; i < numArr.length; i++) 
	    {
	      if (rotateNum < numArr.length)
	      {
	        numArrCopy[rotateNum] = numArr[i]; 
	        rotateNum++;
	      }
	    }

	    for (int i = 0; i < rotateInput; i++)
	    {
	      numArrCopy[i] = tmp[i]; 
	    }


		return numArrCopy;
	}

	/**
	 * Problem 14
	 * 
	 * You are given an array of integers that is of length n, and a positive
	 * integer x. Your job is to rotate the numbers in the array x indices to the
	 * right. Once this is done, return the array.
	 * 
	 * Example Input: {1, 2, 3, 4, 5}, 7
	 * 
	 * Example Output: {4, 5,1, 2, 3}
	 */
// i got this one wrong because I didn't update the arrays for the method signature but i fixed it here 
	public int[] Problem14(int[] myArray, int rotation) {

	    
	    int[] numArr = myArray;
	    int[] numArrCopy = new int[myArray.length]; 
	    int[] tmp = new int[myArray.length]; 
	    int rotateInput = rotation; 
	    int rotateNum = rotateInput; 
	    int j = 0; 

	    while (rotateInput > (numArr.length))
	    {
	      rotateInput -= numArr.length; 
	    }
	    
	    rotateNum = rotateInput; 

	    
	    for (int i = (numArr.length - rotateInput); i < numArr.length; i++)
	    {
	      
	      tmp[j] = numArr[i]; 
	      j++; 
	    }
	    

	    for (int i = 0; i < numArr.length; i++) 
	    {
	      if (rotateNum < numArr.length)
	      {
	        numArrCopy[rotateNum] = numArr[i]; 
	        rotateNum++;
	      }
	    }

	    for (int i = 0; i < rotateInput; i++)
	    {
	      numArrCopy[i] = tmp[i]; 
	    }

		return numArrCopy;
	}

	/**
	 * Problem 15
	 * 
	 * You are given an array of integers that is of length n, and an integer x.
	 * Your job is to rotate the numbers in the array x indices to the right if x is
	 * positive and x indices to the left if x is negative. Once this is done, return the array.
	 * 
	 * Example Input: {1, 2, 3, 4, 5}, 7
	 * 
	 * Example Output: {4, 5,1, 2, 3}
	 * 
	 * 
	 * 
	 * Example Input: {1, 2, 3, 4, 5}, -2
	 * 
	 * Example Output: {3, 4, 5,1, 2}
	 */
	public int[] Problem15(int[] myArray, int rotation) {
		
	    
	    int[] numArr = myArray; 
	    int[] numArrCopy = new int[myArray.length]; 
	    int[] tmp = new int[myArray.length]; 
	    int rotateInput = rotation; 
	    int rotateNum = rotateInput; 
	    int j = 0; 


	    if (rotateInput > 0)
	    {
	      while (rotateInput > (numArr.length))
	      {
	        rotateInput -= numArr.length; 
	      }
	    }

	    while (rotateInput < 0)
	    {
	      rotateInput += numArr.length; 
	    }
	    
	    rotateNum = rotateInput; 

	    if (rotateInput > 0)
	    {
	      for (int i = (numArr.length - rotateInput); i < numArr.length; i++)
	      {
	        
	        tmp[j] = numArr[i]; 
	        j++; 
	      }
	      

	  
	      for (int i = 0; i < numArr.length; i++) 
	      {
	        if (rotateNum < numArr.length)
	        {
	          numArrCopy[rotateNum] = numArr[i]; 
	          rotateNum++;
	        }
	      }
	  
	      for (int i = 0; i < rotateInput; i++)
	      {
	        numArrCopy[i] = tmp[i]; 
	      }
	    }

	    
//	    if (rotateInput < 0) 
//	    {
//	      rotateNum = -rotateNum; 
//	      rotateInput = -rotateInput; 
//	      j = 0; 
//	      
//	      for (int i = 0; i < rotateInput; i++)
//	      {
//	        
//	        tmp[j] = numArr[i]; 
//	        j++; 
//	      }
//	      
////	      System.out.println("\n\nTemp arr:");
//	      for (int i = 0; i < tmp.length; i++)
//	      {
//	        System.out.println(tmp[i]);
//	      }
//	  
//	      for (int i = 0; i < (numArr.length - rotateNum); i++) 
//	      {
//	        if (rotateNum < numArr.length)
//	        {
//	          numArrCopy[i] = numArr[rotateNum]; 
//	          rotateNum++;
//	        }
//	      }
//
//	      j = 0; 
//	      for (int i = numArr.length - rotateInput; i < rotateInput - 1; i++)
//	      {
//	        numArrCopy[i] = tmp[j]; 
//	        j++; 
//	      }
//	    }

		return numArrCopy;
	}

	/**
	 * Problem 16
	 * 
	 * Write a method that accepts a large string. This method will return true if
	 * the string starts with the word "Java". This word can be any variation with
	 * uppercase or lowercase letters.
	 * 
	 * java Java jAva jaVa javA JAva JaVa JavA jAVa jAvA jaVA JAVa JaVA jAVA JAVA
	 * are all of the possibilites.
	 */

	public boolean Problem16(String phrase) {
	   Boolean beginsJava = false; 
	   String newStr = phrase; 

	   if ((newStr.charAt(0) == 'j' || newStr.charAt(0) == 'J') && (newStr.charAt(1) == 'a' || newStr.charAt(1) == 'A') && (newStr.charAt(2) == 'v' || newStr.charAt(2) == 'V')  && (newStr.charAt(3) == 'a' || newStr.charAt(3) == 'A'))
	   {
	     beginsJava = true; 
	   }
		return beginsJava;
	}

	/**
	 * Problem 17
	 * 
	 * Write a method that accepts a large string. This method will return true if
	 * the string contains the word "Java". This word can be any variation with
	 * uppercase or lowercase letters.
	 * 
	 * java Java jAva jaVa javA JAva JaVa JavA jAVa jAvA jaVA JAVa JaVA jAVA JAVA
	 * are all of the possibilities.
	 */

	public boolean Problem17(String phrase) {

		   Boolean containsJava = false; 
		   String newStr = phrase; 
		   newStr = newStr.toLowerCase(); 
		   if (newStr.contains("java")) 
		   {
		     containsJava = true; 
		   }

		return containsJava;
	}

	/**
	 * Problem 18
	 * 
	 * Write a method that accepts a large string. This method will return true if
	 * the string starts with or ends with the word "Java". This word can be any
	 * variation with uppercase or lowercase letters.
	 * 
	 * java Java jAva jaVa javA JAva JaVa JavA jAVa jAvA jaVA JAVa JaVA jAVA JAVA
	 * are all of the possibilities.
	 */
//	i got this one wrong, hmm, don't know why 

	public boolean Problem18(String phrase) {

		   Boolean beginsEndsJava = false; 
		   String newStr = phrase; 

		   newStr = newStr.toLowerCase(); 
		   
		    if (newStr.charAt(0) == 'j' && newStr.charAt(1) == 'a' && newStr.charAt(2) == 'v'  && (newStr.charAt(3) == 'a') || (newStr.charAt(newStr.length() - 4) == 'j' && newStr.charAt(newStr.length() - 3) == 'a' && newStr.charAt(newStr.length() - 2) == 'v'  && newStr.charAt(newStr.length() - 1) == 'a'))
		   {
		     beginsEndsJava = true; 
		   }
			return beginsEndsJava; 
		
	}

	/**
	 * Problem 19
	 * 
	 * Write a program that returns true if two given strings are nearly identical.
	 * Nearly identical means that either all of their characters match, or all but
	 * one match. The strings can be upper or lower case and still be considered
	 * nearly identical. Both strings will also need to be the same length to be
	 * considered nearly identical.
	 */

	public boolean Problem19(String phrase1, String phrase2) {
	    
		   Boolean nearlyIdentical = false; 
		   String newStr = phrase1;
		   String oneOff = phrase2; 
		   int wrongChar = 0; 

		   newStr = newStr.toLowerCase(); 
//		   capStr = capStr.toLowerCase(); 
		   oneOff = oneOff.toLowerCase(); 

		   if (newStr.length() == oneOff.length())
		   {
		     for (int i = 0; i < newStr.length(); i++)
		     {
		       if (newStr.charAt(i) == oneOff.charAt(i))
		       {
		         continue; 
		       }
		       else
		       {
		         wrongChar++; 
		       }
		     }
		   }

		    if (wrongChar <= 1) 
		    {
		      nearlyIdentical = true; 
		    }
		return nearlyIdentical;
	}

	/**
	 * Problem20
	 * 
	 * Write a program that accepts two different strings and returns the number of
	 * characters that are different. Either string can be null, or of any length.
	 * 
	 * If one string is null and the other is not, all of the characters are
	 * different.
	 */
//i got this one wrong, just fixed it. 
	public int Problem20(String phrase1, String phrase2) {

		   String newStr = phrase1;
		   String oneOff = phrase2; 
		   int wrongChar = 0; 
		   int extraChar = 0; 
		   int shortest = 0; 

		    if (newStr != null)
		    {
		      newStr = newStr.toLowerCase();
		    }

		   
		    if (oneOff != null)
		    {
		      oneOff = oneOff.toLowerCase(); 
		    }
		   
		    if (newStr.length() < oneOff.length()) 
		    {
		    	shortest = newStr.length(); 
		    	extraChar = oneOff.length() - newStr.length(); 
		    }
		    else 
		    {
		    	shortest = oneOff.length(); 
		    	extraChar = newStr.length() - oneOff.length(); 

		    }

		    
		    if (newStr == null && oneOff == null)
		    {
		      wrongChar = 0; 
		    }
		   else if (newStr == null)
		   {
		     wrongChar = oneOff.length(); 
		   }
		    else if (oneOff == null)
		    {
		      wrongChar = newStr.length();
		    }
		    else if (newStr != null && oneOff != null)
		    {
		       for (int i = 0; i < shortest; i++)
		       {
		         if (newStr.charAt(i) == oneOff.charAt(i))
		         {
		           continue; 
		         }
		         else
		         {
		           wrongChar++; 
		         }
		       }
		    }
		 
		    wrongChar += extraChar; 
		   
		return wrongChar;
	}

	/**
	 * Problem 21
	 * 
	 * Create a program that decodes messages. The messages will be encoded using a
	 * Caesar cypher, with each letter being decoded by replacing it with the
	 * previous letter in the alphabet. (Supposedly, this was invented by Julius
	 * Caesar.)
	 * 
	 * The message: J MPWF KBWB would be decoded as I LOVE JAVA.
	 */
	public String Problem21(String phrase) {

	    String caesarCypher = phrase; 
	    String caesarDecoded = ""; 

	    for (int i = 0; i < caesarCypher.length(); i++)
	    {
	      if ((char)(caesarCypher.charAt(i) - 1) == 31)
	      {
	        caesarDecoded += " "; 
	      }
	      else
	      {
	        caesarDecoded += (char)(caesarCypher.charAt(i) - 1); 
	      }  
	    }

		return caesarDecoded;
	}

	/**
	 * Problem 22
	 * 
	 * Create a program that encodes messages. The messages will be encoded using a
	 * Caesar cypher, with each letter being encoded by replacing it with the next
	 * letter in the alphabet. (Supposedly, this was invented by Julius Caesar.)
	 * 
	 * The message: I LOVE JAVA would be decoded as J MPWF KBWB .
	 */
	public String Problem22(String phrase) {

	    String caesarCypher = phrase; 
	    String caesarEncoded = ""; 

	    for (int i = 0; i < caesarCypher.length(); i++)
	    {
	      if ((char)(caesarCypher.charAt(i) + 1) == 33)
	      {
	        caesarEncoded += " "; 
	      }
	      else
	      {
	        caesarEncoded += (char)(caesarCypher.charAt(i) + 1); 
	      }  
	    }

		return caesarEncoded;
	}

	/**
	 * Problem 23
	 * 
	 * Create a program that encodes messages. The messages will be encoded by using
	 * a shift that will be given to you. This shift number can be positive,
	 * negative, or zero and has no size limit.
	 */
	public String Problem23(String phrase, int shift) {
		String caesarCypher = phrase; 
	    String caesarEncoded = ""; 

	    int caesarShift = shift; 
	    
	    while (caesarShift >= 26)
	    {
	      caesarShift -= 26; 
	    }

	    for (int i = 0; i < caesarCypher.length(); i++)
	    {
	      if ((char)(caesarCypher.charAt(i)) == 32)
	      {
	        caesarEncoded += " "; 
	      }
	      else
	      {
	        caesarEncoded += (char)(caesarCypher.charAt(i) + caesarShift); 
	      }  
	    }
		return caesarEncoded;
	}

	/**
	 * Problem 24
	 * 
	 * Write a method that will take in a double value and round it down to the
	 * nearest whole number and return it as an integer.
	 */
	public int Problem24(double number) {
		int flooredDbl = 0; 
	    double newDbl = number; 
	    flooredDbl = (int)Math.floor(newDbl); 

//	    System.out.println(flooredDbl); 
		    
		return flooredDbl;
	}

	/**
	 * Problem 25
	 * 
	 * Write a method that will take in a double value and round it up to the nearest
	 * whole number and return it as an integer.
	 */
	public int Problem25(double number) {
		
	    int ceilingDbl = 0; 
	   double newDbl = number; 
	   ceilingDbl = (int)Math.ceil(newDbl); 
	   

		return ceilingDbl;
	}

	/**
	 * Problem 26
	 * 
	 * Write a method that will take in a double value and round it to the nearest
	 * whole number. Return this number as an integer.
	 */
	public int Problem26(double number) {

	    int roundedDbl = 0; 
	    double newDbl = number; 
	    newDbl = Math.round(newDbl); 
	    roundedDbl = (int)newDbl; 
	   
		return roundedDbl;
	}

	/**
	 * Problem 27
	 * 
	 * Write a method that returns true if a given number is a multiple of 3 or 5
	 * 
	 */

	public boolean Problem27(int number) {
		int divisibleInt = number; 
	    Boolean isDivisible = false; 

	    if (divisibleInt % 3 == 0 || divisibleInt % 5 == 0)
	    {
	      isDivisible = true; 
	    }
	   
		return isDivisible;
	}

	/**
	 * Problem 28
	 * 
	 * Write a method that returns true if a given number is a multiple of 3 or 5,
	 * but not both.
	 */
	public boolean Problem28(int number) {
		int divisibleInt = number;
	    Boolean isDivisible = false; 

	    if (divisibleInt % 3 == 0 && divisibleInt % 5 != 0)
	    {
	      isDivisible = true; 
	    }
	    else if (divisibleInt % 3 != 0 && divisibleInt % 5 == 0)
	    {
	      isDivisible = true; 
	    }
		return isDivisible;
	}

	/**
	 * Problem 29
	 * 
	 * Write a method that accepts 4 integers and returns true if these 4 integers
	 * are evenly spaced out (that is, they all have the same number of integers
	 * between them)
	 */

	public boolean Problem29(int a, int b, int c, int d) {

	    int one = a; 
	    int two = b;
	    int three = c; 
	    int four = d; 
	    Boolean equalSpace = false; 
	    int firstSpace = 0;
	    int secondSpace = 0; 
	    int thirdSpace = 0; 
	    // int fourthSpace = 0; 

	    firstSpace = two - one; 
	    secondSpace = three - two; 
	    thirdSpace = four - three; 

	    if (firstSpace == secondSpace && secondSpace == thirdSpace)
	    {
	      equalSpace = true; 
	    }
	    
		return equalSpace;
	}

	/**
	 * Problem 30
	 * 
	 * Given an array of integers determine if a "mirror" exists within the array. A
	 * mirror is an exact duplication of the order of numbers, but reversed. For
	 * example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3
	 * (the {1, 2, 3} part). Your method should return the size of the largest
	 * mirror section found in the given array.
	 */
	public int Problem30(int[] myArray) {
		
		
		 // int[] numArr = new int[]{8, 0, 1, 2, 3, 4, 5, 8, 7, 5, 4, 3, 2, 1, 0, 6}; 
	    
	      // int[] numArr = new int[]{0, 9, 5, 1, 2, 3, 5, 6, 2, 3, 9, 1, 0, 3, 2, 1, 9} ; 
	      
	      // int[] numArr = new int[]{9, 1, 2, 3, 5, 7, 3, 2, 1, 0}; 
	      
	      // int[] numArr = new int[]{8, 7, 1, 2, 3, 5, 2, 9, 3, 2, 1, 4, 2, 2, 1};  
	    
	      // int[] numArr = new int[]{1, 2, 3, 4, 5, 7, 8, 5, 4, 3, 2, 1, 1, 2, 3, 4, 5, 6, 1, 3, 2, 4, 8, 7, 6, 5, 4, 3, 2, 1}; //10
	     int[] numArr = myArray; 

	    
	      int largestMirror = 0; 
	      

	      for (int i = 0; i < numArr.length; i++)
	      {
	        for (int j = numArr.length - 1; j > 0; j--)
	        {
	          for (int k = 0; k < numArr.length; k++)
	          {
	            if ((j - k >= 0) && (i + k < numArr.length)) 
	            {
	              if (numArr[i + k] == numArr[j - k])
	              {
	                if ((k + 1) > largestMirror)
	                {
	                  largestMirror = (k + 1); 
	                  continue; 
	                }
	                
	              }
	              else
	              {
	                break; 
	              }
	            }
	          
	          }
	        }
	      
	      }


		return largestMirror;
	}
}
