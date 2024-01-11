//Stuart Bernath	uin: 669791508 

package module7Labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; 
 

public class Module7Labs 
{
	/**
	* Problem 1: Make an ArrayList of Integers, and ask the user for input. Your
	* program should be able to take any input without crashing. Add all
	integers
	* you receive to the ArrayList, until the user enters STOP. Then, print the
	* contents of the ArrayList.
	*/
	public ArrayList<Integer> addInts() 
	{
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>(); 
		String input = ""; 
		
		while (!input.equals("STOP"))  
		{
			try 
			{
				System.out.println("Please enter an integer or type STOP to return all entered integers> "); 
				input = keyboard.nextLine(); 
				
				if (input.equals("STOP")) 
				{
					break; 
				}
				else 
				{
					nums.add(Integer.valueOf(input)); 
				}
			}
			catch (Exception Ex)
			{
				System.out.println(Ex); 
			}
				
		}
		
		keyboard.close(); 
		
		for (int num : nums)
		{
			System.out.print(num + "   "); 
		}
		
		System.out.println("\n"); 
		
		return nums; // Return the ArrayList as well as printing it.
	}
	
	/**
	* Problem 2: Make an ArrayList of Strings, and ask the user for input. Add
	each
	* word provided by the user individually to the ArrayList, but ONLY if the
	word
	* contains the letter "p" (ignore case). Ignore any word that does not
	contain
	* a p, but stop taking input when the user enters STOP (don't add the word
	stop
	* to the list). Finish by printing the ArrayList.
	*/
	public ArrayList<String> addStrings() 
	{
		Scanner keyboard = new Scanner(System.in);
		ArrayList<String> pStrs = new ArrayList<String>(); 
		String input = ""; 
		
		while (!input.equals("STOP"))  
		{
			try 
			{
				System.out.println("Please enter a string or type STOP to return all entered strings> "); 
				input = keyboard.nextLine(); 
				
				if (input.equals("STOP")) 
				{
					break; 
				}
				else if (input.contains("p"))
				{
					pStrs.add(input); 
				}
			}
			catch (Exception Ex)
			{
				System.out.println(Ex); 
			}
				
		}
		
		keyboard.close(); 
		
		for (String str : pStrs)
		{
			System.out.print(str + "   "); 
		}
		
		System.out.println("\n"); 
		
		return pStrs;  // Return the ArrayList as well as printing it.
	}
	
	/**
	* Problem 3: You will be given an ArrayList of Integers. Remove all even
	* numbers, and then print the ArrayList.
	*/
	public ArrayList<Integer> removeInts(ArrayList<Integer> arrList) 
	{
		try 
		{
			int i = 0; 
			
			while (i < arrList.size())  
			{
				if (Integer.valueOf(arrList.get(i)) % 2 == 0)
				{
					arrList.remove(i); 
				}
				else 
				{
					i++; 
				}
			}
		}
		catch (Exception ex)
		{
			System.out.println(ex); 
		}
		
		for (int num : arrList)
		{
			System.out.print(num + "   "); 
		}
		System.out.println("\n"); 
		
		return arrList; // Return the ArrayList as well as printing it.
	}
	
	/**
	* Problem 4: You will be given an ArrayList of Integers (Strings). This ArrayList will
	* have at least 2 items. Starting with the second string in the list, remove
	it
	* if the string before it comes first alphabetically. Then print the
	ArrayList.
	*/
	public ArrayList<String> removeStrings(ArrayList<String> arrList) 
	{
		try 
		{
			int i = 1; 
			
			while (i < arrList.size())  
			{
				String thisOne = arrList.get(i); 
				String lastOne = arrList.get(i-1); 
				
				if (thisOne.compareTo(lastOne) > 0) 
				{
					arrList.remove(i); 
				}
				else 
				{
					i++; 
				}
			}	
			
		}
		catch (Exception ex)
		{
			System.out.println(ex); 
		}
		
		for (String str : arrList)
		{
			System.out.print(str + "   "); 
		}
		System.out.println("\n"); 
		
		return arrList; // Return the ArrayList as well as printing it.
	}
	
	/**
	* Problem 5: Using the ArrayList from problem 1, print the contents of the
	* ArrayList in ascending order, UNLESS the list contains the number 3. If it
	* contains the number 3, print the list in descending order.
	*/
	public ArrayList<Integer> sortIntegers(ArrayList<Integer> arrList) 
	{
		if (!arrList.contains(3)) 
		{
            Collections.sort(arrList); 
			
			for (int num : arrList) 
			{
				System.out.println(num + "   "); 
			}
		}
		else if (arrList.contains(3)) 
		{
			Collections.sort(arrList); 
//			Collections.reverse(arrList); 
			
			for (int i = arrList.size()-1; i >= 0; i--) 
			{
				System.out.println(Integer.valueOf(arrList.get(i)) + "   "); 
			}
		}
		
		return arrList; // Return the ArrayList as well as printing it.
	}
	
	/**
	* Problem 6: Given an ArrayList of Strings, sort the list based on the
	number
	* of characters in each string. The shortest words should be first. Then
	print
	* the sorted list.
	*/
	public ArrayList<String> sortStrings(ArrayList<String> arrList) 
	{
		// I used this site for the sort pseudocode: 
		// https://www.enjoyalgorithms.com/blog/introduction-to-sorting-bubble-sort-selection-sort-and-insertion-sort  
		// author: Shubham Gautam 

		for (int i = 0; i < arrList.size()-1; i++) 
		{
			int min = i; 
			
			for (int j = i; j < arrList.size(); j++) 
			{
				if (arrList.get(j).length() < arrList.get(min).length())
				{
					min = j; 
				}
			}
		
			Collections.swap(arrList, min, i); 
		}
		
		for (String str : arrList)
		{
			System.out.println(str + "   ");
		}
		
		return arrList; // Return the ArrayList as well as printing it.
	}
	
	/**
	* Problem 7: Given an ArrayList of Integers, count the number of numbers
	that
	* contain 7 in the list. A number can have multiple 7s, but it still only
	* counts as 1 number. i.e. The list [3, 57, 7, 777, 79] has 4 numbers with
	the
	* number 7. Return your final count.
	*/
	public int countNumbersWith7(ArrayList<Integer> arrList) 
	{
		int count = 0; 
		
		for (Integer num : arrList) 
		{
			String thisNum = num.toString(); 
			if (thisNum.contains("7")) 
			{
				count++; 
			}
		}
		
		return count; // You do not need to print anything here.
	}
	
	/**
	* Problem 8: You are given two ArrayLists of Strings. The first ArrayList is
	* what you will be looking through. Create an ArrayList of Integers. For
	each
	* string in the second list, determine if it is also in the first list. If
	it
	* is, add it's index to the list you created. If it is not in the first
	list,
	* add -1 to your index list. Print the index list when you are done.
	*/
	public ArrayList<Integer> findTheString(ArrayList<String> arrList,
	ArrayList<String> stringsToFind) 
	{
		ArrayList<Integer> indices = new ArrayList<Integer>(); 
		Boolean found = false; 
		
		for (String str : arrList) 
		{
			found = false; 
			
			for (String find : stringsToFind) 
			{
				if (str.equals(find)) 
				{
					indices.add(arrList.indexOf(str)); 
					found = true; 
				}
			}
			if (!found)
			{
				indices.add(-1); 
			}
		}
		
		return indices; // Return the ArrayList as well as printing it.
	}
	
	/**
	* Problem 9: You will be given an ArrayList of Strings. These strings will
	be
	* sentences with at least 2 words. Replace the spaces in these sentences
	with
	* numbers that count the spaces. i.e. The sentence "Hi how are you doing"
	would
	* be come "Hi1how2are3you4doing". Then print the list.
	*/
	public ArrayList<String> replaceSpaces(ArrayList<String> arrList) 
	{
		for (String str : arrList) 
		{
			char[] strChars = new char[str.length()]; 
			int count = 1; 
			
			for (int i = 0; i < str.length(); i++) 
			{
				
				Character thisOne = (char)str.charAt(i); 
				
				if (Character.isWhitespace(thisOne)) // thisOne.equals(' ')
				{
					char thisCount = (char)(count+'0'); 
					strChars[i] = thisCount;
					count++; 
				}
				else 
				{
					strChars[i] = (char)str.charAt(i); 
				}				
			}
			
			StringBuilder thisOne = new StringBuilder(); 
			
			for (int i = 0; i < strChars.length; i++) 
			{
				thisOne.append(strChars[i]);
			}
			
			arrList.set(arrList.indexOf(str), thisOne.toString());
			 
		}
		

		
		return arrList; // Return the ArrayList as well as printing it.
	}
	
	/**
	* Problem 10: Using the ArrayList from problem 2, sort the list based on the
	* position of the first occurrence of the letter p in the word. i.e. If the
	* list was [top, pop, apple], it would be sorted as [pop, apple, top]. Print
	* the sorted list.
	*/
	public ArrayList<String> sortP(ArrayList<String> arrList) 
	{
		ArrayList<String> sortedByP = new ArrayList<String>(); 
		int longestWord = 0; 
		
		for (String str : arrList) 
		{
			if (str.length() > longestWord)
			{
				longestWord = str.length(); 
			}
		}
		
		
		for (int i = 0; i < longestWord; i++) 
		{
			for (String str : arrList)
			{
				if (i < str.length())
				{
					Character thisOne = str.charAt(i); 
					
					if (thisOne.equals('p')) 
					{
						sortedByP.add(str); 
						break; 
					}
				}
			}
		}
		
		for (String str : sortedByP) 
		{
			System.out.println(str + "");
		}
		
		
		return sortedByP; // Return the ArrayList as well as printing it.
	}
	
}


