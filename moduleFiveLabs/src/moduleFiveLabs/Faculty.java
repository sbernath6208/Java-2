// Stuart Bernath	uin: 669791508 
// 4/2/23 
// 23SP-CSC275A-BL-13540 
// 
package moduleFiveLabs;

import java.util.Objects;

public class Faculty implements Comparable<Faculty>
{
  private String firstName; 
  private String lastName; 
  private int UIN; 
  private String type = "Faculty"; 
  private String department; 

  public Faculty()
  {
    setFirstName("null"); 
    setLastName("null"); 
    setUIN(0000); 
    this.department = "null"; 
  }

  public Faculty(String fName, String lName, String userDept, int userUIN)
  {
    setFirstName(fName); 
    setLastName(lName); 
    setUIN(userUIN); 
    this.department = userDept;
  }
  

  public String getFirstName() 
  {
    return this.firstName; 
  }

  public void setFirstName(String fName)
  {
    this.firstName = fName; 
  }

  public String getLastName() 
  {
    return this.lastName; 
  }

  public void setLastName(String lName)
  {
    this.lastName = lName; 
  }

  public int getUIN() 
  {
    return this.UIN; 
  }

  public void setUIN(int userUIN)
  {
    this.UIN = userUIN; 
  }

  public String getDepartment()
  {
    return this.department; 
  }

  public void setDepartment(String userDept)
  {
    this.department = userDept; 
  }

  @Override 
  public String toString()
  {
    return "Type: " + this.type + 
      ", First Name: " + getFirstName() + 
      ", Last Name: " + getLastName() + 
      ", Department: " + this.department + 
      ", UIN: " + getUIN() + "\n"; 
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
		
		Faculty other = (Faculty) obj;
		
		return UIN == other.UIN && Objects.equals(department, other.department)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
	}

@Override
  public int compareTo(Faculty o) 
  {
	  return this.getUIN() - o.getUIN();
  }
  
}
