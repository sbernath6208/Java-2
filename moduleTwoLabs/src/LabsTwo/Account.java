
import java.util.Date; 

public class Account
  {
    private Client accountHolder; 
    private double balance; 
    private Date dateCreated; 

    public Account() 
    {
      this.accountHolder = null; 
      this.balance = 0.0; 
      this.dateCreated = new Date(); 
    }

    public Account(Client userClient, double userBal) 
    {
      this.accountHolder = userClient; 
      this. balance = userBal; 
      this.dateCreated = new Date();
    }

    public Client getAccountHolder()
    {
      return this.accountHolder; 
    }

    public void setAccountHolder(Client userHolder)
    {
      this.accountHolder = userHolder; 
    }

    public double getBalance()
    {
      return this.balance; 
    }

    public double deposit(double userAmt)
    {
      this.balance += userAmt; 
      return this.balance; 
    }

    public double withdrawal(double wdrawAmt)
    {
      if (this.balance - wdrawAmt >= 0)
      {
        this.balance -= wdrawAmt; 
      }
      else
      {
        System.out.println("Overdrawal, cannot withdraw."); 
      }
      return this.balance; 
    }

    public Date getDateCreated()
    {
      return this.dateCreated; 
    }

    public String toString()
    {
      return "Client: " + this.accountHolder + ", Balance: " + this.balance + ", Date Created: " + this.dateCreated + "\n"; 
    }
    
  }

  