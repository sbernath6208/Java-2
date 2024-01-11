// package java.math; 

public class Client
  {
    private String firstName; 
    private String lastName; 
    private int socialSecurityNumber;

    public Client()
    {
      this.firstName = ""; 
      this.lastName = ""; 
      this.socialSecurityNumber = 0; 
    }

    public Client(String fName, String lName, int userSocSecNo)
    {
      this.firstName = fName; 
      this.lastName = lName; 
      this.socialSecurityNumber = userSocSecNo; 
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
  
    public int getSocialSecurityNumber()
    {
      return this.socialSecurityNumber; 
    }
  
    public void setSocialSecurityNumber(int userSSN)
    {
      this.socialSecurityNumber = userSSN; 
    }

    public String toString()
    {
      return "First Name: " + this.firstName + ", Last Name: " + this.lastName + ", Social Security Number: " + this.socialSecurityNumber + "\n"; 
    }
    
  }
