import java.util.Date; 

public class AccountManager
  {
    private Account[] managedAccounts = new Account[10]; 
    private Date dateCreated; 

    public AccountManager()
    {
      this.managedAccounts = new Account[10]; 
      this.dateCreated = new Date(); 
    }

    public Account[] getManagedAccounts()
    {
      return this.managedAccounts; 
    }

    public Boolean addManagedAccount(Account userAcc)
    {
      for (int i = 0; i < managedAccounts.length; i++)
      {
        if (managedAccounts[i] == null)
        {
          this.managedAccounts[i] = userAcc; 
          return true; 
        }
      }
      
      return false; 
      
    }

    public Boolean removeManagedAccount(Account userAcc)
    {
      Account[] copyAcc = new Account[10]; 
      int j = 0; 
      Boolean removedFlag = false; 
      
      for (int i = 0; i < managedAccounts.length; i++)
      {
        if (managedAccounts[i] != userAcc)
        {
          copyAcc[j] = managedAccounts[i]; 
          j++; 
        }
        else if (managedAccounts[i] == userAcc)
        {
          removedFlag = true; 
        }
      }

      for (int i = 0; i < managedAccounts.length; i++)
      {
        managedAccounts[i] = copyAcc[i]; 
      }
      
      return removedFlag; 
    }

    public Date getDateCreated()
    {
      return this.dateCreated; 
    }
    
    public String toString()
    {
      StringBuilder stringBuilt = new StringBuilder(managedAccounts.length);
      
      for (int i = 0; i < managedAccounts.length; i++)
      {
        if (managedAccounts[i] != null) 
        {
          stringBuilt.append("Account Manager: \n" + managedAccounts[i] + "\n"); 
        }
        
      }
      stringBuilt.append("Managed Accounts List Date Created: " + this.dateCreated + "\n" ); 
      String stringAnswer = stringBuilt.toString(); 
      return stringAnswer; 
    }
    
  }
  