// Stuart Bernath	uin: 669791508 
// 2/7/23 
// 23SP-CSC275A-BL-13540 
// 
  public class IntegerArrayHelper 
  {
    private Integer[] myArray; 
    private int size; 

    public IntegerArrayHelper() 
    {
      this.myArray = new Integer[10]; 
      this.size = myArray.length; 
      
    }
    
    // I would prefer the parameter to be an int array, 
    // but the assignment clearly states it is a String 
    // array. 
    public IntegerArrayHelper(String[] userArr) 
    {
      for (int i = 0; i < this.size; i++) 
      {
        this.myArray[i] = Integer.parseInt(userArr[i]); 
      }
      
      this.size = myArray.length; 
    }
    

    public Boolean addItem(int userInt)
    {
      Boolean addedFlag = false; 
      
      if (this.myArray[this.size - 1] == null) 
      {
        for (int i = 0; i < this.size; i++)
        {
          if (this.myArray[i] == null)
          {
            this.myArray[i] = userInt; 
            addedFlag = true; 
            System.out.println(userInt + " added."); 
            break; 
          }
        }
      }
      else 
      {
        System.out.println("Array already full.  Please delete an integer and try again."); 
        addedFlag = false; 
      }
      
      return addedFlag; 
    }
    

    public Boolean removeItem(int userInt)
    {
      Boolean removedFlag = false; 
      Integer[] copiedArr = new Integer[this.size]; 
      int j = 0; 
      
      
      for (int i = 0; i < this.size; i++)
      {
        if(this.myArray[i] != null)
		  {
          if (this.myArray[i] != userInt)
          {
            copiedArr[j] = this.myArray[i];
            j++; 
          }
          else if (this.myArray[i] == userInt)
          {
            System.out.println(userInt + " deleted."); 
            removedFlag = true; 
          }
        }
        
      }
      if (removedFlag)
      {
        copiedArr[this.size - 1] = null; 
      }
      
      if (!removedFlag)
      {
        System.out.println(userInt + " not found."); 
      }

      for (int i = 0; i < this.size; i++)
      {
        this.myArray[i] = copiedArr[i]; 
      }
      
      return removedFlag; 
    }

    
    public Boolean searchItem(int userInt)
    {
  		Boolean found = false; 
  		
  		for (int i = 0; i < this.size; i++)
  		{
        if(this.myArray[i] != null)
			  {
          if(myArray[i] == userInt)
          {
            found = true; 
            break; 
          }
        }
  		}
      
  		return found; 

    }

    
    public Boolean sortArray() 
    {
      // sort 
  		// I used this web site to help me understand the selection sort 
  		// as well as for the pseudocode: 
  		// https://www.enjoyalgorithms.com/blog/introduction-to-sorting-bubble-sort-selection-sort-and-insertion-sort 
  		// The author is Shubham Gautam. 
  		int tmp = 0; 
  		int compared; 
      Boolean isSorted = true; 
  		
  		for (int i = 0; i < this.size; i++)
  		{
        if(this.myArray[i] != null)
			  {
          int lowestIndex = i; 
          
          for (int j = i; j < this.size; j++)
          {
            if(this.myArray[j] != null)
			      {
              if (this.myArray[j] < this.myArray[lowestIndex]) 
              {
                lowestIndex = j; 
                isSorted = false; 
              }
            }
          }
          
          tmp = this.myArray[i]; 
          this.myArray[i] = this.myArray[lowestIndex]; 
          this.myArray[lowestIndex] = tmp; 
        }
  		}

      return isSorted; 
    }

    
    public int getSize() 
    {
      int totalInts = 0; 
      
      for (int i = 0; i < this.size; i++) 
      {
        if (this.myArray[i] != null)
        {
          totalInts++; 
        }
      }

      return totalInts; 
    }

    
    public int getCapacity() 
    {
      return this.size; 
    }

    
    public String toString() 
    {
      StringBuilder buildStr = new StringBuilder(); 
      
      for (int i = 0; i < this.myArray.length; i++)
      {
        if (this.myArray[i] != null)
        {
          buildStr.append(this.myArray[i]); 
          if (i != this.myArray.length - 1)
          {
            if (this.myArray[i+1] != null)
            {
              buildStr.append(", "); 
            }
          }
        }
        
        
      }

      String finalString = buildStr.toString(); 

      return finalString; 
    }

  }


