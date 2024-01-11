// Stuart Bernath	uin: 669791508 
// 4/3/23 
// 23SP-CSC275A-BL-13540 
// 

package moduleFiveLabs;

import java.util.Objects;

public class GraduateStudent implements Comparable<GraduateStudent>
{

  private String firstName; 
  private String lastName; 
  private int UIN; 
  private String major;
  private String minor;
  private double GPA;
  private String type = "Graduate Student"; 

  public GraduateStudent() 
  {
    setFirstName("null"); 
    setLastName("null"); 
    setUIN(0000); 
    setMajor("null");
    setMinor("null");
    setGPA(0.00);
  }

  public GraduateStudent(String fName, String lName, String cMajor, String cMinor, int userUIN, double userGPA) 
  {
    setFirstName(fName); 
    setLastName(lName); 
    setUIN(userUIN);
    setMajor(cMajor);
    setMinor(cMinor);
    setGPA(userGPA);
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


  public double calculateFinalGrade(double examOne, double examTwo, double examThree) 
  {
    double finalGrade = (examOne * 0.25) + (examTwo * 0.25) + (examThree * 0.5);

    return finalGrade;
  }

  public String toString() 
  {
    return ("Type: " + this.type + 
      ", First Name: " + getFirstName() + 
      ", Last Name: " + getLastName() + 
      ", Major: " + getMajor() + 
      ", Minor: " + getMinor() + 
      ", UIN: " + getUIN() + 
      ", GPA: " + getGPA() + "\n"); 
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
		GraduateStudent other = (GraduateStudent) obj;
		return Double.doubleToLongBits(GPA) == Double.doubleToLongBits(other.GPA) && UIN == other.UIN
				&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(major, other.major) && Objects.equals(minor, other.minor);
  }

	@Override
	public int compareTo(GraduateStudent o) 
	{
		return this.getUIN() - o.getUIN(); 
	}
  

}

