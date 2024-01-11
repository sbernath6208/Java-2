// Stuart Bernath	uin: 669791508 
// 4/3/23 
// 23SP-CSC275A-BL-13540 
// 

package moduleFiveLabs;


public class Barbarian implements Comparable<Barbarian>
{
  private int health; 
  private int intelligence; 
  private int dexterity; 
  private int strength; 
  private int stamina; 

  public Barbarian()
  {
    this.health = 1; 
    this.intelligence = 0; 
    this.dexterity = 0; 
    this.strength = 0; 
    this.stamina = 0; 
  }

  public Barbarian(int userHealth, int userIntel, int userDex, int userStr, int userStam)
  {
    this.health = userHealth; 
    this.intelligence = userIntel; 
    this.dexterity = userDex; 
    this.strength = userStr; 
    this.stamina = userStam; 
  }

  public int getHealth()
  {
    return this.health; 
  }

  public void setHealth(int setHp)
  {
    if (setHp >= 0)
    {
      this.health = setHp; 
    }
  }

  public int getIntelligence()
  {
    return this.intelligence; 
  }

  public void setIntelligence(int setIntel)
  {
    if (setIntel >= 0)
    {
      this.intelligence = setIntel; 
    }
  }

  public int getDexterity()
  {
    return this.dexterity; 
  }

  public void setDexterity(int setDex)
  {
    if (setDex >= 0)
    {
      this.dexterity = setDex; 
    }
  }

  public int getStrength()
  {
    return this.strength; 
  }

  public void setStrength(int setStr)
  {
    if (setStr >= 0)
    {
      this.strength = setStr; 
    }
  }

  public int getStamina()
  {
    return this.stamina; 
  }

  public void setStamina(int setStam)
  {
    if (setStam >= 0)
    {
      this.stamina = setStam; 
    }
  }

  public double getDamageReducedPerBlock() 
  {
    double dexMod = this.getDexterity() * 0.3; 
    double strMod = this.getStrength() * 0.9; 
    double totalDmg = dexMod + strMod; 
    return totalDmg; 
  }

  public double getDamagePerMeleeAttack() 
  {
    double dexMod = this.getDexterity() * 0.5; 
    double strMod = this.getStrength() * 0.8; 
    double totalDmg = dexMod + strMod; 
    return totalDmg; 
  }

  @Override 
  public String toString()
  {
    return "Health: " + this.health + ", Intelligence: " + this.intelligence + ", Dexterity: " + this.dexterity + ", Strength: " + this.strength + ", Stamina: " + this.stamina + ", Damage Reduction per Block: " + this.getDamageReducedPerBlock() + ", Melee Damage: " + this.getDamagePerMeleeAttack() + "\n"; 
  }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Barbarian other = (Barbarian) obj;
		return dexterity == other.dexterity && health == other.health && intelligence == other.intelligence
				&& stamina == other.stamina && strength == other.strength;
	}

	@Override
	public int compareTo(Barbarian o) {
		return this.getHealth() - o.getHealth(); 
	}
  
  
  
}
