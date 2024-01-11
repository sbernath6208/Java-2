// Stuart Bernath	uin: 669791508 
// 4/2/23 
// 23SP-CSC275A-BL-13540 
// 

package moduleFiveLabs;

import java.util.Date;
import java.util.Objects;

public class Account extends Client implements Comparable 
{
	private Client accountHolder; 
	private double balance; 
	private Date dateCreated;
	
	public Account() 
	{
		super();
		this.accountHolder = null;
		this.balance = 0.0;
		this.dateCreated = new Date();
	} 
	
	public Account(Client accountHolder, double balance) 
	{
		this.accountHolder = accountHolder;
		this.balance = balance;
		this.dateCreated = new Date();
	}

	public Client getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(Client accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
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

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		return "Account [accountHolder=" + accountHolder + ", balance=" + balance + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accountHolder, other.accountHolder)
				&& Double.doubleToLongBits(balance) == Double.doubleToLongBits(other.balance);
	}

	@Override
	public int compareTo(Object o) 
	{
		return (int) (this.getBalance() - ((Account) o).getBalance()); 
	} 
	
	
	
}
