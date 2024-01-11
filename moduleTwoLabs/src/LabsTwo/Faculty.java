// Stuart Bernath	uin: 669791508 
// 2/7/23 
// 23SP-CSC275A-BL-13540 
// 
  public class Faculty
  {
    private String firstName; 
    private String lastName; 
    private String department; 
    private int UIN; 

    public Faculty()
    {
      this.firstName = ""; 
      this.lastName = ""; 
      this.department = ""; 
      this.UIN = 0; 
    }

    public Faculty(String fName, String lName, String userDept, int userUIN)
    {
      this.firstName = fName; 
      this.lastName = lName; 
      this.department = userDept; 
      this.UIN = userUIN; 
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

    public String getDepartment()
    {
      return this.department; 
    }

    public void setDepartment(String userDept)
    {
      this.department = userDept; 
    }

    public int getUIN()
    {
      return this.UIN; 
    }

    public void setUIN(int userUIN)
    {
      this.UIN = userUIN; 
    }

    public String toString()
    {
      return "First Name: " + this.firstName + ", Last Name: " + this.lastName + ", Department: " + this.department + ", UIN: " + this.UIN + "\n"; 
    }
    
  }