// Stuart Bernath	uin: 669791508 
// 2/7/23 
// 23SP-CSC275A-BL-13540 
// 
  public class Staff 
  {
    private String firstName; 
    private String lastName; 
    private String department; 
    private String title; 
    private int UIN; 

    public Staff()
    {
      this.firstName = ""; 
      this.lastName = ""; 
      this.department = ""; 
      this.title = ""; 
      this.UIN = 0; 
    }

    public Staff(String fName, String lName, String userDept, String userTitle, int userUIN)
    {
      this.firstName = fName; 
      this.lastName = lName; 
      this.department = userDept; 
      this.title = userTitle; 
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

    public String getTitle()
    {
      return this.title; 
    }

    public void setTitle(String userTitle)
    {
      this.title = userTitle; 
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
      return "First Name: " + this.firstName + ", Last Name: " + this.lastName + ", Department: " + this.department + ", Title: " + this.title + ", UIN: " + this.UIN + "\n"; 
    }
  }