// Stuart Bernath	uin: 669791508 
// 2/7/23 
// 23SP-CSC275A-BL-13540 
// 

  public class Student {
    private String firstName;
    private String lastName;
    private String major;
    private String minor;
    private int UIN;
    private double GPA;

    public Student() {
      this.firstName = "";
      this.lastName = "";
      this.major = "";
      this.minor = "";
      this.UIN = 0;
      this.GPA = 0.00;
    }

    public Student(String fName, String lName, String cMajor, String cMinor, int userUIN, double userGPA) {
      this.firstName = fName;
      this.lastName = lName;
      this.major = cMajor;
      this.minor = cMinor;
      this.UIN = userUIN;
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

    public int getUIN() 
    {
      return this.UIN; 
    }

    public void setUIN(int userUIN)
    {
      this.UIN = userUIN; 
    }

    public double getGPA() 
    {
      return this.GPA; 
    }

    public void setGPA(double userGPA)
    {
      this.GPA = userGPA; 
    }

    public String toString()
    {
      return "First Name: " + this.firstName + 
        ", Last Name: " + this.lastName + 
        ", Major: " + this.major + 
        ", Minor: " + this.minor + 
        ", UIN: " + this.UIN + 
        ", GPA: " + this.GPA + "\n"; 
    }

  }
