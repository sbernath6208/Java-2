// Stuart Bernath	uin: 669791508 
// 4/2/23 
// 23SP-CSC275A-BL-13540 
// 

package moduleFiveLabs;

import java.util.Date;

public class LabsFiveDriver 
{
//	LabsFiveDriver labsFive = new LabsFiveDriver(); 
	
	public static void main(String[] args) 
	{
		new LabsFiveDriver(); 
	}
	
	public LabsFiveDriver() 
	{
		Student firstStudent = new Student("Loser", "Kappler", "Loserdom", "guitar", 000000, 2.3); 
		Student secondStudent = new Student("Loser", "Kappler", "Loserdom", "guitar", 000001, 2.3); 
		
//		System.out.println(firstStudent.equals(secondStudent)); 
		
		Client firstClient = new Client("Loser", "Joke", 5555555); 
		Client secondClient = new Client("Dumb", "Idiot", 6666666); 
		
//		System.out.println(firstClient.compareTo(secondClient)); 
		
		Account firstAccount = new Account(firstClient, 10); 
		Account secondAccount = new Account(secondClient, 11); 
		
		System.out.println(firstAccount.compareTo(secondAccount)); 
		
		
		
	}
	
}
