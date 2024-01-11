// Stuart Bernath	uin: 669791508 
// 2/7/23 
// 23SP-CSC275A-BL-13540 
// 
  public class Pet 
  {
    private String name; 
    private int age; 
    private String color; 

    public Pet() 
    {
      this.name = ""; 
      this.age = 0; 
      this.color = ""; 
    }

    public Pet(String userName, int userAge, String userColor) 
    {
      this.name = userName; 
      this.age = userAge; 
      this.color = userColor; 
    }

    public String getName() 
    {
      return this.name; 
    }

    public void setName(String userName) 
    {
      this.name = userName; 
    }

    public int getAge() 
    {
      return this.age; 
    }

    public void setAge(int userAge) 
    {
      this.age = userAge; 
    }

    public String getColor() 
    {
      return this.color; 
    }

    public void setColor(String userColor) 
    {
      this.color = userColor; 
    }

    public String toString() 
    {
      return "Name: " + this.name + ", Age: " + this.age + ", Color: " + this.color + "\n"; 
    }

  }
