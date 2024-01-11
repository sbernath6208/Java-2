// Stuart Bernath	uin: 669791508 
// 2/7/23 
// 23SP-CSC275A-BL-13540 
// 
// package java.math; 

public class Dog  
  {
    private String name; 
    private int age; 
    private String color; 
    private String breed; 
    private double weight; 

    public Dog() 
    {
      this.name = ""; 
      this.age = 0; 
      this.color = ""; 
      this.breed = ""; 
      this.weight = 0.0; 
    }

    public Dog(String userName, int userAge, String userColor, String userBreed, double userWeight) 
    {
      this.name = userName; 
      this.age = userAge; 
      this.color = userColor; 
      this.breed = userBreed; 
      this.weight = userWeight; 
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

    public String getBreed() 
    {
      return this.breed; 
    }

    public void setBreed(String userBreed) 
    {
      this.breed = userBreed; 
    }

    public double getWeight() 
    {
      return this.weight; 
    }

    public void setWeight(double userWeight) 
    {
      this.weight = userWeight; 
    }

    public String toString() 
    {
      return "Name: " + this.name + ", Age: " + this.age + ", Color: " + this.color + ", Breed: " + this.breed + ", Weight: " + this.weight + "\n"; 
    }

  }

