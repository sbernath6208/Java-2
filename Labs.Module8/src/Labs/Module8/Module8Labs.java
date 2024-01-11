//Stuart Bernath	uin: 669791508 

package Labs.Module8;

import java.util.Collections;
import java.util.Scanner;

public class Module8Labs {
	/**
	 * For the entirety of these labs you are not allowed to use any data structure
	 * other than a custom built linked list. This should consist ONLY of a node
	 * class. You should not be creating a secondary class to handle the data
	 * structure.
	 * 
	 * Failure to comply will result in a 0.
	 */

	/**
	 * Problem 1: Make a Linked List of Integers, and ask the user for input. Your
	 * program should be able to take any input without crashing. Add all integers
	 * you receive to the Linked List, until the user enters STOP. Then, print the
	 * contents of the Linked List.
	 */
	public Node<Integer> addInts() 
	{
		int size = 0; 
		
		Node<Integer> firstNode = new Node(null, null); 
		Node<Integer> thisNode = new Node(null, null); 
		Node<Integer> lastNode = new Node(null, null); 
		
		try 
		{
			Scanner keyboard = new Scanner(System.in); 
			String input = ""; 
			
			while (!input.toLowerCase().equals("stop"))
			{
				System.out.println("Please enter a number to add to the linked list or enter 'stop' to end> "); 
				input = keyboard.nextLine(); 
				
				if (input.toLowerCase().equals("stop")) 
				{
					break; 
				}
				else 
				{
					
					// test if input is digit taken from 
					// https://www.w3docs.com/snippets/java/determine-if-a-string-is-an-integer-in-java.html
					// author: w3docs.com 
					Boolean isDigit = true; 
					
					for (int i = 0; i < input.length(); i++) 
					{
						if (!Character.isDigit(input.charAt(i))) 
						{
							isDigit = false; 
						}
					}
					
					if (isDigit) 
					{
						if (size < 1)
						{
							thisNode = new Node(Integer.parseInt(input), null); 
							lastNode = thisNode; 
							firstNode = thisNode; 
							size++; 
						}
						else 
						{
							thisNode = new Node(Integer.parseInt(input), null); 
							size++; 
							lastNode.setNext(thisNode); 
							lastNode = thisNode; 
						}
					}
					else 
					{
						System.out.println("Not an integer."); 
					}
					
				}
			}
			
			Node<Integer> thisOne = firstNode; 

			for (int i = 0; i < size; i++)
			{
				System.out.println(thisOne.getItem()); 
				thisOne = thisOne.getNext(); 
			}
			
			keyboard.close(); 
		}
		catch (Exception ex)
		{
			System.out.println(ex); 
		}
		
		return firstNode; // Return the start node of your linked list
	}

	/**
	 * Problem 2: Make a Linked List of Strings, and ask the user for input. Add
	 * each word provided by the user individually to the Linked List, but ONLY if
	 * the word contains the letter "p" (ignore case). Ignore any word that does not
	 * contain a p, but stop taking input when the user enters STOP (don't add the
	 * word stop to the list).
	 */
	public Node<String> addStrings() 
	{
		int size = 0; 
		Node<String> lastNode = new Node(null, null); 
		Node<String> firstNode = new Node(null, null); 
		Node<String> thisNode = new Node(null, null); 
		Node<String> nextItem = new Node(null, null); 
		
		try 
		{
			Scanner keyboard = new Scanner(System.in); 
			String input = ""; 
			
			while (!input.toLowerCase().equals("stop"))
			{
				System.out.println("Please enter a number to add to the linked list or enter 'stop' to end> "); 
				input = keyboard.nextLine(); 
				
				if (input.toLowerCase().equals("stop")) 
				{
					break; 
				}
				else 
				{
					if (input.contains("p") || input.contains("P"))
					{
						if (size < 1)
						{
							thisNode = new Node(input, null); 
							lastNode = thisNode; 
							firstNode = thisNode; 
							size++; 
						}
						else 
						{
							thisNode = new Node(input, null); 
							size++; 
							lastNode.setNext(thisNode); 
							lastNode = thisNode; 
						}
					}
					
				}
			}
			
			Node<String> thisOne = firstNode; 

			for (int i = 0; i < size; i++)
			{
				System.out.println(thisOne.getItem()); 
				thisOne = thisOne.getNext(); 
			}
			
			keyboard.close(); 
		}
		catch (Exception ex)
		{
			System.out.println(ex); 
		}
		
		return firstNode; // Return the start node of your linked list as well as printing it 
	}

	/**
	 * Problem 3: You will be given a Linked List of Integers. Remove all even
	 * numbers, and then print the Linked List.
	 */
	public Node<Integer> removeInts(Node<Integer> linkedList) 
	{
		Node<Integer> removedHead = new Node(null, null); 	
		
		try 
		{
			int size = 0; 
			
			Node<Integer> thisOne = linkedList; 
			
			while (thisOne.getNext() != null)
			{
				thisOne = thisOne.getNext(); 
				size++; 
			}
			
			size++; 
			
			thisOne = linkedList; 
			Node<Integer> lastOne = new Node(null, null); 
			
			int removedSize = 0; 
			int startIndex = 0; 	
			
			for (int i = 0; i < size; i++)
			{
				if (thisOne.getItem() != null)
					startIndex++; 
				
				if (thisOne.getItem() % 2 == 1)
				{
					removedHead = thisOne; 
					lastOne = removedHead; 
					removedSize++; 
					thisOne = thisOne.getNext(); 
					break; 
				}
				
				thisOne = thisOne.getNext(); 
			}
			
			for (int i = startIndex; i < size; i++)
			{
				if (thisOne.getItem() != null && thisOne.getItem() % 2 == 1)
				{
					lastOne.setNext(thisOne); 
					lastOne = thisOne; 
					removedSize++; 
					
				}
				else if (thisOne.getNext() == null)
				{
					if (thisOne.getItem() % 2 == 0)
					{
						lastOne.setNext(null); 
					}
				}
				
				thisOne = thisOne.getNext(); 
			}
			
			thisOne = removedHead; 
		
			for (int i = 0; i < removedSize; i++)
			{
				if (thisOne.getItem() != null)
				{
					System.out.println(thisOne.getItem()); 
					thisOne = thisOne.getNext(); 
				}
				
			}
		
		}
		catch (Exception ex)
		{
			System.out.println(ex); 
		}
		
		return removedHead; // Return the start node of your linked list as well as printing it.
	}

	/**
	 * Problem 4: You will be given a Linked List of Strings. This Linked List will
	 * have at least 2 items. Starting with the second string in the list, remove it
	 * if the string before it comes first alphabetically. Then print the Linked
	 * List.
	 */
	public Node<String> removeStrings(Node<String> linkedList) 
	{
		Node<String> headNode = new Node(null, null); 	
		
		try 
		{
			int size = 0; 
			
			Node<String> thisOne = linkedList; 
			
			while (thisOne.getNext() != null)
			{
				thisOne = thisOne.getNext(); 
				size++; 
			}
			
			size++; 
			
			headNode = linkedList;
			thisOne = headNode.getNext(); 
			Node<String> lastOne = headNode; 
			int removedSize = 0; 
			
			for (int i = 0; i < size; i++) 
			{
				if (thisOne.getNext() != null)
				{
					if (lastOne.getItem().toLowerCase().compareTo(thisOne.getItem().toLowerCase()) < 0)
					{
						lastOne.setNext(thisOne.getNext());
						
						thisOne = thisOne.getNext(); 
						
						removedSize++; 
					}
					else 
					{
						if (thisOne.getNext() != null)
						{
							lastOne.setNext(thisOne);
							lastOne = thisOne; 
							thisOne = thisOne.getNext(); 
						}
					}
				}
				else 
				{
					if (lastOne.getItem().toLowerCase().compareTo(thisOne.getItem().toLowerCase()) < 0)
					{
						lastOne.setNext(null);
						
						removedSize++; 
						
						break; 
					}
					else 
					{					
						lastOne.setNext(thisOne);
						lastOne = thisOne; 
						thisOne = null; 
						
					}
				}
				
			}
			
			thisOne = headNode; 
			
			for (int i = 0; i < size; i++)
			{
				if (thisOne.getItem() != null && thisOne.getNext() != null)
				{
					System.out.println(thisOne.getItem()); 
					
					thisOne = thisOne.getNext(); 
				}
				
			}
			System.out.println(thisOne.getItem()); 
			
		}
		catch (Exception ex) 
		{
			System.out.println(ex); 
		}
		
		return headNode; // Return the start node of your linked list as well as printing it.
	}

	/**
	 * Problem 5: Using the Linked List from problem 1, print the contents of the
	 * Linked List in ascending order, UNLESS the list contains the number 3. If it
	 * contains the number 3, print the list in descending order.
	 */
	public Node<Integer> sortIntegers(Node<Integer> linkedList) 
	{
		Boolean containsThree = false; 
		Node<Integer> sortedListHead = linkedList; 
		Node<Integer> sortedList = new Node(null, null); 
		Node<Integer> thisNode = new Node(null, null); 
		Node<Integer> lastNode = new Node(null, null); 
		
		try 
		{
			int size = 0; 
			
			Node<Integer> thisOne = linkedList; 
			
			while (thisOne.getNext() != null)
			{
				if (Integer.valueOf(thisOne.getItem()) == 3) 
				{
					containsThree = true; 
				}
				
				thisOne = thisOne.getNext(); 
				size++; 
			}
			
			thisOne = linkedList; 
			
			// the psuedocode on this page greatly aided me in the creation 
			// of an insertion sort solution on linked lists: 
			// https://www.interviewkickstart.com/learn/insertion-sort-for-singly-linked-list
			// author: Omkar Deshmukh

		    sortedList = null; 
		    thisNode = sortedListHead; 
		    
		    while (thisNode != null)
		    {
		        Node<Integer> next = thisNode.getNext(); 

		        Node<Integer> newNode = thisNode; 
		    	if (sortedList == null || (sortedList.getItem() > newNode.getItem())) 
		    	{
			        newNode.setNext(sortedList); 
			        sortedList = newNode; 
		    	}
			    else
			    {
			        thisNode = sortedList;  
			        
			        while (thisNode.getNext() != null && (thisNode.getNext().getItem() <= newNode.getItem()))
			        {
			        	thisNode = thisNode.getNext(); 
			        }
			        newNode.setNext(thisNode.getNext());
			        thisNode.setNext(newNode);
			    }

		        thisNode = next; 
		    }
			
		    thisOne = sortedList; 
		    
			if (!containsThree) 
			{
								
				for (int i = 0; i < size; i++)
				{
					if (thisOne.getItem() != null && thisOne.getNext() != null)
					{
						System.out.println(thisOne.getItem()); 
						
						thisOne = thisOne.getNext(); 
					}
					
				}
				System.out.println(thisOne.getItem()); 
			}
			else 
			{
				// the recursive print idea was influenced by this site: 
				// https://www.codingninjas.com/codestudio/library/print-reverse-of-a-linked-list-without-actually-reversing-it#:~:text=The%20only%20restriction%20is%20that,reverse%20the%20original%20linked%20list.&text=According%20to%20the%20problem%2C%20we,the%20head%20of%20the%20list.
				// author: Alisha Chhabra
				reverseLinkedList(linkedList); 
			}
			
		}
		catch (Exception ex) 
		{
			System.out.println(ex); 
		}
		
		return linkedList; // Return the start node of your linked list as well as printing it.
	}
	
	// the recursive print idea was influenced by this site: 
	// https://www.codingninjas.com/codestudio/library/print-reverse-of-a-linked-list-without-actually-reversing-it#:~:text=The%20only%20restriction%20is%20that,reverse%20the%20original%20linked%20list.&text=According%20to%20the%20problem%2C%20we,the%20head%20of%20the%20list.
	// author: Alisha Chhabra
	public static void reverseLinkedList(Node<Integer> linkedList) 
	{
		if (linkedList == null)
		{
			return; 
		}
		
		reverseLinkedList(linkedList.getNext()); 
		
		System.out.println(linkedList.getItem()); 
		
	}

	/**
	 * Problem 6: Given a Linked List of Strings, sort the list based on the number
	 * of characters in each string. The shortest words should be first. Then print
	 * the sorted list.
	 */
	public Node<String> sortStrings(Node<String> linkedList) 
	{
		
		Node<String> sortedListHead = linkedList; 
		Node<String> sortedList = new Node(null, null); 
		Node<String> thisNode = new Node(null, null); 
		Node<String> lastNode = new Node(null, null); 
				
		// the psuedocode on this page greatly aided me in the creation 
		// of an insertion sort solution on linked lists: 
		// https://www.interviewkickstart.com/learn/insertion-sort-for-singly-linked-list
		// author: Omkar Deshmukh

	    sortedList = null; 
	    thisNode = sortedListHead; 
	    
	    while (thisNode != null)
	    {
	        Node<String> next = thisNode.getNext(); 

	        Node<String> newNode = thisNode; 
	    	if (sortedList == null || (sortedList.getItem().length() > newNode.getItem().length())) 
	    	{
		        newNode.setNext(sortedList); 
		        sortedList = newNode; 
	    	}
		    else
		    {
		        thisNode = sortedList;  
		        
		        while (thisNode.getNext() != null && (thisNode.getNext().getItem().length() <= newNode.getItem().length()))
		        {
		        	thisNode = thisNode.getNext(); 
		        }
		        newNode.setNext(thisNode.getNext());
		        thisNode.setNext(newNode);
		    }

	        thisNode = next; 
	    }
	    
	    sortedListHead = sortedList; 

		thisNode = sortedListHead; 
		
		while (thisNode.getItem() != null)
		{
			System.out.println(thisNode.getItem());
			
			if (thisNode.getNext() != null)
				thisNode = thisNode.getNext(); 
			else 
				break; 
		}
		
		return sortedListHead; // Return the start node of your linked list as well as printing it.
	}

	/**
	 * Problem 7: Given a Linked List of Integers, count the number of numbers that
	 * contain 7 in the list. A number can have multiple 7s, but it still only
	 * counts as 1 number. i.e. The list [3, 57, 7, 777, 79] has 4 numbers with the
	 * number 7. Return your final count.
	 */
	public int countNumbersWith7(Node<Integer> linkedList) 
	{
		int totalSevens = 0; 
		
		Node<Integer> thisOne = linkedList; 
		
		while (thisOne.getNext() != null)
		{
			Integer testForSevens = thisOne.getItem(); 
			String convertedToStr = testForSevens.toString(); 
			
			for (int i = 0; i < convertedToStr.length(); i++)
			{
				if (convertedToStr.charAt(i) == '7')
				{
					totalSevens++; 
					break; 
				}
			}
			
			thisOne = thisOne.getNext(); 
			
		}
		
		return totalSevens; // You do not need to print anything here.
	}

	/**
	 * Problem 8: You are given two Linked List of Strings. The first Linked List is
	 * what you will be looking through. Create a Linked List of Integers. For each
	 * string in the second list, determine if it is also in the first list. If it
	 * is, add it's index to the list you created. If it is not in the first list,
	 * add -1 to your index list. Print the index list when you are done.
	 */
	public Node<Integer> findTheString(Node<String> linkedList, Node<String> stringsToFind) 
	{
//		Node<Integer> foundIndices = new Node(null, null);  
		Node<Integer> thisNode = new Node(null, null); 
		Node<Integer> lastFound = new Node(null, null); 
		Boolean found = false; 
		Node<Integer> foundIndicesHead = new Node(null, null); 
		Node<String> newLinkedList = linkedList; 
		Node<String> newStringsToFind = stringsToFind; 
		int index = 0; 
		
		while (newLinkedList.getItem() != null)  
		{
			found = false; 
			
			newStringsToFind = stringsToFind; 
			
			while (newStringsToFind.getItem() != null)
			{
				if (newStringsToFind.getItem().toLowerCase().equals(newLinkedList.getItem().toLowerCase()))
				{
					if (foundIndicesHead.getItem() == null)
					{
						thisNode = new Node(index, null); 
						lastFound = thisNode; 
						foundIndicesHead = thisNode; 
						found = true; 
					}
					else 
					{
						thisNode = new Node(index, null); 
						lastFound.setNext(thisNode); 
						lastFound = thisNode; 
						found = true; 
					}
					break; 
				}
				if (newStringsToFind.getNext() != null) 
				{
					newStringsToFind = newStringsToFind.getNext(); 
				}
				else
				{
					if (found == false) 
					{
						thisNode = new Node(-1, null);  
						lastFound.setNext(thisNode); 
						lastFound = thisNode; 
					}
					break; 
				}			
				
			}
			
			index++; 
			
			if (newLinkedList.getNext() != null)
			{
				newLinkedList = newLinkedList.getNext(); 
			}
			else
			{
				break; 
			}
			
			
				
		}
		
		Node<Integer> thisOne = foundIndicesHead; 
		
		while (thisOne.getItem() != null)
		{
			System.out.println(thisOne.getItem());
			
			if (thisOne.getNext() != null)
				thisOne = thisOne.getNext(); 
			else 
				break; 
		}
		
		return foundIndicesHead; // Return the start node of your linked list as well as printing it.
	}

	/**
	 * Problem 9: You will be given a Linked List of Strings. These strings will be
	 * sentences with at least 2 words. Replace the spaces in these sentences with
	 * numbers that count the spaces. i.e. The sentence "Hi how are you doing" would
	 * be come "Hi1how2are3you4doing". Then print the list.
	 */
	public Node<String> replaceSpaces(Node<String> linkedList) 
	{
		int size = 0; 
		int alteredSize = 0; 
		Node<String> lastNode = new Node(null, null); 
		Node<String> firstNode = new Node(null, null); 
		Node<String> thisNode = new Node(null, null); 
		
		try 
		{
			size = 0; 
			
			Node<String> thisOne = linkedList; 
			
			while (thisOne.getNext() != null)
			{
				thisOne = thisOne.getNext(); 
				size++; 
			}
			
			thisOne = linkedList; 
			
			while (thisOne != null) 
			{
				int count = 1; 
				Character[] alteredString = null; // needs array since strings are immutable
				String thisString = thisOne.getItem(); 
				alteredString = new Character[thisString.length()];
						
				for (int i = 0; i < thisString.length(); i++) 
				{
					
					Character thisChar = (char)thisString.charAt(i); 
					
					if (Character.isWhitespace(thisChar)) 
					{
						char thisCount = (char)(count+'0'); 
						alteredString[i] = thisCount; // needs array since strings are immutable
						count++; 
					}
					else 
					{
						alteredString[i] = (char)thisString.charAt(i); // needs array since strings are immutable
						
					}				
				}
				
				char[] charArr = new char[thisString.length()]; // needs array since strings are immutable
						
				for (int i = 0; i < thisString.length(); i++) 
				{
					charArr[i] = alteredString[i]; // needs array since strings are immutable
				}
				
				
				String numberedString = String.valueOf(charArr); 
				
				if (alteredSize < 1)
				{
					thisNode = new Node(numberedString, null); 
					lastNode = thisNode; 
					firstNode = thisNode; 
					alteredSize++;  
				}
				else 
				{
					thisNode = new Node(numberedString, null); 
					alteredSize++;  
					lastNode.setNext(thisNode); 
					lastNode = thisNode; 
				}
				
				thisOne = thisOne.getNext(); 
						
			}
			
			Node<String> thisPrint = firstNode; 

			for (int i = 0; i < alteredSize; i++)
			{
				System.out.println(thisPrint.getItem()); 
				thisPrint = thisPrint.getNext(); 
			}
			
		}
		catch (Exception ex)
		{
			System.out.println(ex); 
		}
		
		return firstNode; // Return the start node of your linked list as well as printing it.
	}

	/**
	 * Problem 10: Using the Linked List from problem 2, sort the list based on the
	 * position of the first occurrence of the letter p in the word. i.e. If the
	 * list was [top, pop, apple], it would be sorted as [pop, apple, top]. Print
	 * the sorted list.
	 */
	public Node<String> sortP(Node<String> linkedList) 
	{
		
		Node<String> newLinkedList = linkedList; 
		Node<String> newListHead = new Node(null, null); 
		Node<String> thisNode = new Node(null, null); 
		Node<String> lastNode = new Node(null, null); 
				
		int longestWord = 0; 
		int alteredSize = 0; 
		
		while (newLinkedList.getItem() != null)
		{
			if (newLinkedList.getItem().length() > longestWord)
			{
				longestWord = newLinkedList.getItem().length(); 
				
			}
			if (newLinkedList.getNext() != null)
				newLinkedList = newLinkedList.getNext(); 
			else 
				break; 
		}
		
		newLinkedList = linkedList; 
		
		Node<String> sortedListHead = linkedList; 
		Node<String> sortedList = new Node(null, null); 
				
		// the psuedocode on this page greatly aided me in the creation 
		// of an insertion sort solution on linked lists: 
		// https://www.interviewkickstart.com/learn/insertion-sort-for-singly-linked-list
		// author: Omkar Deshmukh

	    sortedList = null; 
	    thisNode = sortedListHead; 
	    
	    while (thisNode != null)
	    {
	        Node<String> next = thisNode.getNext(); 

	        Node<String> newNode = thisNode; 
	    	if (sortedList == null || (sortedList.getItem().toLowerCase().indexOf("p") > newNode.getItem().toLowerCase().indexOf("p"))) 
	    	{
		        newNode.setNext(sortedList); 
		        sortedList = newNode; 
	    	}
		    else
		    {
		        thisNode = sortedList;  
		        
		        while (thisNode.getNext() != null && (thisNode.getNext().getItem().toLowerCase().indexOf("p") <= newNode.getItem().toLowerCase().indexOf("p")))
		        {
		        	thisNode = thisNode.getNext(); 
		        }
		        newNode.setNext(thisNode.getNext());
		        thisNode.setNext(newNode);
		    }

	        thisNode = next; 
	    }
	    
	    sortedListHead = sortedList; 

		thisNode = sortedListHead; 
		
		while (thisNode.getItem() != null)
		{
			System.out.println(thisNode.getItem());
			
			if (thisNode.getNext() != null)
				thisNode = thisNode.getNext(); 
			else 
				break; 
		}
		
// first attempt 
//		for (int i = 0; i < longestWord; i++) 
//		{
//			newLinkedList = linkedList; 
//			
//			while (newLinkedList.getItem() != null)
//			{
//				if (i < newLinkedList.getItem().length())
//				{
//					Character thisOne = newLinkedList.getItem().toLowerCase().charAt(i); 
//					
//					if (thisOne.equals('p')) 
//					{
//						// add to newList 
//						if (newListHead == null)
//						{
//							thisNode = new Node(newLinkedList, null); 
//							lastNode = thisNode; 
//							newListHead = thisNode; 
//							alteredSize++;  
//							
//						}
//						else 
//						{
//							thisNode = new Node(newLinkedList, null); 
//							alteredSize++;  
//							lastNode.setNext(thisNode); 
//							lastNode = thisNode; 
//							
//						}	
//						
//					}
//					
//					if (newLinkedList.getNext() != null)
//						newLinkedList = newLinkedList.getNext(); 
//					else 
//						break; 
//				}
//			}
//		}

//		thisNode = newListHead; 
//		
//		while (thisNode.getItem() != null)
//		{
//			System.out.println(thisNode.getItem());
//			
//			if (thisNode.getNext() != null)
//				thisNode = thisNode.getNext(); 
//			else 
//				break; 
//		}
		
		return sortedListHead; // Return the start node of your linked list as well as printing it.
	}
}
