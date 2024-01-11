// Stuart Bernath	uin: 669791508 
// 4/2/23 
// 23SP-CSC275A-BL-13540 
// 

package moduleFiveLabs;

import java.util.Objects;

public class Student implements Comparable<Student>
{
  private String firstName; 
  private String lastName; 
  private int UIN; 
  private String major;
  private String minor;
  private double GPA;

  public Student() 
  {
    setFirstName("null"); 
    setLastName("null"); 
    setUIN(0000); 
    this.major = "null";
    this.minor = "null";
    this.GPA = 0.00; 
  }

  public Student(String fName, String lName, String cMajor, String cMinor, int userUIN, double userGPA) 
  {
    setFirstName(fName); 
    setLastName(lName); 
    setUIN(userUIN); 
    this.major = cMajor;
    this.minor = cMinor;
    this.GPA = userGPA;
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

  public String getMajor() 
  {
    return this.major; 
  }

  public void setMajor(String userMajor)
  {
    this.major = userMajor; 
  }

  public String getMinor() 
  {
    return this.minor; 
  }

  public void setMinor(String userMinor)
  {
    this.minor = userMinor; 
  }

  public double getGPA() 
  {
    return this.GPA; 
  }

  public void setGPA(double userGPA)
  {
    this.GPA = userGPA; 
  }

  @Override 
  public String toString()
  {
    return "First Name: " + getFirstName() + 
      ", Last Name: " + getLastName() + 
      ", Major: " + this.major + 
      ", Minor: " + this.minor + 
      ", UIN: " + getUIN() + 
      ", GPA: " + this.GPA + "\n"; 
  }

  @Override 
  public boolean equals(Object obj) 
  {
	  if(this == obj)
	  {
		  return true; 
	  }
	  if(obj == null) 
	  {
		  return false; 
	  }
	  if(getClass() != obj.getClass())
	  {
		  return false; 
	  }
	  
	  Student other = (Student) obj; 
	  
	  return Objects.equals(firstName, other.firstName) && Objects.equals(GPA, other.GPA) && Objects.equals(lastName, other.lastName)
			  && Objects.equals(major, other.major) && Objects.equals(minor, other.minor) && Objects.equals(GPA, other.GPA)
			  && UIN == other.UIN ; 
	  
  }
  
  @Override
  public int compareTo(Student o) 
  {
	  return this.getUIN() - o.getUIN(); 
  }

}

