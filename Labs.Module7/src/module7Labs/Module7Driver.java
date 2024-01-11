package module7Labs;

import java.util.ArrayList; 

public class Module7Driver 
{
	Module7Labs module7Labs = new Module7Labs(); 
	
	public static void main (String args[]) 
	{
		new Module7Driver(); 
	}
	
	public Module7Driver() 
	{
//		module7Labs.addInts(); // 1 
		
//		module7Labs.addStrings(); // 2 
		
		ArrayList<Integer> nums = new ArrayList<Integer>(); 
//		nums.add(2); nums.add(12); nums.add(3); nums.add(14); nums.add(157); nums.add(17); 
//		nums.add(7); nums.add(88); nums.add(108); nums.add(10); nums.add(11); nums.add(19); 
//		 nums.add(68);    nums.add(6); nums.add(77);
		 // 123, 123, 41, 345, 654, 76, 3, 777, 17
		nums.add(123); nums.add(123); nums.add(41); nums.add(345); nums.add(654); 
		nums.add(76); nums.add(3); nums.add(777); nums.add(17);
//		module7Labs.removeInts(nums); // 3 
		
		ArrayList<String> strs = new ArrayList<String>(); 
		strs.add("talk"); 
		strs.add("thisOne"); 
		strs.add("get"); 
		strs.add("if it"); 
		strs.add("nice"); 
		strs.add("like"); 
		strs.add("milk"); 
		strs.add("acid"); 
		strs.add("tank"); 
		strs.add("zebra"); 
		strs.add("hose"); 
		strs.add("lawn"); 
		strs.add("gas"); 
//		module7Labs.removeStrings(strs); // 4 
		
//		module7Labs.sortIntegers(nums); // 5 
		
//		ArrayList<String> strs = new ArrayList<String>(); 
		
//		module7Labs.sortStrings(strs); // 6 
		
//		System.out.println(module7Labs.countNumbersWith7(nums)); // 7 
		ArrayList<String> strFind = new ArrayList<String>(); 
		strFind.add("gas"); 
		strFind.add("talk"); 
		strFind.add("milk"); 
		
//		System.out.println(module7Labs.findTheString(strs, strFind)); // 8 
		
		ArrayList<String> sentences = new ArrayList<String>(); 
		sentences.add("eat my dog treats"); 
		sentences.add("eat them now"); 
		sentences.add("yum good tasty"); 
		sentences.add("all gone, no more"); 
		
		ArrayList<String> answer9 = module7Labs.replaceSpaces(sentences); // 9 
		
		for (String str : answer9)
		{
			System.out. println(str);
		}
		
		ArrayList<String> strs2 = new ArrayList<String>(); 
		strs2.add("talkpiiiiipp"); 
		strs2.add("thisOnep"); 
		strs2.add("geptoooooop"); 
		strs2.add("ipf it"); 
		strs2.add("pniceooppp"); 
		strs2.add("likpe"); 
		strs2.add("milkitp"); 
		strs2.add("acidarrowp"); 
		strs2.add("tankdarttwop"); 
		strs2.add("zebrap"); 
		strs2.add("phose"); 
		strs2.add("lawnonthedoorp"); 
		strs2.add("gaps"); 
		
//		module7Labs.sortP(strs2); // 10 
		
		
	}
	
}
