package LabsOne;

import java.util.Random;

public class LabsDriver {
	Module1Labs module1Labs = new Module1Labs(); 
	
	 public static void main(String[] args) 
	 {
		 new LabsDriver(); 
		 
	 }
	 
	 public LabsDriver() 
	 {

		 System.out.println("Problem 1"); 
		 int[] arrOne = module1Labs.Problem1(5); 
		 for (int i = 0; i < arrOne.length; i++)
		 {
			 System.out.println(arrOne[i]);
		 }
		 
	     System.out.println("\n\n\n"); 
	     
	     
	     System.out.println("Problem 2");
	     int[] arrTwo = module1Labs.Problem2(); 
		 for (int i = 0; i < arrTwo.length; i++)
		 {
			 System.out.println(arrTwo[i]);
		 }
		 
		 System.out.println("\n\n\n"); 
		 
		 
		 
		 System.out.println("Problem 3");
	     int[] arrThree = module1Labs.Problem3(); 
		 for (int i = 0; i < arrThree.length; i++)
		 {
			 System.out.println(arrThree[i]);
		 }
		 
		 System.out.println("\n\n\n"); 
		 
		 
		 
		 System.out.println("Problem 4");
	     int[] arrFour = module1Labs.Problem4(); 
		 for (int i = 0; i < arrFour.length; i++)
		 {
			 System.out.println(arrFour[i]);
		 }
		 
		 System.out.println("\n\n\n"); 
		 
		 
		 
		 
		 System.out.println("Problem 5");
		 int[] arrFive = new int[] {1, 5, 2, 3, 5, 6, 7, 8, 6, 7, 7, 3, 2, 4, 6, 7, 7, 3, 8, 0}; 
	     int totalFive = module1Labs.Problem5(arrFive); 
		 
		 System.out.println(totalFive);
		 
		 System.out.println("\n\n\n"); 
		 
		 
		 
		 
	    System.out.println("Problem 6");
	    Random num = new Random(java.lang.System.currentTimeMillis()); 
	  
	    int[] numArr = new int[5]; 
	    int[] numArrTwo = new int[5]; 
	    
	    for (int i = 0; i < numArr.length; i++) 
	    {
	        numArr[i] = num.nextInt(10) + 1; 
	    }
	   
	    for (int i = 0; i < numArrTwo.length; i++) 
	    {
	        numArrTwo[i] = num.nextInt(10) + 1; 
	    }
		    
	     int[] arrSix = module1Labs.Problem6(numArr, numArrTwo); 
		 
	     for (int i = 0; i < arrSix.length; i++)
	     {
	    	 System.out.println(arrSix[i]); 
	     }
		 
		 System.out.println("\n\n\n"); 
		 
		 
		 
		 
		 
		 System.out.println("Problem 7");
		    
		    int[] numArrSev = new int[5]; 
		    int[] numArrTwoSev = new int[5]; 
		    int j = 0; 
		    int k = 1; 
		    int l = 0; 
		   
		    for (int i = 0; i < numArrSev.length; i++) 
		    {
		        numArrSev[i] = j; 
		        j += 2; 
		    }
		   
		    for (int i = 0; i < numArrTwoSev.length; i++) 
		    {
		        numArrTwoSev[i] = k; 
		        k += 2; 
		    }
			    
		     int[] arrSeven = module1Labs.Problem7(numArrSev, numArrTwoSev); 
			 
		     for (int i = 0; i < arrSeven.length; i++)
		     {
		    	 System.out.println(arrSeven[i]); 
		     }
			 
			 System.out.println("\n\n\n"); 
			 
			 
			 
			 System.out.println("Problem 8"); 
			 
			 int[] numArrEight = new int[3]; 
			 int[] numArrTwoEight = new int[5]; 
			 int jj = 0; 
			 int kk = 1; 
			    
			 for (int i = 0; i < numArrEight.length; i++) 
		    {
		        numArrEight[i] = jj; 
		        jj += 2; 
		    }
		   
		    for (int i = 0; i < numArrTwoEight.length; i++) 
		    {
		        numArrTwoEight[i] = kk; 
		        kk += 2; 
		    }   
		    
		    int[] arrEight = module1Labs.Problem8(numArrEight, numArrTwoEight); 
			 
		     for (int i = 0; i < arrEight.length; i++)
		     {
		    	 System.out.println(arrEight[i]); 
		     }
			 
			 System.out.println("\n\n\n"); 
			 
			 
			 
			 
			 System.out.println("Problem 9"); 
			 Random numNine = new Random(java.lang.System.currentTimeMillis()); 
			  
		    int[] numArrNine = new int[30]; 
		    
		    for (int i = 0; i < numArrNine.length; i++) 
		    {
		        numArrNine[i] = numNine.nextInt(2) + 1; 
		         
		    }
		    
		    int[] arrNine = module1Labs.Problem9(numArrNine); 
			 
		     for (int i = 0; i < arrNine.length; i++)
		     {
		    	 System.out.println(arrNine[i]); 
		     }
			 
			 System.out.println("\n\n\n"); 
			 
			 
			 
			 System.out.println("Problem 10"); 
			 String[] stringArrTen = new String[]{"pizza", null, "hamburger", "milk", null, null, "eggs", null, "beans", "peas"}; 
			 
			 String stringTen = module1Labs.Problem10(stringArrTen); 
			 
		     System.out.println(stringTen); 
		     
			 System.out.println("\n\n\n"); 
			 
			 
			 
			 System.out.println("Problem 11"); 
			 String[] stringArrEleven = new String[]{"pizza", null, "hamburger", "milk", null, null, "eggs", null, "beans", "peas"}; 
			 
			 String[] arrEleven = module1Labs.Problem11(stringArrEleven); 
			 
		     for (int i = 0; i < arrEleven.length; i++)
		     {
		    	 System.out.println(arrEleven[i]); 
		     }
			 
			 System.out.println("\n\n\n"); 
			 
			 
			 
			 System.out.println("Problem 12"); 
			 int[] numArrTwelve = new int[10]; 
			 for (int i = 0; i < numArrTwelve.length; i++) 
		    {
		      numArrTwelve[i] = (i + 1) * 3 ;
		    }
			 
			 int[] arrTwelve = module1Labs.Problem12(numArrTwelve); 
			 
		     for (int i = 0; i < arrTwelve.length; i++)
		     {
		    	 System.out.println(arrTwelve[i]); 
		     }
			 
			 System.out.println("\n\n\n"); 
			 
			 
			 
			 System.out.println("Problem 13"); 
			 int[] numArr13 = new int[10];
			 
			 for (int i = 0; i < numArr13.length; i++) 
		    {
		      numArr13[i] = (i + 1);
		    }
			 
			 int[] arr13 = module1Labs.Problem13(numArr13, 4); 
			 
		    
			 
		     for (int i = 0; i < arr13.length; i++)
		     {
		    	 System.out.println(arr13[i]); 
		     }
			 
			 
			 System.out.println("\n\n\n"); 
			 
			 
			 
			 
			 System.out.println("Problem 14"); 
			 int[] numArr14 = new int[5];
			 
			 for (int i = 0; i < numArr14.length; i++) 
		    {
		      numArr14[i] = (i + 1);
		    }
			 
			 int[] arr14 = module1Labs.Problem14(numArr14, 7); 
			 
			 
		     for (int i = 0; i < arr14.length; i++)
		     {
		    	 System.out.println(arr14[i]); 
		     }
			 
			 System.out.println("\n\n\n"); 
			 
			 
			 
			 
			 System.out.println("Problem 15"); 
			 int[] numArr15 = new int[10]; 
			 
			 for (int i = 0; i < numArr15.length; i++)
		    {
		      numArr15[i] = (i + 1);
		    }
			 
			 int[] arr15 = module1Labs.Problem15(numArr15, -2); 
			 
			 
		     for (int i = 0; i < arr15.length; i++)
		     {
		    	 System.out.println(arr15[i]); 
		     }
		     System.out.println("\n\n\n"); 
			 
			 
		     
		     System.out.println("Problem 16"); 
		     String newStr16 = "JAVa is my favorite language JAVA java JaVa!"; 
		     
		     Boolean answer16 = module1Labs.Problem16(newStr16); 
		     System.out.println(answer16); 
		 
		     System.out.println("\n\n\n"); 
		     
		     
		     
		     System.out.println("Problem 17"); 
		     String newStr17 = " is my favorite JAVA language ava !"; 
		     
		     Boolean answer17 = module1Labs.Problem17(newStr17); 
		     System.out.println(answer17); 
		     
		     
		     System.out.println("\n\n\n"); 
		     
		     
		     
		     System.out.println("Problem 18");
		     
		     String newStr18 = " is my favorite language JAVA"; 
		     
		     Boolean answer18 = module1Labs.Problem18(newStr18); 
		     System.out.println(answer18); 
		     
		     
		     System.out.println("\n\n\n"); 
		     
		     
		     
		     
		     System.out.println("Problem 19"); 
		     
		     String newStr19 = "I did it my own way";
			 String oneOff19 = "i dod it my own way"; 
			   
			 Boolean answer19 = module1Labs.Problem19(newStr19, oneOff19); 
		     System.out.println(answer19); 
		     
		     
		     System.out.println("\n\n\n"); 
		     
		     
		     
		     
		     System.out.println("Problem 20"); 
		     String newStr20 = "I DeD IT MY OWN eAY  ";
			 String capStr20 = "I DID IT MY OWN WAY"; 
		     
			 int answer20 = module1Labs.Problem20(newStr20, capStr20); 
		     System.out.println(answer20); 
		     
		     
		     System.out.println("\n\n\n"); 
		     
		     
		     
		     
		     System.out.println("Problem 21"); 
		     
		     String caesarCypher21 = "J MPWF KBWB"; 
		     String answer21 = module1Labs.Problem21(caesarCypher21); 
		     System.out.println(answer21); 
		     
		     System.out.println("\n\n\n"); 
		     
		     
		     
		     
		     System.out.println("Problem 22"); 
		     String caesarCypher22 = "I LOVE JAVA"; 
		     
		     String answer22 = module1Labs.Problem22(caesarCypher22); 
		     System.out.println(answer22); 
		     
		     System.out.println("\n\n\n"); 
		     
		     
		     
		     
		     System.out.println("Problem 23"); 
		     
		     String caesarCypher23 = "I LOVE JAVA"; 
		     
		     String answer23 = module1Labs.Problem23(caesarCypher23, 3); 
		     System.out.println(answer23); 
		     
		     System.out.println("\n\n\n"); 
		     
		     
		     
		     
		     System.out.println("Problem 24"); 
		     double newDbl24 = 56.7294; 
		     int newInt24 = module1Labs.Problem24(newDbl24); 
		     System.out.println(newInt24); 
		     
		     System.out.println("\n\n\n"); 
		     
		     
		     
		     
		     System.out.println("Problem 25"); 
		     double newDbl25 = 56.2294; 
		     int newInt25 = module1Labs.Problem25(newDbl25); 
		     System.out.println(newInt25); 
		     
		     System.out.println("\n\n\n"); 
		     
		     
		     
		     
		     System.out.println("Problem 26"); 
		
		     double newDbl26 = 56.5294; 
		     int newInt26 = module1Labs.Problem26(newDbl26); 
		     System.out.println(newInt26
		    		 ); 
		     
		     System.out.println("\n\n\n"); 
		     
		     
		     
		     
		     System.out.println("Problem 27"); 
		     int divisibleInt27 = 20; 
		     Boolean bool27 = module1Labs.Problem27(divisibleInt27); 
		     System.out.println(bool27); 
		     
		     System.out.println("\n\n\n"); 
		     
		     
		     
		     
		     System.out.println("Problem 28"); 
		     int divisibleInt28 = 40; 
		     Boolean bool28 = module1Labs.Problem28(divisibleInt28); 
		     System.out.println(bool28); 
		     
		     System.out.println("\n\n\n"); 
		     
		     
		     
		     
		     System.out.println("Problem 29"); 
		    int one = 5; 
		    int two = 10;
		    int three = 16; 
		    int four = 20; 
		    Boolean bool29 = module1Labs.Problem29(one, two, three, four); 
		     System.out.println(bool29); 
		     
		     System.out.println("\n\n\n");
		     
		     
		     
		     
		     System.out.println("Probem 30"); 
		     int[] arr30 = new int[]{0, 9, 5, 0, 1, 2, 3, 4, 5, 6, 2, 3, 9, 1, 0, 6, 5, 4, 3, 2, 1, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8} ; //14
		     
		     int newInt30 = module1Labs.Problem30(arr30); 
		     System.out.println(newInt30 ); 
		     
		     System.out.println("\n\n\n"); 
		     
	
		     
			 
	     
	 }
     
     
}
