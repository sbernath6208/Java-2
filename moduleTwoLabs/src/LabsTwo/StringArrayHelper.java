
// Stuart Bernath	uin: 669791508 
// 2/7/23 
// 23SP-CSC275A-BL-13540 
// 
  public class StringArrayHelper 
  {
    private String[] myArray; 
    private int size; 

    public StringArrayHelper() 
    {
      this.myArray = new String[10]; 
      this.size = 0; 
    }
    

    public StringArrayHelper(String[] userStr) 
    {
      this.myArray =  userStr; 
      this.size = userStr.length; 
      
    }
    

    public Boolean addItem(String userStr)
    {
      Boolean addedFlag = false; 
      
      if (this.myArray[this.myArray.length - 1] == null) 
      {
        for (int i = 0; i < this.myArray.length; i++)
        {
          if (this.myArray[i] == null)
          {
            this.myArray[i] = userStr; 
            addedFlag = true; 
            break; 
          }
        }
      }
      else 
      {
        System.out.println("Array already full.  Please delete a string and try again."); 
        addedFlag = false; 
      }
      if (addedFlag == true)
      {
        System.out.println(userStr + " added."); 
      }
      
      return addedFlag; 
    }
    

    public Boolean removeItem(String userStr)
    {
      Boolean removedFlag = false; 
      String[] copiedArr = new String[this.myArray.length]; 
      int j = 0; 
      
      if (this.myArray[0] != null)
      {
        for (int i = 0; i < this.myArray.length; i++)
        {
          
          if (this.myArray[i] != userStr)
          {
            copiedArr[j] = this.myArray[i];
            j++; 
          }
          if (this.myArray[i] == userStr)
          {
            removedFlag = true; 
          }
        }
      }
      if (removedFlag == false)
      {
        System.out.println(userStr + " not found."); 
      }
      if (removedFlag == true) 
      {
        System.out.println(userStr + " deleted."); 
      }

      for (int i = 0; i < this.myArray.length; i++)
      {
        this.myArray[i] = copiedArr[i]; 
      }
      
      return removedFlag; 
    }

    
    public Boolean searchItem(String userStr)
    {
      
  		String currentItem = ""; 
  		Boolean found = false; 
  		
  		for (int i = 0; i < this.size; i++)
  		{
  			if (this.myArray[i] != null)
  			{
  				currentItem = myArray[i].toLowerCase(); 
  				if(currentItem.equals(userStr.toLowerCase()))
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
  		String temp = null; 
  		int compared; 
      Boolean isSorted = true; 
  		
  		for (int i = 0; i < this.myArray.length; i++)
  		{
  			if (this.myArray[i] != null)
  			{
  				int lowestIndex = i; 
  				
  				for (int j = i; j < this.myArray.length; j++)
  				{
  					if (this.myArray[j] != null) 
  					{
  						compared = this.myArray[j].toLowerCase().compareTo(this.myArray[lowestIndex].toLowerCase()); 
  						
  						if (compared < 0) 
  						{
  							lowestIndex = j; 
                isSorted = false; 
  						}
  					}
  					
  				}
  				
  				temp = this.myArray[i]; 
  				this.myArray[i] = this.myArray[lowestIndex]; 
  				this.myArray[lowestIndex] = temp; 
  			}
  			
  		}

      return isSorted; 
    }

    
    public int getSize() 
    {
      int totalStrs = 0; 
      
      for (int i = 0; i < myArray.length; i++) 
      {
        if (this.myArray[i] != null)
        {
          totalStrs++; 
        }
      }

      return totalStrs; 
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
