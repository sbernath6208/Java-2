package Labs4;

import java.io.File;
import java.util.Scanner;

public class MidtermLabsDriver {
	Module4Labs module4Labs = new Module4Labs(); 
	
	public static void main(String[] args) {
		new MidtermLabsDriver();
	}

	public MidtermLabsDriver() {
		
		System.out.println("Problem 1"); 
		File file = new File("src/Labs4/Problem1.txt"); 
		System.out.println(module4Labs.Problem1(file)); 
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 2"); 
		file = new File("src/Labs4/Problem2.txt"); 
		System.out.println(module4Labs.Problem2(file)); 
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 3"); 
		file = new File("src/Labs4/Problem3.txt"); 
		System.out.println(module4Labs.Problem3(file, "gossamer")); 
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 4"); 
		file = new File("src/Labs4/Problem4.txt"); 
		System.out.println(module4Labs.Problem4(file, "so many meLlifluou Quagm Obfusca dogs")); 
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 5"); 
		file = new File("src/Labs4/Problem5.txt"); 
		String[] problem5Arr = module4Labs.Problem5(file); 
		
		for (int i = 0; i < problem5Arr.length; i++) 
		{
			System.out.println(problem5Arr[i]); 
		}
		
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 6"); 
		file = new File("src/Labs4/Problem6.txt"); 
		System.out.println("Average: " + module4Labs.Problem6(file)); 
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 7"); 
		file = new File("src/Labs4/Problem7.txt"); 
		System.out.println("Median: " + module4Labs.Problem7(file)); 
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 8"); 
		file = new File("src/Labs4/Problem8.txt"); 
		
		System.out.println("Answer: " + module4Labs.Problem8(file)); 
//		 int[] arrInts = module4Labs.Problem8(file); 
//		int count = 0; 
//		try 
//		{
//			Scanner input = new Scanner(file); 
//        	
//            while (input.hasNext()) 
//            {
//            	input.nextInt(); 
//            	count++; 
//            }
//            
//            input.close(); 
//		}
//		catch (Exception ex)
//		{
//			System.out.println(ex); 
//		}
//		
//		for (int i = 0; i < count; i++)
//		{
//			if (arrInts[i] != 0) 
//				System.out.println(arrInts[i]); 
//			}
//			
//		}
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 9"); 
		file = new File("src/Labs4/Problem9.txt"); 
		System.out.println("Total number of As: " + module4Labs.Problem9(file)); 
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 10"); 
		file = new File("src/Labs4/Problem10.txt"); 
		System.out.println("Total number of 'er's: " + module4Labs.Problem10(file)); 
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 11"); 
		file = new File("src/Labs4/Problem11.txt"); 
		System.out.println("Sum of all ints: " + module4Labs.Problem11(file)); 
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 12"); 
		file = new File("src/Labs4/Problem12.txt"); 
		System.out.println("Total unique words: " + module4Labs.Problem12(file)); 
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 13"); 
		file = new File("src/Labs4/Problem13.txt"); 
		System.out.println("Total of true doubles: " + module4Labs.Problem13(file)); 
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 14"); 
		file = new File("src/Labs4/Problem14.txt"); 
		System.out.println("Absolute difference: " + module4Labs.Problem14(file)); 
		// should be 24.1016 with original file 
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 15"); 
		file = new File("src/Labs4/Problem15.txt"); 
		System.out.println("Product of all true sums: " + module4Labs.Problem15(file)); 
		System.out.println("------------------------------------------------------------------\n\n"); 
		
//		File smells = new File("smells"); 
//		System.out.println(smells.getAbsolutePath()); 
		System.out.println("Problem 16"); 
		
		module4Labs.Problem16();  
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 17"); 
		
		module4Labs.Problem17();  
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 18"); 
		String[] userStrs = new String[] {"dog", "cat", "mouse", "hamster", "reptile", "bird", "horse"}; 
		
		module4Labs.Problem18(userStrs);  
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 19"); 
		int[] userInts = new int[] {1,2,3,4,5,6,7,8,9,10}; 
		module4Labs.Problem19(userInts);  
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 20"); 
		file = new File("src/Labs4/Problem20.txt"); 
		System.out.println("Sum total: " + module4Labs.Problem20(file)); 
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 21"); 
		file = new File("src/Labs4/Problem21.txt"); 
		module4Labs.Problem21(file); 
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 22"); 
		file = new File("src/Labs4/Problem22.txt"); 
		module4Labs.Problem22(file); 
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 23"); 
		file = new File("src/Labs4/Problem23.txt"); 
		module4Labs.Problem23(file); 
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 24"); 
		file = new File("src/Labs4/Problem24.txt"); 
		module4Labs.Problem24(file); 
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 25"); 
		file = new File("src/Labs4/Problem25.txt"); 
		module4Labs.Problem25(file); 
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 26"); 
		module4Labs.Problem26("c:\\Users\\sbern"); 
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 27"); 
		module4Labs.Problem27("c:\\Users\\sbern"); 
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		System.out.println("Problem 28"); 
		module4Labs.Problem28("c:\\Users\\sbern"); 
		System.out.println("------------------------------------------------------------------\n\n"); 
		
		
	}

}
