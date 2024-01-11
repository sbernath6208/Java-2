// Stuart Bernath	uin: 669791508 
// 4/3/23 
// 23SP-CSC275A-BL-13540 
// 

package moduleFiveLabs;

import java.util.Objects;

public class Client implements Comparable 
{
	private String firstName;
	private String lastName;
	private Integer socialSecurityNumber; 
	
	
	public Client() 
	{
		firstName = "";
		lastName = "";
		socialSecurityNumber = 0; 
		
	}

	public Client(String firstName, String lastName, Integer socialSecurityNumber) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public Integer getSocialSecurityNumber() 
	{
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(Integer socialSecurityNumber) 
	{
		this.socialSecurityNumber = socialSecurityNumber;
	}
	

	@Override
	public String toString() 
	{
		return "Client [firstName=" + firstName + ", lastName=" + lastName + ", socialSecurityNumber="
				+ socialSecurityNumber + "]";
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(socialSecurityNumber, other.socialSecurityNumber);
	}

	@Override
	public int compareTo(Object o) 
	{
		return this.getSocialSecurityNumber() - ((Client) o).getSocialSecurityNumber(); 
	} 

}
