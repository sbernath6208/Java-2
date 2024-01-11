// Stuart Bernath	uin: 669791508    3/10/23 
//package Labs.Module4; // uncomment for professor 
package Labs4; 

import java.io.File; 
import java.util.Random; 
import java.io.PrintWriter; 
import java.util.Scanner;

public class Module4Labs {
	/*
	 * General Guidelines:
	 * 
	 * Write the body of the provided method.
	 * 
	 * If a test file is given, it will be included on canvas for you to download
	 * and test. This will not encompass all test cases, so be prepared.
	 * 
	 * Do not print any messages out to the screen unless specifically instructed to
	 * do so.
	 * 
	 * Do not gather information from the user unless specifically instructed to do
	 * so.
	 * 
	 * If you are instructed to create/save a file, make sure it saves to your Java
	 * Package (i.e. do not specify a path)
	 */

	/*
	 * Problem 1
	 * 
	 * This method should read in a given file and return the sum of all of the
	 * numbers within the file.
	 * 
	 * For this problem you can assume only integers will be included in any file I
	 * test.
	 * 
	 * Test File: Problem1.txt
	 */
	
	public int Problem1(File file) {
        int sum = 0; 
        
        try 
        {
        	Scanner input = new Scanner(file); 
        	
            while (input.hasNext()) 
            {
            	sum += input.nextInt(); 
            }
            
            input.close(); 
        }
        catch (Exception ex)
        {
        	System.out.println(ex); 
        }
        
		return sum;
	}

	/*
	 * Problem 2
	 * 
	 * This method will read in a file. This file will contain only one line. This
	 * line will contain multiple numbers separated by a comma.
	 * 
	 * Your method should read each number of this file, and return the sum of all
	 * numbers included.
	 * 
	 * For this problem you can assume only integers and commas will be included in
	 * any file I test.
	 * 
	 * Test File: Problem2.txt
	 */
	public int Problem2(File file) {
		int sum = 0; 
        
        try 
        {
        	Scanner input = new Scanner(file); 
        	
            while (input.hasNext()) 
            {
            	input.useDelimiter(","); 
            	sum += input.nextInt(); 
            }
            
            input.close(); 
        }
        catch (Exception ex)
        {
        	System.out.println(ex); 
        }
        
		return sum;
	}

	/*
	 * Problem 3
	 * 
	 * This method will read in a file. This file will contain multiple lines. Each
	 * line will contain a collection of characters (no spaces).
	 * 
	 * The second parameter will be a single word. Read each line of the file until
	 * you either find the word the user entered, or reach the end of the file. If
	 * you find the word return true, if the word was not found in the list return
	 * false.
	 * 
	 * Test File: Problem3.txt
	 */
	public boolean Problem3(File file, String phrase) {
		Boolean hasPhrase = false; 
		
        try 
        {
        	Scanner input = new Scanner(file); 
        	
            while (input.hasNext()) 
            {
            	if (input.next().toLowerCase().equals(phrase.toLowerCase())) 
            	{
            		hasPhrase = true; 
            	}
            }
            
            input.close(); 
        }
        catch (Exception ex)
        {
        	System.out.println(ex); 
        }
        
		return hasPhrase;
	}

	/*
	 * Problem 4
	 * 
	 * This method will read in a file. This file will contain multiple lines. Each
	 * line will contain a collection of characters (no spaces).
	 * 
	 * The second parameter will be a phrase. Read in each line of the file until
	 * you find a word that is contained within the phrase or you reach the end of
	 * the file. If a word is found return true, otherwise return false.
	 * 
	 * Test File: Problem4.txt
	 */
	public boolean Problem4(File file, String phrase) {
		// I found the greedy regex "\\s+" for .split() 
		// at https://javarevisited.blogspot.com/2016/10/how-to-split-string-in-java-by-whitespace-or-tabs.html#axzz7vCAwm1kS 
		// author: javin paul 
		Boolean hasWord = false; 
		String[] phraseArr = phrase.split("\\s+"); 
		String fileWord = ""; 
		
        try 
        {
        	Scanner input = new Scanner(file); 
        	
            while (input.hasNext()) 
            {
            	fileWord = input.next().toLowerCase(); 
            	
            	for (String word : phraseArr) 
            	{
            		if (fileWord.equals(word.toLowerCase())) 
                	{
                		hasWord = true; 
                	}
            	}          	
            }
            
            input.close(); 
        }
        catch (Exception ex)
        {
        	System.out.println(ex); 
        }
        
		return hasWord;
	}

	/*
	 * Problem 5
	 * 
	 * This method will read in a file. This file will contain multiple lines. Each
	 * line will contain a collection of characters (no spaces).
	 * 
	 * Take each line of the file and place it inside of an array of the correct
	 * length. The array should hold only Strings. You should determine the length
	 * of your array by programmatically counting the lines in the file (the length
	 * will change based on the tests that I run). For example: If the file has 50
	 * lines, your array should be length 50.
	 * 
	 * Return that array of strings when done.
	 * 
	 * Test File: Problem5.txt
	 */
	public String[] Problem5(File file) {
		int count = 0; 
		String[] fileArr = null; 
		
		try 
		{
			Scanner input = new Scanner(file); 
        	
            while (input.hasNext()) 
            {
            	input.nextLine(); 
            	count++; 
            }
            
            input.close(); 
            
            input = new Scanner(file); 
            
            fileArr = new String[count]; 
            
            for (int i = 0; i < fileArr.length; i++)
            {
            	fileArr[i] = input.nextLine();  
            }
            
            input.close(); 
            
		} 
		catch (Exception ex) 
		{
			System.out.println("Caught Exception: "); 
			System.out.println(ex);  
		}
			
		return fileArr;
	}

	/*
	 * Problem 6
	 * 
	 * This method will read in a file. This file will contain multiple lines. On
	 * each line you will find a decimal number
	 * 
	 * Read in all of the numbers and calculate their average. The number of lines
	 * in the file can change, so you should not hard code the length.
	 * 
	 * Test File: Problem6.txt
	 */
	public double Problem6(File file) {
		int count = 0; 
		double sum = 0; 
		double avg = 0; 
		
		Double[] fileArr = null; 
		
		try 
		{
			Scanner input = new Scanner(file); 
        	
            while (input.hasNext()) 
            {
            	input.nextFloat(); 
            	count++; 
            }
            
            input.close(); 
            
            input = new Scanner(file); 
            
            fileArr = new Double[count]; 
            
            for (int i = 0; i < fileArr.length; i++)
            {
            	fileArr[i] = input.nextDouble();  
            }
            
            for (int i = 0; i < fileArr.length; i++) 
            {
            	sum += fileArr[i]; 
            }
            
            avg = sum / count; 
            
            input.close(); 
            
		} 
		catch (Exception ex) 
		{
			System.out.println("Caught Exception: "); 
			System.out.println(ex);  
		}
			
		return avg;
	}

	/*
	 * Problem 7
	 * 
	 * This method will read in a file. This file will contain multiple lines. On
	 * each line you will find an integer number.
	 * 
	 * Read in all of the numbers and calculate their median. The number of lines in
	 * the file can change, so you should not hard code the length.
	 * 
	 * Test File: Problem7.txt
	 */
	public int Problem7(File file) {

		int count = 0; 
		int median = 0; 
		int index = 0; 
		
		Integer[] fileArr = null; 
		
		try 
		{
			Scanner input = new Scanner(file); 
        	
            while (input.hasNext()) 
            {
            	input.nextInt(); 
            	count++; 
            }
            
            input.close(); 
            
            input = new Scanner(file); 
            
            fileArr = new Integer[count]; 
            
            for (int i = 0; i < fileArr.length; i++)
            {
            	fileArr[i] = input.nextInt();  
            }

            // I used this site for the insertion sort pseudocode: 
    		// https://www.enjoyalgorithms.com/blog/introduction-to-sorting-bubble-sort-selection-sort-and-insertion-sort  
    		// author: Shubham Gautam 
            
            for (int i = 1; i < count; i++) 
            {
            	int current = fileArr[i]; 
            	int j = i - 1; 
            	
            	while (j >= 0 && fileArr[j] > current) 
            	{
            		fileArr[j+1] = fileArr[j]; 
            		j -= 1; 
            	}
            	
            	fileArr[j+1] = current; 
            }
            
            if (count % 2 == 1) 
            {
            	// +1 for odd length, -1 for index offset i.e. starts at 0 
            	index = (count + 1 - 1) / 2; 
            	median = fileArr[index]; 
            }
            else 
            {
            	// this value really should be a double 
            	// since it calculates the average of the two
            	// middle indexes 
            	// but I cannot change the method header to return a double 
            	// so it will convert the double calculated to an integer 
            	median = Integer.valueOf((fileArr[((count-1) / 2)] + fileArr[((count-1)+1) /2]) / 2); 
            }
            
            input.close(); 
            
		} 
		catch (Exception ex) 
		{
			System.out.println("Caught Exception: "); 
			System.out.println(ex);  
		}
		
		return median;
	}

	/*
	 * Problem 8
	 * 
	 * This method will read in a file. This file will contain multiple lines. On
	 * each line you will find an integer number.
	 * 
	 * Read in all of the numbers and calculate their mode. The number of lines in
	 * the file can change, so you should not hard code the length.
	 * 
	 * Test File: Problem8.txt
	 */
	// got this one wrong, i think he was wrong about modes returning one int 
	public int Problem8(File file) {

		int count = 0; 
		int[] mode = null; 
		int highTotal = 0; 
		int total = 0; 
		int k = 0; 
		
		int[] fileArr = null; 
		
		try 
		{
			Scanner input = new Scanner(file); 
        	
            while (input.hasNext()) 
            {
            	input.nextInt(); 
            	count++; 
            }
            
            input.close(); 
            
            input = new Scanner(file); 
            
            fileArr = new int[count]; 
            mode = new int[count]; 
            
            for (int i = 0; i < fileArr.length; i++)
            {
            	fileArr[i] = input.nextInt();  
            }
            
            for (int i = 0; i < count; i++) 
            {
            	total = 0; 
            	
            	for (int j = i; j < count; j++) 
            	{
            		if (fileArr[i] == fileArr[j]) 
            		{
            			total++; 
            		}
            	}
            	if (total > highTotal) 
            	{
            		highTotal = total; 
            	}
            }
            
            for (int i = 0; i < count; i++) 
            {
            	total = 0; 
            	
            	for (int j = i; j < count; j++) 
            	{
            		if (fileArr[i] == fileArr[j]) 
            		{
            			total++; 
            		}
            	}
            	if (total == highTotal) 
            	{
                		mode[k] = fileArr[i]; 
                		k++; 
            	}
            }
            
            input.close(); 
            
		} 
		catch (Exception ex) 
		{
			System.out.println("Caught Exception: "); 
			System.out.println(ex);  
		}
		
		// This really needs to return an array of ints 
		// so if you uncomment the line below and 
		// comment out the two lines below it 
		// then change the method header 
		// to return an array of ints, 
		// this will solve the problem of finding 
		// all the modes, since there can be more than 
		// one mode.
		// Otherwise, I just returned the first 
		// mode found to conform with the current 
		// header, which doesn't allow 
		// to return all the modes found. 
		
//		return mode; 
		int modeAsInt = mode[0]; 
		return modeAsInt;

	}

	/*
	 * Problem 9
	 * 
	 * This method will read in a file. This file will contain multiple lines. On
	 * each line you will find a word
	 * 
	 * Read in all of the words and calculate how many times the letter 'a' appears.
	 * 
	 * Test File: Problem9.txt
	 */
	// got this one wrong, don't know why 
	public int Problem9(File file) {
		int count = 0; 
		int numAs = 0; 
		String[] fileArr = null; 
		
		try 
		{
			Scanner input = new Scanner(file); 
        	
            while (input.hasNext()) 
            {
            	input.nextLine(); 
            	count++; 
            }
            
            input.close(); 
            
            input = new Scanner(file); 
            
            fileArr = new String[count]; 
            
            for (int i = 0; i < fileArr.length; i++)
            {
            	fileArr[i] = input.nextLine();  
            }
            
            input.close(); 
                      
            for (int i = 0; i < fileArr.length; i++)
            {          	
            	for (int j = 0; j < fileArr[i].length(); j++)
            	{
            		if (fileArr[i].toLowerCase().charAt(j) == 'a') 
                	{
                		numAs++; 
                	}
            	}         	
            }          
		} 
		catch (Exception ex) 
		{
			System.out.println("Caught Exception: "); 
			System.out.println(ex);  
		}
				
		return numAs;
	}

	/*
	 * Problem 10
	 * 
	 * This method will read in a file. This file will contain multiple lines. On
	 * each line you will find a word
	 * 
	 * Read in all of the words and calculate how many times the substring 'er'
	 * appears.
	 * 
	 * Test File: Problem10.txt
	 */
	public int Problem10(File file) {
		int count = 0; 
		int numErs = 0; 
		String[] fileArr = null; 
		
		try 
		{
			Scanner input = new Scanner(file); 
        	
            while (input.hasNext()) 
            {
            	input.nextLine(); 
            	count++; 
            }
            
            input.close(); 
            
            input = new Scanner(file); 
            
            fileArr = new String[count]; 
            
            for (int i = 0; i < fileArr.length; i++)
            {
            	fileArr[i] = input.nextLine();  
            }
            
            input.close(); 
                      
            for (int i = 0; i < fileArr.length; i++)
            {          	
            	for (int j = 0; j < fileArr[i].length() - 1; j++)
            	{
            		if (fileArr[i].toLowerCase().charAt(j) == 'e' && fileArr[i].toLowerCase().charAt(j+1) == 'r') 
                	{
                		numErs++; 
                	}
            	}          	
            }            
		} 
		catch (Exception ex) 
		{
			System.out.println("Caught Exception: "); 
			System.out.println(ex);  
		}
				
		return numErs;
	}

	/*
	 * Problem 11
	 * 
	 * This method will read in a file. This file will contain multiple lines. On
	 * each line you will find either an integer or a word.
	 * 
	 * Read in all of the integers and return their sum, while ignoring all
	 * non-numeric lines. You should properly detect the difference between a word
	 * and an integer - without your program crashing.
	 * 
	 * Test File: Problem11.txt
	 */
	public int Problem11(File file) {
        int sum = 0; 
        int num = 0; 
        
        try 
        {
        	Scanner input = new Scanner(file); 
        	
            while (input.hasNext()) 
            {
            	try 
            	{
            		num = Integer.parseInt(input.nextLine()); 
            		sum += num; 
            	}
            	catch (Exception exNotInt)
            	{
//            		System.out.println(exNotInt); 
            	}               
            }
            
            input.close(); 
        }
        catch (Exception ex)
        {
        	System.out.println(ex); 
        }
        
		return sum;
	}

	/*
	 * Problem 12
	 * 
	 * This method will read in a file. This file will contain multiple lines. On
	 * each line you will find either an integer or a word.
	 * 
	 * Return the number of unique words listed in the file. A word will be any line
	 * that doesn't contain a single number. You should properly detect the
	 * difference between a word and an integer - without your program crashing.
	 * 
	 * Test File: Problem12.txt
	 */
	// got this one wrong, one short i think. Just fixed it, needed to start with one and do i-1 comparisons. 
	public int Problem12(File file) {
		int totalWords = 0; 
		int count = 0; 
		String[] fileArr = null; 
		
		try 
		{
			Scanner input = new Scanner(file); 
        	
            while (input.hasNext()) 
            {
            	input.nextLine(); 
            	count++; 
            }
            
            input.close(); 
            
            input = new Scanner(file); 
            
            fileArr = new String[count]; 
            
            if (count > 0)
            {
            	totalWords = 1; 
            }
            
            int k = 0; 
            
            for (int i = 0; i < fileArr.length; i++)
            {
            	String thisLine = input.nextLine(); 
            	
            	if (!(Character.isDigit(thisLine.charAt(0))))
            	{
            		fileArr[k] = thisLine.toLowerCase(); 
            		k++; 
            	}
            }
            
            // I used this site for the insertion sort pseudocode: 
    		// https://www.enjoyalgorithms.com/blog/introduction-to-sorting-bubble-sort-selection-sort-and-insertion-sort  
    		// author: Shubham Gautam 
            
            for (int i = 1; i < count; i++) 
            {
            	if (fileArr[i] != null) 
            	{
            		String current = fileArr[i]; 
                	int j = i - 1; 
                	
                	while (j >= 0 && (fileArr[j].compareTo(current) > 0)) 
                	{
                		fileArr[j+1] = fileArr[j]; 
                		j -= 1; 
                	}
                	
                	fileArr[j+1] = current; 
            	}
            	
            }
            
            for (int i = 1; i < fileArr.length; i++)
            {
            	if (fileArr[i] != null) 
            	{
            		if (!(fileArr[i].toLowerCase().equals(fileArr[i-1].toLowerCase()))) 
            		{
            			totalWords++; 
            		}
            		
            	}
            		
            }
            
                      
		} 
		catch (Exception ex) 
		{
			System.out.println("Caught Exception: "); 
			System.out.println(ex);  
		}
		
		return totalWords;
	}

	/*
	 * Problem 13
	 * 
	 * This method will read in a file. This file will contain multiple lines. On
	 * each alternating line you will find a double and then a boolean.
	 * 
	 * Return the sum of all doubles that are followed by a true value, and ignore
	 * all values that are followed by a false value.
	 * 
	 * 
	 * Test File: Problem13.txt
	 */
	public double Problem13(File file) {
		int count = 0; 
		String[] fileArr = null; 
		Double[] fileArrDouble = null; 
		Double[] fileArrFinal = null; 
		double sum = 0; 
		
		try 
		{
			Scanner input = new Scanner(file); 
        	
            while (input.hasNext()) 
            {
            	input.nextLine(); 
            	count++; 
            }
            
            input.close(); 
            
            input = new Scanner(file); 
            
            fileArr = new String[count]; 
            
            for (int i = 0; i < count; i++)
            {
            	String thisLine = input.nextLine(); 
            	
        		fileArr[i] = thisLine; 
            }
            
            int k = 0; 
            fileArrDouble = new Double[count]; 
            
            for (int i = 0; i < count; i++)
            {
            	String thisLine = fileArr[i]; 
            	
            	if (Character.isDigit(thisLine.charAt(0)) && fileArr[i+1].toLowerCase().equals("true")) 
            	{
            		fileArrDouble[k] = Double.parseDouble(thisLine); 
            		k++; 
            	}       		
            }
            
            fileArrFinal = new Double[k]; 
            int m = 0; 
            
            for (int i = 0; i < k; i++) 
            {
            	fileArrFinal[m] = fileArrDouble[i]; 
            	m++; 
            }
            
            for (int i = 0; i < fileArrFinal.length; i++) 
            {
            	sum += fileArrFinal[i]; 
//            	System.out.println(fileArrFinal[i]); // for debugging 
            }
            
            input.close(); 
		} 
		catch (Exception ex) 
		{
			System.out.println(ex); 
		}
		
		return sum; 
	}

	/*
	 * Problem 14
	 * 
	 * This method will read in a file. This file will contain multiple lines. On
	 * each alternating line you will find a double and then a boolean.
	 * 
	 * Sum all doubles that are followed by a true value, and separately sum all
	 * doubles that are followed by a false value. You should return a single value,
	 * which is the absolute value of the difference of the two sums.
	 * 
	 * Test File: Problem14.txt
	 */
	public double Problem14(File file) {
		int count = 0; 
		String[] fileArr = null; 
		Double[] fileArrDouble = null; 
		Double[] fileArrFinal = null; 
		double sum = 0; 
		Double[] fileArrDoubleFalse = null; 
		Double[] fileArrFinalFalse = null; 
		double sumFalse = 0; 
		double absDiff = 0; 
		
		try 
		{
			Scanner input = new Scanner(file); 
        	
            while (input.hasNext()) 
            {
            	input.nextLine(); 
            	count++; 
            }
            
            input.close(); 
            
            input = new Scanner(file); 
            
            fileArr = new String[count]; 
            
            for (int i = 0; i < count; i++)
            {
            	String thisLine = input.nextLine(); 
            	
        		fileArr[i] = thisLine; 
            }
            
            int k = 0; 
            fileArrDouble = new Double[count]; 
            
            for (int i = 0; i < count; i++)
            {
            	String thisLine = fileArr[i]; 
            	if (Character.isDigit(thisLine.charAt(0)) && fileArr[i+1].toLowerCase().equals("true")) 
            	{
            		fileArrDouble[k] = Double.parseDouble(thisLine); 
            		k++; 
            	}
        		
            }
            
            fileArrFinal = new Double[k]; 
            int m = 0; 
            
            for (int i = 0; i < k; i++) 
            {
            	fileArrFinal[m] = fileArrDouble[i]; 
            	m++; 
            }
            
            for (int i = 0; i < fileArrFinal.length; i++) 
            {
            	sum += fileArrFinal[i]; 
//            	System.out.println("Trues: " + fileArrFinal[i]); // for debugging 
            }
            
            // falses            
            k = 0; 
            fileArrDoubleFalse = new Double[count]; 
            
            for (int i = 0; i < count; i++)
            {
            	String thisLine = fileArr[i]; 
            	if (Character.isDigit(thisLine.charAt(0)) && fileArr[i+1].toLowerCase().equals("false")) 
            	{
            		fileArrDoubleFalse[k] = Double.parseDouble(thisLine); 
            		k++; 
            	}    		
            }
            
            fileArrFinalFalse = new Double[k]; 
            m = 0; 
            
            for (int i = 0; i < k; i++) 
            {
            	fileArrFinalFalse[m] = fileArrDoubleFalse[i]; 
            	m++; 
            }
            
            for (int i = 0; i < fileArrFinalFalse.length; i++) 
            {
            	sumFalse += fileArrFinalFalse[i]; 
//            	System.out.println("Falses: " + fileArrFinalFalse[i]); // for debugging             	 
            }
            
//            System.out.println("Sum Trues: " + sum); // for debugging 
//            System.out.println("Sum Falses: " + sumFalse); 
            
            input.close(); 
		} 
		catch (Exception ex) 
		{
			System.out.println(ex); 
		}
		
		absDiff = sum - sumFalse; 
		
		if (absDiff < 0)
		{
			absDiff = -(absDiff); 
		}
		
		return absDiff;
		
	}

	/*
	 * Problem 15
	 * 
	 * This method will read in a file. This file will contain multiple lines. This
	 * file will contain groups of numbers followed by a boolean value. These groups
	 * can have 0 or more integer values. There will be a maximum of 5 groups with a
	 * true value immediately following them.
	 * 
	 * Add all numbers that are in a group that are immediately followed by a true
	 * value. Once you have all of the individual groups added together, multiple
	 * those groups together and return a single value that is the result of that
	 * calculation.
	 * 
	 * Test File: Problem15.txt
	 * 
	 * The output for this example file is: Group1 x Group2 x Group3 x Group 4 = 21
	 * x 14 x 0 x 10 = 0 
	 */
	public double Problem15(File file) {
		int count = 0; 
		String[] fileArr = null; 
		double sum = 0; 
		Double[] sums = null; 
		double productOfSums = 1; 
		
		try 
		{
			Scanner input = new Scanner(file); 
        	
            while (input.hasNext()) 
            {
            	input.nextLine(); 
            	count++; 
            }
            
            input.close(); 
            
            input = new Scanner(file); 
            
            fileArr = new String[count]; 
            
            for (int i = 0; i < count; i++)
            {
            	String thisLine = input.nextLine(); 
            	
        		fileArr[i] = thisLine; 
            }
            
            input.close(); 
            
            int k = 0; 
            sums = new Double[count]; 
            
            for (int i = 0; i < count; i++)
            {
            	sum = 0; 
            	
            	if (fileArr[i].equals("true")) 
            	{
            		for (int j = i-1; j >= 0; j--) 
            		{
            			String thisLineDigi = fileArr[j]; 
            			
            			if ((thisLineDigi.toLowerCase().equals("false")) || (thisLineDigi.toLowerCase().equals("true")))
            			{
            				sums[k] = sum; 
                    		k++; 
            				break; 
            			}
            			else if (Character.isDigit(thisLineDigi.charAt(0))) 
            			{
            				sum += Double.parseDouble(thisLineDigi); 
//            				System.out.println(thisLineDigi); // for debugging 
            			}
            		}           		
            	}       		
            }

             // commented out sys outs were for debugging 
//            for (int i = 0; i < count; i++)
//            {
//            	if (sums[i] != null) 
//            	{
//            		System.out.println(sums[i]);  
//            	}
//            }
            
            for (int i = 0; i < count; i++)
            {
            	if (sums[i] != null) 
            	{
            		productOfSums *= sums[i]; 
            	}
            }            
		} 
		catch (Exception ex) 
		{
			System.out.println(ex); 
		}
		
		return productOfSums; 
	}
	/*
	 * Problem 16
	 * 
	 * Write a method that creates a file - Inside of this file you should print out
	 * "Hello, my name is" followed by your first and last name.
	 * 
	 * Output File: Problem16Out.txt
	 */

	public void Problem16() {
		
		try 
		{
			File problem16 = new File("Problem16Out.txt"); 
			if (problem16.exists()) 
			{
				System.out.println("File already existed."); 
				System.out.println("Overwritten."); 
//				System.exit(0); 
			}
			
			PrintWriter input = new PrintWriter(problem16); 
			
			String helloName = "Hello, my name is Stuart Bernath"; 
			input.write(helloName); 	
			
			input.close(); 
			
		} 
		catch (Exception ex) 
		{
			System.out.println(ex); 
		}
		
	}

	/*
	 * Problem 17
	 * 
	 * Write a method that creates a file - Inside of this file you should create 25
	 * lines that each have a randomly generated number (between 0 and 99)
	 * 
	 * Output File: Problem17Out.txt
	 */
	public void Problem17() {
		Random rand = new Random(); 
		int[] nums = new int[25]; 
		
		for (int i = 0; i < nums.length; i++)
		{
			nums[i] = rand.nextInt(100); 
		}
		
//		for (int i = 0; i < nums.length; i++) // for debugging 
//		{
//			System.out.println(nums[i]);  
//		}
		
		try 
		{
			File problem17 = new File("Problem17Out.txt"); 
			if (problem17.exists()) 
			{
				System.out.println("File already existed."); 
				System.out.println("Overwritten."); 
//				System.exit(0); 
			}
			
			PrintWriter input = new PrintWriter(problem17); 
			
			for (int i = 0; i < nums.length; i++)
			{
				input.write(nums[i] + "\n"); 
			}
				
			
			input.close(); 
			
		} 
		catch (Exception ex) 
		{
			System.out.println(ex); 
		}
	}

	/*
	 * Problem 18
	 * 
	 * Write a method that creates a file - Your method should accept an array of
	 * Strings. All of these Strings should be stored in a file in exactly the order
	 * they appeared in the array.
	 * 
	 * Output File: Problem18Out.txt
	 */
	public void Problem18(String[] myArray) {
		
		try 
		{
			File problem18 = new File("Problem18Out.txt"); 
			if (problem18.exists()) 
			{
				System.out.println("File already existed."); 
				System.out.println("Overwritten."); 
//				System.exit(0); 
			}
			
			PrintWriter input = new PrintWriter(problem18); 
			
			for (int i = 0; i < myArray.length; i++)
			{
				input.write(myArray[i] + "\n"); 
			}				
			
			input.close(); 
			
		} 
		catch (Exception ex) 
		{
			System.out.println(ex); 
		}
	}

	/*
	 * Problem 19
	 * 
	 * Write a method that creates a file - Your method should accept an array of
	 * integers. All of these integers should be stored in a file in the order they
	 * appeared in the array. The last line of the file should contain the sum total
	 * of all integers that have been entered.
	 * 
	 * Output File: Problem19Out.txt
	 */
	public void Problem19(int[] myArray) {
		int sum = 0; 
		
		try 
		{
			File problem19 = new File("Problem19Out.txt"); 
			if (problem19.exists()) 
			{
				System.out.println("File already existed."); 
				System.out.println("Overwritten."); 
//				System.exit(0); 
			}
			
			PrintWriter input = new PrintWriter(problem19); 
			
//			for (int i = 0; i < myArray.length; i++) // for debugging 
//			{
//				sum += myArray[i]; 
//			}
//			System.out.println(sum); 
			
			for (int i = 0; i < myArray.length; i++)
			{
				if (i != myArray.length-1)
				{
					sum += myArray[i]; 
					input.write(myArray[i] + "\n"); 
					
				}
				else if (i == myArray.length-1)
				{
					sum += myArray[i]; 
					input.write(myArray[i] + "\n"); 
//					System.out.println(sum); 
					input.write("" + sum); 
				}
				
			}
			
			input.close(); 
			
		} 
		catch (Exception ex) 
		{
			System.out.println(ex); 
		}
	}

	/*
	 * Problem 20
	 * 
	 * This method will read in a file. This file will contain multiple lines. Each
	 * line will contain an integer or a string.
	 * 
	 * If the value on the line is numerical, add its value to a running total. If
	 * the value on the line is a string, subtract the number of characters in the
	 * string from the running total. Return the total.
	 * 
	 * Test File: Problem20.txt
	 */
	public int Problem20(File file) {
		int sumTotal = 0; 
		String fileArr[]; 
		Integer[] allInts; 
		String[] allStrings; 
		int count = 0; 
		
        try 
        {
        	Scanner input = new Scanner(file); 
        	
        	while (input.hasNext()) 
        	{
        		input.nextLine(); 
        		count++; 
        	}
        	
        	input.close(); 
        	input = new Scanner(file); 
        	
        	fileArr = new String[count]; 
        	allInts = new Integer[count]; 
        	allStrings = new String[count]; 
        	
        	for (int i = 0; i < count; i++) 
        	{
        		fileArr[i] = input.nextLine(); 
        	}
        	
        	input.close(); 
        	
        	int k = 0; 
        	int m = 0; 
        	
        	for (int i = 0; i < count; i++) 
        	{
        		try 
        		{
        			allInts[k] = Integer.parseInt(fileArr[i]); 
            		k++; 
        		}
        		catch (Exception str) 
        		{
        			allStrings[m] = fileArr[i]; 
        			m++; 
        		}
        		
        	}
        	
//        	System.out.println("Ints: "); // for debugging 
        	for (int i = 0; i < count; i++) 
        	{
        		if (allInts[i] != null) 
        		{
//        			System.out.println(allInts[i]); // for debugging 
        			sumTotal += allInts[i]; 
        		}      			
        	}
        	
//        	System.out.println(sumTotal); // for debugging 
//        	System.out.println("Strings: "); 
        	for (int i = 0; i < count; i++) 
        	{
        		if (allStrings[i] != null) 
        		{
//        			System.out.println(allStrings[i]); // for debugging 
        			sumTotal -= allStrings[i].length(); 
        		}    			
        	}      	
        }
        catch (Exception ex) 
        {
        	System.out.println(ex); 
        }
        
		return sumTotal;
	}

	/*
	 * Problem 21
	 * 
	 * This method will read in a file. This file will contain multiple lines. Each
	 * line will contain a string.
	 * 
	 * You should read in and then sort these strings in alphabetical order (A-Z)
	 * and save them to a file.
	 * 
	 * Test File: Problem21.txt Output File: Problem21Out.txt
	 */
	public void Problem21(File file) {
		String[] fileArr; 
		int count = 0; 
		
		try 
		{
			Scanner input = new Scanner(file); 
        	
        	while (input.hasNext()) 
        	{
        		input.nextLine(); 
        		count++; 
        	}
        	
        	input.close(); 
        	// read file 
        	input = new Scanner(file); 
        	
        	fileArr = new String[count]; 
        	
        	for (int i = 0; i < count; i++) 
        	{
        		fileArr[i] = input.nextLine(); 
        	}
        	
        	input.close(); 
        	
    		// sort 
    		// I used this site for the insertion sort pseudocode: 
    		// https://www.enjoyalgorithms.com/blog/introduction-to-sorting-bubble-sort-selection-sort-and-insertion-sort  
    		// author: Shubham Gautam 
            
            for (int i = 1; i < count; i++) 
            {
            	if (fileArr[i] != null) 
            	{
            		String current = fileArr[i]; 
                	int j = i - 1; 
                	
                	while (j >= 0 && (fileArr[j].toLowerCase().compareTo(current.toLowerCase()) > 0)) 
                	{
                		fileArr[j+1] = fileArr[j]; 
                		j -= 1; 
                	}
                	
                	fileArr[j+1] = current; 
            	}
            	
            } 
            
            // save file 
            File problem21 = new File("Problem21Out.txt"); 
            {
				System.out.println("File already existed."); 
				System.out.println("Overwritten."); 
//				System.exit(0); 
			}
			
			PrintWriter fileInput = new PrintWriter(problem21); 
			
			for (int i = 0; i < fileArr.length; i++)
			{
				fileInput.write(fileArr[i] + "\n"); 
			}
						
			fileInput.close(); 
		} 
		catch (Exception ex) 
		{
			System.out.println(ex); 
		}
		
		
	}

	/*
	 * Problem 22
	 * 
	 * This method will read in a file. This file will contain multiple lines. Each
	 * line will contain a number.
	 * 
	 * You should read in and then sort these strings in alphabetical order (A-Z) (will do ascending order numerically) 
	 * and save them to a file.
	 * 
	 * Test File: Problem22.txt Output File: Problem22Out.txt
	 */
	public void Problem22(File file) {
		Integer[] fileArr; 
		int count = 0; 
		
		try 
		{
			Scanner input = new Scanner(file); 
        	
        	while (input.hasNext()) 
        	{
        		input.nextLine(); 
        		count++; 
        	}
        	
        	input.close(); 
        	// read file 
        	input = new Scanner(file); 
        	
        	fileArr = new Integer[count]; 
        	
        	for (int i = 0; i < count; i++) 
        	{
        		fileArr[i] = input.nextInt(); 
        	}
        	
        	input.close(); 
        	
    		// sort 
    		// I used this site for the insertion sort pseudocode: 
    		// https://www.enjoyalgorithms.com/blog/introduction-to-sorting-bubble-sort-selection-sort-and-insertion-sort  
    		// author: Shubham Gautam 
            
        	 for (int i = 1; i < count; i++) 
             {
             	int current = fileArr[i]; 
             	int j = i - 1; 
             	
             	while (j >= 0 && fileArr[j] > current) 
             	{
             		fileArr[j+1] = fileArr[j]; 
             		j -= 1; 
             	}
             	
             	fileArr[j+1] = current; 
             }
            
            // save file 
            File problem22 = new File("Problem22Out.txt"); 
			if (problem22.exists()) 
			{
				System.out.println("File already existed."); 
				System.out.println("Overwritten."); 
//				System.exit(0); 
			}
			
			PrintWriter fileInput = new PrintWriter(problem22); 
			
			for (int i = 0; i < fileArr.length; i++)
			{
				fileInput.write(fileArr[i] + "\n"); 
			}
				
			
			fileInput.close(); 
            
        	
		} 
		catch (Exception ex) 
		{
			System.out.println(ex); 
		}
		
	}

	/*
	 * Problem 23
	 * 
	 * This method will read in a file. This file will contain multiple lines. Each
	 * line will contain the name of a product and the following line will contain a
	 * number signifying the quantity.
	 * 
	 * Save the information to a file with all of the product names on one line
	 * separated by commas, and all of the quantities on the next line (in the same
	 * order) separated by commas.
	 * 
	 * Test File: Problem23.txt Output File: Problem23Out.txt
	 */
	public void Problem23(File file) {
		int sumTotal = 0; 
		String fileArr[]; 
		Integer[] allInts; 
		String[] allStrings; 
		int count = 0; 
		
        try 
        {
        	Scanner input = new Scanner(file); 
        	
        	while (input.hasNext()) 
        	{
        		input.nextLine(); 
        		count++; 
        	}
        	
        	input.close(); 
        	input = new Scanner(file); 
        	
        	fileArr = new String[count]; 
        	allInts = new Integer[count]; 
        	allStrings = new String[count]; 
        	
        	for (int i = 0; i < count; i++) 
        	{
        		fileArr[i] = input.nextLine(); 
        	}
        	
        	input.close(); 
        	
        	int k = 0; 
        	int m = 0; 
        	
        	for (int i = 0; i < count; i++) 
        	{
        		try 
        		{
        			allInts[k] = Integer.parseInt(fileArr[i]); 
            		k++; 
        		}
        		catch (Exception str) 
        		{
        			allStrings[m] = fileArr[i]; 
        			m++; 
        		}
        		
        	} 
        	
        	// save file 
            File problem23 = new File("Problem23Out.txt"); 
			if (problem23.exists()) 
			{
				System.out.println("File already existed."); 
				System.out.println("Overwritten."); 
//				System.exit(0); 
			}
			
			PrintWriter fileInput = new PrintWriter(problem23); 
			
			for (int i = 0; i < allStrings.length; i++)
			{
				if (allStrings[i] != null) 
				{
					fileInput.write(allStrings[i]); 
					if (allStrings[i+1] != null)
					{
						fileInput.write(", "); 
					}
				}
			}
			
			fileInput.write("\n" + ""); 
			
			for (int i = 0; i < allInts.length; i++)
			{
				if (allInts[i] != null) 
				{
					fileInput.write(allInts[i] + "");
					if (allInts[i+1] != null)
					{
						fileInput.write(", "); 
					}
				}
				
			}
			
			fileInput.close(); 
        	
        } 
        catch (Exception ex) 
        {
        	System.out.println(ex); 
        }
	}
	


	/*
	 * Problem 24
	 * 
	 * This method will read in a file. This file will contain multiple lines. Each
	 * line will contain the name of a product and the following line will contain a
	 * number signifying the quantity.
	 * 
	 * Save the information to a file with all of the product names on one line
	 * separated by commas, and all of the quantities on the next line (in the same
	 * order) separated by commas. This time, if the file contains a product more
	 * than once you should add them together before saving the file.
	 * 
	 * Test File: Problem24.txt Output File: Problem24Out.txt
	 */
	public void Problem24(File file) 
	{
		
		String fileArr[]; 
		Integer[] allInts; 
		String[] allStrings; 
		int count = 0; 
		
        try 
        {
        	Scanner input = new Scanner(file); 
        	
        	while (input.hasNext()) 
        	{
        		input.nextLine(); 
        		count++; 
        	}
        	
        	input.close(); 
        	input = new Scanner(file); 
        	
        	fileArr = new String[count]; 
        	allInts = new Integer[count]; 
        	allStrings = new String[count]; 
        	
        	for (int i = 0; i < count; i++) 
        	{
        		fileArr[i] = input.nextLine(); 
        	}
        	
        	input.close(); 
        	
        	int k = 0; 
        	int m = 0; 
        	
        	for (int i = 0; i < count; i++) 
        	{
        		try 
        		{
        			allInts[k] = Integer.parseInt(fileArr[i]); 
            		k++; 
        		}
        		catch (Exception str) 
        		{
        			allStrings[m] = fileArr[i]; 
        			m++; 
        		}
        		
        	} 
        	
//        	for (int i = 0; i < allStrings.length; i++) // for debugging 
//            {
//            	if (allStrings[i] != null) 
//            	{
//            		System.out.println(allStrings[i] + ": " + allInts[i] + ""); 
//            	}
//            	
//            }
      	
        	// Comparable extends and implements override solution to be generic was taken from 
        	// https://stackoverflow.com/questions/21544716/implementing-comparable-with-a-generic-class
        	// author: Njol 
        	// and inspired by your writing on comparables on UIS's Canvas 
			
			class CarInventory <T extends CarInventory<T>> implements Comparable<CarInventory<T>>
        	{
        		private String name; 
        		private int totalCars; 
        		
        		public CarInventory(String userCarName, int userTotal) 
        		{
        			this.name = userCarName; 
        			this.totalCars = userTotal; 
        		}
        		
        		public String getName() 
        		{
        			return this.name; 
        		}
        		
        		public void setName(String userName) 
        		{
        			this.name = userName; 
        		}
        		
        		public int getTotal() 
        		{
        			return this.totalCars; 
        		}
        		
        		public void setTotal(int userTotal) 
        		{
        			this.totalCars = userTotal; 
        		}
        		
        		@Override
        		public int compareTo(@SuppressWarnings("rawtypes") CarInventory other) 
        		{
        			if (this.getName().toLowerCase().compareTo(other.getName().toLowerCase()) > 0) 
        			{
        				return 1; 
        			}
        			else if (this.getName().toLowerCase().compareTo(other.getName().toLowerCase()) < 0) 
        			{
        				return -1; 
        			}
        			
        			return 0;         			
        		}
        		
        	}
        	
        	@SuppressWarnings("rawtypes") // I guess I don't quite get these generic comparables entirely yet 
			CarInventory[] cars = new CarInventory[allStrings.length]; 
        	
        	for (int i = 0; i < allStrings.length; i++) 
        	{
        		if (allStrings[i] != null && allInts[i] != null) 
        		{
        			@SuppressWarnings("rawtypes")
					CarInventory car = new CarInventory(allStrings[i], allInts[i]); 
            		cars[i] = car; 
        		}       		
        	}
        	
//        	System.out.println("Before sort: "); // for debugging 
//        	for (int i = 0; i < cars.length; i++) 
//        	{
//        		if (cars[i] != null) 
//        		{
//        			System.out.println(cars[i].getName() + ", " + cars[i].getTotal() + ""); 
//        		}
//        	}
        	
        	// sort 
    		// I used this site for the insertion and selection sort pseudocode: 
    		// https://www.enjoyalgorithms.com/blog/introduction-to-sorting-bubble-sort-selection-sort-and-insertion-sort  
    		// author: Shubham Gautam 
        	
        	@SuppressWarnings("rawtypes")
			CarInventory temp = null; 
        	for (int i = 0; i < cars.length; i++) 
        	{
        		if (cars[i] != null) 
        		{
        			int minInd = i; 
            		for (int j = i; j < cars.length; j++) 
            		{
            			if (cars[j] != null) 
                		{
            				if (cars[j].compareTo(cars[minInd]) < 0) 
                			{
                				minInd = j; 
                			}
                		}         			
            		}
            		
            		temp = cars[i]; 
            		cars[i] = cars[minInd]; 
            		cars[minInd] = temp; 
        		}      		
        	}
        	
//        	System.out.println("After sort: "); 
//        	for (int i = 0; i < cars.length; i++) // for debugging 
//        	{
//        		if (cars[i] != null) 
//        		{
//        			System.out.println(cars[i].getName() + ", " + cars[i].getTotal() + ""); 
//        		}
//        	}
        	
        	// add inventory totals and eliminate duplicate cars before printing to file 
        	@SuppressWarnings("rawtypes")
			CarInventory[] finalCars = new CarInventory[cars.length]; 
        	      
        	int n = 0; 
        	for (int i = 0; i < cars.length; i++)
			{
				if (cars[i] != null) 
				{
					int sum = cars[i].getTotal(); 
					
					for (int j = i; j < cars.length; j++) 
					{
						if (cars[j] != null) 
						{
							if (cars[j+1] != null && cars[j].compareTo(cars[j+1]) == 0) 
							{
								sum += cars[j+1].getTotal(); 
								i++; 
								continue; 
							} 
							else 
							{
								@SuppressWarnings("rawtypes")
								CarInventory newCar = new CarInventory(cars[i].getName(), sum); 
								finalCars[n] = newCar; 
								n++; 
								break; 
							}
						}
					}					
				}
			}
           
//            for (int i = 0; i < allStrings.length; i++) // for debugging 
//            {
//            	if (allStrings[i] != null) 
//            	{
//            		System.out.println(allStrings[i]); 
//            		System.out.println(allInts[i]); 
//            	}
//            	
//            }
    
        	
        	// save file 
            File problem24 = new File("Problem24Out.txt");            
			if (problem24.exists()) 			
			{
				System.out.println("File already existed."); 
				System.out.println("Overwritten."); 
//				System.exit(0); 
			}
			
			PrintWriter fileInput = new PrintWriter(problem24); 
			
			for (int i = 0; i < finalCars.length; i++)
			{				
				if (finalCars[i] != null) 
				{
					fileInput.write(finalCars[i].getName() + ""); 
					
					if (finalCars[i+1] != null && i != finalCars.length)
					{
						fileInput.write("" + ", "); 
					}				
				}
			}
			
			fileInput.write("\n" + ""); 
			
			for (int i = 0; i < finalCars.length; i++)
			{
				
				if (finalCars[i] != null) 
				{
					fileInput.write("" + finalCars[i].getTotal() + ""); 
					
					if (finalCars[i+1] != null && i != finalCars.length)
					{
						fileInput.write("" + ", "); 
					}				
				}
			}
				
			
			fileInput.close(); 
        	
        } 
        catch (Exception ex) 
        {
        	System.out.println(ex); 
        }
        
	}

	/*
	 * Problem 25
	 * 
	 * This method will read in a file. This file will contain multiple lines. Each
	 * line will contain the name of a racer and the following line will contain the
	 * number of points they have earned.
	 * 
	 * Save the information to a file with all of the racer names on one line
	 * separated by commas, and all of the points on the next line. This listed
	 * should be sorted by number of points, with the highest number appearing first
	 * 
	 * Test File: Problem25.txt Output File: Problem25Out.txt
	 */
	public void Problem25(File file) {

		String fileArr[]; 
		Integer[] allInts; 
		String[] allStrings; 
		int count = 0; 
		
        try 
        {
        	Scanner input = new Scanner(file); 
        	
        	while (input.hasNext()) 
        	{
        		input.nextLine(); 
        		count++; 
        	}
        	
        	input.close(); 
        	input = new Scanner(file); 
        	
        	fileArr = new String[count]; 
        	allInts = new Integer[count]; 
        	allStrings = new String[count]; 
        	
        	for (int i = 0; i < count; i++) 
        	{
        		fileArr[i] = input.nextLine(); 
        	}
        	
        	input.close(); 
        	
        	int k = 0; 
        	int m = 0; 
        	
        	for (int i = 0; i < count; i++) 
        	{
        		try 
        		{
        			allInts[k] = Integer.parseInt(fileArr[i]); 
            		k++; 
        		}
        		catch (Exception str) 
        		{
        			allStrings[m] = fileArr[i]; 
        			m++; 
        		}       		
        	} 
        	
//        	for (int i = 0; i < allStrings.length; i++) // for debugging 
//            {
//            	if (allStrings[i] != null) 
//            	{
//            		System.out.println(allStrings[i] + ": " + allInts[i] + ""); 
//            	}
//            	
//            }
     	
        	// Comparable extends and implements override solution to be generic was taken from 
        	// https://stackoverflow.com/questions/21544716/implementing-comparable-with-a-generic-class
        	// author: Njol 
        	// and inspired by your writing on comparables on UIS's Canvas 
			
			class Racer <T extends Racer<T>> implements Comparable<Racer<T>>
        	{
        		private String name; 
        		private int score; 
        		
        		public Racer(String userRacerName, int userScore) 
        		{
        			this.name = userRacerName; 
        			this.score = userScore; 
        		}
        		
        		public String getName() 
        		{
        			return this.name; 
        		}
        		
        		public void setName(String userName) 
        		{
        			this.name = userName; 
        		}
        		
        		public int getScore() 
        		{
        			return this.score; 
        		}
        		
        		public void setTotal(int userScore) 
        		{
        			this.score = userScore; 
        		}
        		
        		@Override
        		public int compareTo(@SuppressWarnings("rawtypes") Racer other) 
        		{
        			if (this.getScore() > other.getScore()) 
        			{
        				return 1; 
        			}
        			else if (this.getScore() < other.getScore()) 
        			{
        				return -1; 
        			}
        			
        			return 0; 	
        		}       		
        	}
        	
        	@SuppressWarnings("rawtypes") // I guess I don't quite get these generic comparables entirely yet 
			Racer[] racers = new Racer[allStrings.length]; 
        	
        	for (int i = 0; i < allStrings.length; i++) 
        	{
        		if (allStrings[i] != null && allInts[i] != null) 
        		{
        			@SuppressWarnings("rawtypes")
        			Racer racer = new Racer(allStrings[i], allInts[i]); 
        			racers[i] = racer; 
        		}       		
        	}
        	
//        	System.out.println("Before sort: "); // for debugging 
//        	for (int i = 0; i < cars.length; i++) 
//        	{
//        		if (cars[i] != null) 
//        		{
//        			System.out.println(cars[i].getName() + ", " + cars[i].getTotal() + ""); 
//        		}
//        	}
        	
        	// sort 
    		// I used this site for the insertion and selection sort pseudocode: 
    		// https://www.enjoyalgorithms.com/blog/introduction-to-sorting-bubble-sort-selection-sort-and-insertion-sort  
    		// author: Shubham Gautam 
        	
        	@SuppressWarnings("rawtypes")
        	Racer temp = null; 
        	for (int i = 0; i < racers.length; i++) 
        	{
        		if (racers[i] != null) 
        		{
        			int minInd = i; 
            		for (int j = i; j < racers.length; j++) 
            		{
            			if (racers[j] != null) 
                		{
            				if (racers[j].compareTo(racers[minInd]) > 0) 
                			{
                				minInd = j; 
                			}
                		}            			
            		}
            		
            		temp = racers[i]; 
            		racers[i] = racers[minInd]; 
            		racers[minInd] = temp; 
        		}        		
        	}
        	
        	// save file 
            File problem25 = new File("Problem25Out.txt");   
            if (problem25.exists()) 
            {
				System.out.println("File already existed."); 
				System.out.println("Overwritten."); 
//				System.exit(0); 
			}
			
			PrintWriter fileInput = new PrintWriter(problem25); 
			
			for (int i = 0; i < racers.length; i++)
			{				
				if (racers[i] != null) 
				{
					fileInput.write(racers[i].getName() + ""); 
					
					if (racers[i+1] != null && i != racers.length)
					{
						fileInput.write("" + ", "); 
					}			
				}
			}
			
			fileInput.write("\n" + ""); 
			
			for (int i = 0; i < racers.length; i++)
			{			
				if (racers[i] != null) 
				{
					fileInput.write("" + racers[i].getScore() + ""); 
					
					if (racers[i+1] != null && i != racers.length)
					{
						fileInput.write("" + ", "); 
					}				
				}
			}
							
			fileInput.close(); 
        	
        } 
        catch (Exception ex) 
        {
        	System.out.println(ex); 
        }
        
	}

	/*
	 * Problem 26
	 * 
	 * This method will accept a directory path as an argument.
	 * 
	 * Your method should find all directories within that location and save them
	 * to a file.
	 * 
	 * Output File: Problem26Out.txt
	 */
	public void Problem26(String path) {
		
		try 
		{
			File file = new File(path); 
			String filesPath = file.getPath(); 
//			System.out.println(filesPath); 
			File[] dirs = file.listFiles(); 
			File problem26 = new File("Problem26out.txt"); 
			
			PrintWriter input = new PrintWriter(problem26); 
			if (problem26.exists()) 
			{
				System.out.println("File already existed."); 
				System.out.println("Overwritten."); 
//				System.exit(0); 
			}		

			for (int i = 0; i < dirs.length; i++) 
			{
				if (dirs[i].isDirectory()) 
				{
					input.write(dirs[i] + "\n"); 
				}				
			}
			
			input.close(); 
			
		} 
		catch (Exception ex) 
		{
			System.out.println(ex); 
		}
		
	}
	/*
	 * Problem 27
	 * 
	 * This method will accept a directory path as an argument.
	 * 
	 * Your method should find all files within that location and save them
	 * to a file.
	 * 
	 * Output File: Problem27Out.txt
	 */
	public void Problem27(String path) {
		try 
		{
			File file = new File(path); 
			String filesPath = file.getPath(); 
			System.out.println(filesPath); 
			File[] allFiles = file.listFiles(); 
			File problem27 = new File("Problem27out.txt"); 
			
			PrintWriter input = new PrintWriter(problem27); 
			if (problem27.exists()) 
			{
				System.out.println("File already existed."); 
				System.out.println("Overwritten."); 
//				System.exit(0); 
			}
			
			for (int i = 0; i < allFiles.length; i++) 
			{
				if (allFiles[i].isFile()) 
				{
					input.write(allFiles[i] + "\n"); 
				}
			}
			
			input.close(); 
			
		} 
		catch (Exception ex) 
		{
			System.out.println(ex); 
		}
	}
	/*
	 * Problem 28
	 * 
	 * This method will accept a directory path as an argument.
	 * 
	 * Your method should find all directories within that location followed by all files and save them
	 * to a file.
	 * 
	 * Output File: Problem28Out.txt
	 */
	public void Problem28(String path) {
		try 
		{
			File file = new File(path); 
			String filesPath = file.getPath(); 
			System.out.println(filesPath); 
			File[] allFiles = file.listFiles(); 
			File problem28 = new File("Problem28out.txt"); 
			
			PrintWriter input = new PrintWriter(problem28); 
			if (problem28.exists()) 
			{
				System.out.println("File already existed."); 
				System.out.println("Overwritten."); 
//				System.exit(0); 
			}
			
			for (int i = 0; i < allFiles.length; i++) 
			{
				if (allFiles[i].isDirectory()) 
				{
					input.write(allFiles[i] + "\n"); 
				}				
			}
			
			for (int i = 0; i < allFiles.length; i++) 
			{
				if (allFiles[i].isFile()) 
				{
					input.write(allFiles[i] + "\n"); 
				}
			}
			
			input.close(); 
			
		} 
		catch (Exception ex) 
		{
			System.out.println(ex); 
		}
	}

}
