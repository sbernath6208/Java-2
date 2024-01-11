package Labs.Module8;

import java.util.ArrayList;
import java.util.Random;

public class Module8Driver {
	Module8Labs module8Labs = new Module8Labs(); 
	
	public static void main (String args[]) 
	{
		new Module8Driver(); 
	}
	
	public Module8Driver() 
	{
//		module8Labs.addInts(); 
		
//		module8Labs.addStrings(); 
		
		int size = 0; 
		
		Node<Integer> firstNode = new Node(Integer.parseInt("3"), null); 
		Node<Integer> lastOne = firstNode; 
		size++; 
		
		Random randInt = new Random(); 
		
		for (int i = 1; i < 12; i++) 
		{
			Integer thisInt = randInt.nextInt(100); 
			Node<Integer> nextNode = new Node(thisInt, null); 
			lastOne.setNext(nextNode);
			lastOne = nextNode; 
			size++; 
		} 
//
//		Node<Integer> thisOne = firstNode; 
//	
//		for (int i = 0; i < size; i++)
//		{
//			System.out.println(thisOne.getItem()); 
//			thisOne = thisOne.getNext(); 
//		}
		
//		module8Labs.removeInts(firstNode); 
		
		
//		String[] strList = new String[] {"dog", "cat", "mouse", "deer", "gorilla", "Zebra", "Bear", "HAMSTER", "lion", "Tiger", "liZard", "FLY", "spideR", "cougar"};
//		String[] strList = new String[] {"Zebra", "Tiger", "FLY", "spideR", "mouse", "dog", "HAMSTER", "deer", "gorilla", "Bear", "lion", "liZard", "cougar", "cat"}; 
//
//	 
//		Node<String> firstNode = new Node(strList[0], null); 
//		Node<String> lastOne = firstNode; 
//		
//		for (int i = 1; i < strList.length; i++) 
//		{
//			String thisOne = strList[i]; 
//			Node<String> nextNode = new Node(thisOne, null); 
//			lastOne.setNext(nextNode);
//			lastOne = nextNode; 
//		}
//		
//		module8Labs.removeStrings(firstNode); 
				
		module8Labs.sortIntegers(firstNode);
		
//		System.out.println("\n\nTotal sevens: " + module8Labs.countNumbersWith7(firstNode)); 
		
		Node<String> itemsToSearch = new Node<String>(null, null); 
		Node<String> searchItems = new Node<String>(null, null); 
		String[] strList = new String[] {"dog", "cat", "mouse", "deer", "gorilla", "Zebra", "Bear", "HAMSTER", "lion", "Tiger", "liZard", "FLY", "spideR", "cougar"};
//		String[] strList = new String[] {"dog", "cat", "mouse", "HAMSTER", "cougar"};
		String[] searchList = new String[] {"dog", "cat", "hamster", "cougar"}; 
//		String[] strList = new String[] {"dog", "cougar"};
//		String[] searchList = new String[] {"dog", "cougar"}; 
//		
//		Node<String> firstNode = new Node(strList[0], null); 
//		Node<String> lastOne = firstNode; 
//		
//		for (int i = 1; i < strList.length; i++) 
//		{
//			String thisOne = strList[i]; 
//			Node<String> nextNode = new Node(thisOne, null); 
//			lastOne.setNext(nextNode);
//			lastOne = nextNode; 
//		}
//		
//		itemsToSearch = firstNode; 
//		
//		firstNode = new Node(searchList[0], null); 
//		lastOne = firstNode; 
//		
//		for (int i = 1; i < searchList.length; i++) 
//		{
//			String thisOne = searchList[i]; 
//			Node<String> nextNode = new Node(thisOne, null); 
//			lastOne.setNext(nextNode);
//			lastOne = nextNode; 
//		}
//		
//		searchItems = firstNode; 
		
//		module8Labs.findTheString(itemsToSearch, searchItems);
		
//		ArrayList<String> sentences = new ArrayList<String>(); 
//		sentences.add("eat my dog treats"); 
//		sentences.add("eat them now"); 
//		sentences.add("yum good tasty"); 
//		sentences.add("all gone, no more"); 
//		
//		firstNode = new Node(sentences.get(0), null); 
//		lastOne = firstNode; 
//		
//		for (int i = 1; i < sentences.size(); i++) 
//		{
//			String thisOne = sentences.get(i); 
//			Node<String> nextNode = new Node(thisOne, null); 
//			lastOne.setNext(nextNode);
//			lastOne = nextNode; 
//		}
//		
//		Node<String> replaceSpaces = firstNode; 
		
//		module8Labs.replaceSpaces(replaceSpaces); 
		
//		Node<String> prob6 = itemsToSearch; 
		
//		module8Labs.sortStrings(prob6); 
		
		
//		String[] strPList = new String[] {"ooopyoop", "oopsp", "fffffffPPP", "pog", "qqqqqqqqppqqp", "eeeeeeeeeeeeeppwwpw", "eeeeeeepeee", "nononPapa", "opet", "Ppot", "OPEN", "zzzzzzzzzpzpz", "uuup2", "yyyyyyyyyypp"};
//		firstNode = new Node(strPList[0], null); 
//		lastOne = firstNode; 
//		
//		for (int i = 1; i < strPList.length; i++) 
//		{
//			String thisOne = strPList[i]; 
//			Node<String> nextNode = new Node(thisOne, null); 
//			lastOne.setNext(nextNode);
//			lastOne = nextNode; 
//		}
//		
//		module8Labs.sortP(firstNode); 
	
	}
}
