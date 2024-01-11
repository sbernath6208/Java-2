//Stuart Bernath	uin: 669791508 

package module7Assignment;

//import java.util.Arrays;
import java.util.Scanner; 
import java.io.File;
import java.io.PrintWriter; 
import java.util.ArrayList; 
import java.util.Collections;

public class Assignment07Methods 
{
	Scanner input = new Scanner(System.in); 
	
	//item 
	public class Item implements Comparable<Item>
	{
		 private String name;  
		 private double weight;  
		 private double value; 
		 private int durability; 
		 private int ID; 
		 private String attr; 
		 private String type; 
		 
		 public Item()
		 {
			 this.name = "default"; 
			 this.weight = 0.00; 
			 this.value = 0.00; 
			 this.durability = 0; 
			 this.ID = 0;
			 this.attr = ""; 
			 this.type = ""; 
		 }
		 
		 public Item(String name, int ID)
		 {
			 this.name = name;   
			 this.ID = ID;
		 }
		 
		 public Item(String name, double weight, double value, int durability, int ID)
		 {
			 this.name = name; 
			 this.weight = weight; 
			 this.value = value; 
			 this.durability = durability; 
			 this.ID = ID;
		 }
		 
		 public Item(String name, double weight, double value, int durability, int ID, String userAttr, String userType)
		 {
			 this.name = name; 
			 this.weight = weight; 
			 this.value = value; 
			 this.durability = durability; 
			 this.ID = ID;
			 this.attr = userAttr; 
			 this.type = userType; 
		 }
		 
		 public String getName()
		 {
			 return this.name; 
		 }
		 
		 public void setName(String userName)
		 {
			 this.name = userName; 
		 }
		 
//		 weight 
		 public double getWeight()
		 {
			 return this.weight; 
		 }
		 
		 public void setWeight(double userWeight)
		 {
			 this.weight = userWeight; 
		 }
		 
//		 value 
		 public double getValue()
		 {
			 return this.value; 
		 }
		 
		 public void setValue(double userValue)
		 {
			 this.value = userValue; 
		 }
		 
//		 durability
		 public int getDurab()
		 {
			 return this.durability; 
		 }
		 
		 public void setDurab(int userDurab)
		 {
			 this.durability = userDurab; 
		 }
		 
//		 ID
		 public int getID()
		 {
			 return this.ID; 
		 }
		 
		 public void setID(int userID)
		 {
			 this.ID = userID; 
		 }
		 
		 public String getAttr()
		 {
			 return this.attr; 
		 }
		 
		 public void setAttr(String userAttr)
		 {
			 this.attr = userAttr; 
		 }
		 
		 public String getType() 
		 {
			 return this.type; 
		 }
		 
		 public void setType(String userType) 
		 {
			 this.type = userType; 
		 }

		@Override
		public int compareTo(Item o) 
		{
			String otherName = o.getName().toLowerCase(); 
			
			int comparison = this.getName().toLowerCase().compareTo(otherName);   
			
			if (comparison < 0)
			{
				return -1; 
			}
			else if (comparison > 0) 
			{
				return 1; 
			}
			else 
			{
				return 0; 
			}
		}
		 
	}
	
//	equipment
	public class Equipment extends Item 
	{
		private Boolean humanWearable; 
		private Boolean weapon; 
		private Boolean shipEnhancement; 
		private Boolean tool; 
		
		public Equipment() 
		{
			this.humanWearable = false; 
			this.weapon = false; 
			this.shipEnhancement = false; 
			this.tool = false; 
		}
		
		public Equipment(Item userItem)
		{
			setName(userItem.getName()); 
			setWeight(userItem.getWeight()); 
			setValue(userItem.getValue()); 
			setDurab(userItem.getDurab()); 
			setID(userItem.getID()); 
			setAttr(userItem.getAttr()); 
			setType(userItem.getType());
			this.humanWearable = false; 
			this.weapon = false; 
			this.shipEnhancement = false; 
			this.tool = false; 
		}
		
		public Equipment(String name, double weight, double value, int durability, int ID)
		{
			setName(name); 
			setWeight(weight); 
			setValue(value); 
			setDurab(durability); 
			setID(ID); 
			this.humanWearable = false; 
			this.weapon = false; 
			this.shipEnhancement = false; 
			this.tool = false; 
		}
		
		public Equipment(String name, double weight, double value, int durability, int ID, Boolean userHuman, Boolean userWeapon, Boolean userShip, Boolean userTool) 
		{
			setName(name); 
			setWeight(weight); 
			setValue(value); 
			setDurab(durability); 
			setID(ID); 
			this.humanWearable = userHuman; 
			this.weapon = userWeapon; 
			this.shipEnhancement = userShip; 
			this.tool = userTool; 
		}
		
		public Boolean getWearable()
		{
			return this.humanWearable; 
		}
		
		public void setWearable(Boolean userWear) 
		{
			this.humanWearable = userWear; 
		}
		
		public Boolean getWeapon()
		{
			return this.weapon; 
		}
		
		public void setWeapon(Boolean userWeapon) 
		{
			this.weapon = userWeapon; 
		}
		
		public Boolean getShipEnhancement()
		{
			return this.shipEnhancement; 
		}
		
		public void setShipEnhancement(Boolean userShip) 
		{
			this.shipEnhancement = userShip; 
		}
		
		public Boolean getTool()
		{
			return this.tool; 
		}
		
		public void setTool(Boolean userTool) 
		{
			this.tool = userTool; 
		}
		
	}
	
	
//	consumable
	public class Consumable extends Item  
	{
		private Boolean food; 
		private Boolean drink; 
		private Boolean pill; 
		
		public Consumable() 
		{
			this.food = false; 
			this.drink = false; 
			this.pill = false; 
		}
		
		public Consumable(String name, double weight, double value, int durability, int ID)
		{
			setName(name); 
			setWeight(weight); 
			setValue(value); 
			setDurab(durability); 
			setID(ID); 
			this.food = false; 
			this.drink = false; 
			this.pill = false; 
		}
		
		public Consumable(Item userItem)
		{
			setName(userItem.getName()); 
			setWeight(userItem.getWeight()); 
			setValue(userItem.getValue()); 
			setDurab(userItem.getDurab()); 
			setID(userItem.getID()); 
			setAttr(userItem.getAttr()); 
			setType(userItem.getType());
			this.food = false; 
			this.drink = false; 
			this.pill = false; 
		}
		
		public Consumable(String name, double weight, double value, int durability, int ID, Boolean userFood, Boolean userDrink, Boolean userPill) 
		{
			setName(name); 
			setWeight(weight); 
			setValue(value); 
			setDurab(durability); 
			setID(ID); 
			this.food = userFood; 
			this.drink = userDrink; 
			this.pill = userPill; 
		}
		
		public Boolean getFood()
		{
			return this.food; 
		}
		
		public void setFood(Boolean userFood) 
		{
			this.food = userFood; 
		}
		
		public Boolean getDrink()
		{
			return this.drink; 
		}
		
		public void setDrink(Boolean userDrink) 
		{
			this.drink = userDrink; 
		}
		
		public Boolean getPill()
		{
			return this.pill; 
		}
		
		public void setPill(Boolean userPill) 
		{
			this.pill = userPill; 
		}
		
	}
	
//	material
	public class Material extends Item  
	{
		private Boolean silver; 
		private Boolean gold; 
		private Boolean iron; 
		private Boolean lead; 
		private Boolean steal; 
		
		public Material() 
		{
			this.silver = false; 
			this.gold = false; 
			this.iron = false; 
			this.lead = false; 
			this.steal = false; 
		}
		
		public Material(String name, double weight, double value, int durability, int ID)
		{
			setName(name); 
			setWeight(weight); 
			setValue(value); 
			setDurab(durability); 
			setID(ID); 
			this.silver = false; 
			this.gold = false; 
			this.iron = false; 
			this.lead = false; 
			this.steal = false; 
		}
		
		public Material(Item userItem)
		{
			setName(userItem.getName()); 
			setWeight(userItem.getWeight()); 
			setValue(userItem.getValue()); 
			setDurab(userItem.getDurab()); 
			setID(userItem.getID()); 
			setAttr(userItem.getAttr()); 
			setType(userItem.getType());
			this.silver = false; 
			this.gold = false; 
			this.iron = false; 
			this.lead = false; 
			this.steal = false; 
		}
		
		public Material(String name, double weight, double value, int durability, int ID, Boolean userSilv, Boolean userGold, Boolean userIron, Boolean userLead, Boolean userSteal) 
		{
			setName(name); 
			setWeight(weight); 
			setValue(value); 
			setDurab(durability); 
			setID(ID); 
			this.silver = userSilv; 
			this.gold = userGold; 
			this.iron = userIron; 
			this.lead = userLead; 
			this.steal = userSteal; 
		}
		
		public Boolean getSilver()
		{
			return this.silver; 
		}
		
		public void setSilver(Boolean userSilver) 
		{
			this.silver = userSilver; 
		}
		
		public Boolean getGold()
		{
			return this.gold; 
		}
		
		public void setGold(Boolean userGold) 
		{
			this.gold = userGold; 
		}
		
		public Boolean getIron()
		{
			return this.iron; 
		}
		
		public void setIron(Boolean userIron) 
		{
			this.iron = userIron; 
		}
		
		public Boolean getLead()
		{
			return this.lead; 
		}
		
		public void setLead(Boolean userLead) 
		{
			this.lead = userLead; 
		}
		
		public Boolean getSteal()
		{
			return this.steal; 
		}
		
		public void setSteal(Boolean userSteal) 
		{
			this.steal = userSteal; 
		}
		
	}
	
	double totalCargoWeight = 0; 	
	
	public void addItem(ArrayList<Item> cargohold) 
	{

		
		int itemID = 0; 
		String itemName = ""; 
		double itemWeight = 0.0; 
		double itemValue = 0.0; 
		int itemDurab = 0; 
		String typeName = ""; 
		String userAttr = ""; 
		
		try 
		{
			System.out.println(""); 
			System.out.println("Please enter the name of the item you would like to enter: "); 
			itemName = input.nextLine(); 
			itemName = itemName.trim(); 
			System.out.println("Please enter the weight in tons of the item you would like to enter (ex. 0.5 for half a ton): "); 
			itemWeight = input.nextDouble(); 
			System.out.println("Please enter the value of the item you would like to enter: "); 
			itemValue = input.nextDouble(); 
			System.out.println("Please enter the durability of the item you would like to enter: "); 
			itemDurab = input.nextInt(); 
			input.nextLine(); // consume newline 
			System.out.println("Please enter the type of item (equipment, consumable, or material: "); 
			typeName = input.nextLine(); 
			typeName = typeName.trim(); 				

			while(!typeName.toLowerCase().equals("equipment") && !typeName.toLowerCase().equals("consumable") && !typeName.toLowerCase().equals("material")) 
			{
				System.out.println("Incorrect choice."); 
				System.out.println("Please enter the type of item (equipment, consumable, or material): "); 
				typeName = input.nextLine(); 
				typeName = typeName.trim(); 
			}			
			
			if (typeName.toLowerCase().equals("equipment")) 
			{
				System.out.println("Please select one equipment attribute (human wearable, ship part, weapon, or tool): "); 
				userAttr = input.nextLine(); 
				userAttr = userAttr.trim(); 
				while (!userAttr.equals("human wearable") && !userAttr.equals("ship part") && !userAttr.equals("weapon") && !userAttr.equals("tool" ))
				{
					System.out.println("Incorrect selection."); 
					System.out.println("Please select one equipment attribute (human wearable, ship part, weapon, or tool): "); 
					userAttr = input.nextLine(); 
					userAttr = userAttr.trim(); 
				}
				
			}			
			else if (typeName.toLowerCase().equals("consumable"))  
			{
				System.out.println("Please select one consumable attribute (food, drink, or pill): "); 
				userAttr = input.nextLine(); 
				userAttr = userAttr.trim(); 
				while (!userAttr.equals("food") && !userAttr.equals("drink") && !userAttr.equals("pill"))
				{
					System.out.println("Incorrect selection."); 
					System.out.println("Please select one consumable attribute (food, drink, or pill): "); 
					userAttr = input.nextLine(); 
				}
				userAttr = userAttr.trim(); 
			}			
			else if (typeName.toLowerCase().equals("material")) 
			{
				System.out.println("Please select one material attribute (gold, silver, iron, lead, or steal): "); 
				userAttr = input.nextLine(); 
				userAttr = userAttr.trim(); 
				while (!userAttr.equals("gold") && !userAttr.equals("silver") && !userAttr.equals("iron") && !userAttr.equals("lead") && !userAttr.equals("steal"))
				{
					System.out.println("Incorrect selection."); 
					System.out.println("Please select one consumable attribute (gold, silver, iron, lead, or steal): "); 
					userAttr = input.nextLine(); 
					userAttr = userAttr.trim(); 
				}
			}
			
			Boolean found = true; 
	
			while (found)
			{
				System.out.println("Please enter the ID of the item you would like to enter: "); 
				itemID = input.nextInt(); 
				
				
				if (cargohold.size() == 0)
				{
					found = false; 
				}
				else 
				{
					for (int i = 0; i < cargohold.size(); i++)
					{
						
						if (cargohold.get(i) != null)
						{
							if (cargohold.get(i).getID() == itemID)
							{
								System.out.println("ID already in use."); 
							    found = true; 
							    break; 
							}
							else
							{
								found = false; 
							}
						}
						else if (cargohold.get(i) == null)
						{
							found = false; 
							break; 
						}
						
					}
				}
				
			}
		}
		catch (Exception ex) 
		{
			System.out.println(ex); 
		}
		
		Equipment addedItemEq = null; 
		Consumable addedItemCo = null; 
		Material addedItemMa = null; 
	
		if (typeName.equals("equipment"))  
		{
			addedItemEq = new Equipment(itemName, itemWeight, itemValue, itemDurab, itemID); 
			addedItemEq.setType("equipment"); 
			if (userAttr.toLowerCase().equals("human wearable")) 
			{
				addedItemEq.setWearable(true); 
				addedItemEq.setAttr(userAttr);  			
			}
			else if (userAttr.toLowerCase().equals("ship part"))
			{
				addedItemEq.setShipEnhancement(true); 
				addedItemEq.setAttr(userAttr); 
			}
			else if (userAttr.toLowerCase().equals("weapon")) 
			{
				addedItemEq.setWeapon(true); 
				addedItemEq.setAttr(userAttr); 
			}
			else if (userAttr.toLowerCase().equals("tool")) 
			{
				addedItemEq.setTool(true); 
				addedItemEq.setAttr(userAttr); 
			}
		}
		else if (typeName.equals("consumable")) 
		{
			addedItemCo = new Consumable(itemName, itemWeight, itemValue, itemDurab, itemID); 
			addedItemCo.setType("consumable"); 
			if (userAttr.toLowerCase().equals("food"))
			{
				addedItemCo.setFood(true); 
				addedItemCo.setAttr(userAttr); 
			}
			else if (userAttr.toLowerCase().equals("drink"))
			{
				addedItemCo.setDrink(true); 
				addedItemCo.setAttr(userAttr); 
			}
			else if (userAttr.toLowerCase().equals("pill"))
			{
				addedItemCo.setPill(true); 
				addedItemCo.setAttr(userAttr); 
			}
			
		}
		else if (typeName.equals("material")) 
		{
			addedItemMa = new Material(itemName, itemWeight, itemValue, itemDurab, itemID);
			addedItemMa.setType("material"); 
			if (userAttr.toLowerCase().equals("gold"))
			{
				addedItemMa.setGold(true); 
				addedItemMa.setAttr(userAttr); 
			}
			else if (userAttr.toLowerCase().equals("silver")) 
			{
				addedItemMa.setSilver(true);
				addedItemMa.setAttr(userAttr); 
			}
			else if (userAttr.toLowerCase().equals("iron")) 
			{
				addedItemMa.setIron(true); 
				addedItemMa.setAttr(userAttr); 
			}
			else if (userAttr.toLowerCase().equals("lead")) 
			{
				addedItemMa.setLead(true); 
				addedItemMa.setAttr(userAttr); 
			}
			else if (userAttr.toLowerCase().equals("steal")) 
			{
				addedItemMa.setSteal(true); 
				addedItemMa.setAttr(userAttr); 
			}
		}
		
		// if cargo total weight is over 25 tons, cannot add item 
		if (typeName.toLowerCase().equals("equipment")) 
		{


					if ((totalCargoWeight + addedItemEq.getWeight()) <= 25) 
					{
						cargohold.add(addedItemEq); 
						totalCargoWeight += addedItemEq.getWeight(); 
						System.out.println(addedItemEq.getName() + " was added."); 

					}
					else 
					{
						System.out.println("Total weight exceeds 25 tons.  Please find a lighter item or remove object(s) to add."); 

					}

		}
		else if (typeName.toLowerCase().equals("consumable")) 
		{

					if ((totalCargoWeight + addedItemCo.getWeight()) <= 25) 
					{
						cargohold.add(addedItemCo); 
						totalCargoWeight += addedItemCo.getWeight(); 
						System.out.println(addedItemCo.getName() + " was added."); 
//						break;
					}
					else 
					{
						System.out.println("Total weight exceeds 25 tons.  Please find a lighter item or remove object(s) to add."); 
//						break; 
					}


		}
		else if (typeName.toLowerCase().equals("material")) 
		{

					if ((totalCargoWeight + addedItemMa.getWeight()) <= 25) 
					{
						cargohold.add(addedItemMa); 
						totalCargoWeight += addedItemMa.getWeight(); 
						System.out.println(addedItemMa.getName() + " was added."); 
//						break;
					}
					else 
					{
						System.out.println("Total weight exceeds 25 tons.  Please find a lighter item or remove object(s) to add."); 
//						break; 
					}

		}		
		
		System.out.println(""); 
		System.out.println("Press any key to continue");
		String toMenu = input.nextLine(); 
		toMenu = input.nextLine(); 
		System.out.println(""); 
		
		
	}

	public void removeItem(ArrayList<Item> cargohold) 
	{
		
		ArrayList<Item> copyCargohold = new ArrayList<Item>(); 
		String thisString; 
		
		System.out.println("Please enter the name of the item you would like to delete: "); 
		String itemName = input.nextLine(); 
		Boolean alreadyDeleted = false; 
		
		try 
		{
			for (int i = 0; i < cargohold.size(); i++)
			{
				if(cargohold.get(i) != null)
				{
					thisString = cargohold.get(i).getName().toLowerCase(); 
					
					if(thisString.equals(itemName.toLowerCase()) && alreadyDeleted == false) 
					{
						cargohold.remove(cargohold.get(i)); 
						System.out.println(itemName + " was deleted."); 
						alreadyDeleted = true; 
						continue; 
					}	
				}
			}
			
			if (alreadyDeleted == false)
			{
				System.out.println(itemName + " not found."); 
			}		
			
			for (int i = 0; i < cargohold.size(); i++)
			{
				if(cargohold.get(i) != null)
				{
					copyCargohold.add(cargohold.get(i)); 
				}
			}
			
			cargohold.removeAll(cargohold); 
			
			for (int i = 0; i < copyCargohold.size(); i++)
			{
				if(copyCargohold.get(i) != null)
				{
					 cargohold.add(copyCargohold.get(i)); 
				}
			}
		}
		catch (Exception ex)
		{
			System.out.println(ex); 
		}
		
		System.out.println(""); 
		System.out.println("Press any key to continue");
		String toMenu = input.nextLine(); 
		System.out.println(""); 
		
	}

	public void sortItems(ArrayList<Item> cargohold) 
	{
		// I used this web site to help me understand the selection sort 
		// as well as for the pseudocode: 
		// https://www.enjoyalgorithms.com/blog/introduction-to-sorting-bubble-sort-selection-sort-and-insertion-sort 
		// The author is Shubham Gautam. 
		
		Item temp = null; 
		int compared; 
		
		for (int i = 0; i < cargohold.size()-1; i++)
		{
			if (cargohold.get(i) != null)
			{
				int lowestIndex = i; 
				
				for (int j = i; j < cargohold.size() - 1; j++)
				{
					if (cargohold.get(j) != null) 
					{
						compared = cargohold.get(j).getName().toLowerCase().compareTo(cargohold.get(lowestIndex).getName().toLowerCase()); 
						
						if (compared < 0) 
						{
							lowestIndex = j; 
						}
					}
					
				}
				
				Collections.swap(cargohold, i, lowestIndex); 
			}
			
		}
		
		System.out.println("Array sorted."); 
		System.out.println("Press any key to continue");
		String toMenu = input.nextLine(); 
		System.out.println(""); 
	}
	
	public void sortItemsJava(ArrayList<Item> cargohold) 
	{
//		 Sort your cargohold by using the Arrays or Collections classes. 
		int count = 0; 
		
		for (int i = 0; i < cargohold.size(); i++) 
		{
			if (cargohold.get(i) != null) 
			{
				count++; 
			}
		}
		
		try 
		{
			Collections.sort(cargohold); 
		}
		catch (Exception ex)
		{
			System.out.println(ex); 
		}
		
		System.out.println("Array sorted."); 
//		System.out.println("Press any key to continue");
//		String toMenu = input.nextLine(); 
		System.out.println(""); 
	
	}

	public void searchItemsByName(ArrayList<Item> cargohold) 
	{

		System.out.println("Please enter the item name you are searching for: "); 
		String searchItem = input.nextLine(); 
		String currentItem = ""; 
		Boolean found = false; 
		
		for (int i = 0; i < cargohold.size(); i++)
		{
			if (cargohold.get(i) != null)
			{
				currentItem = cargohold.get(i).getName().toLowerCase(); 
				if(currentItem.equals(searchItem.toLowerCase()))
				{
			
					System.out.println(searchItem + " was found in the cargo at least once.");
					found = true; 					
					break; 
				}
				
			}
		}
		if(!found)
		{
			System.out.println(searchItem + " was not in the cargo."); 
		}
		
		System.out.println(""); 
		System.out.println("Press any key to continue");
		String toMenu = input.nextLine(); 
		System.out.println(""); 		
		
	}

	public void searchItemsByID(ArrayList<Item> cargohold) 
	{	
		// I actually put the searchByAttribute method here since 
		// the Assignment03Driver does not contain a case for 
		// searching by attribute with a separate method. 
		
		Boolean found = false; 
		
		System.out.println("Please enter the item attribute you are searching for: human wearable, "
				+ "weapon, ship part, tool, food, drink, pill, silver, gold, iron, lead, or steal"); 
		String searchItem = input.nextLine(); 
		
		while (!searchItem.equals("human wearable") && !searchItem.equals("weapon") && !searchItem.equals("ship part") && !searchItem.equals("tool") 
				&& !searchItem.equals("food") && !searchItem.equals("drink") && !searchItem.equals("pill") && !searchItem.equals("silver") 
				&& !searchItem.equals("gold") && !searchItem.equals("iron") && !searchItem.equals("lead") && !searchItem.equals("steal")) 
		{
			System.out.println("Attribute not found.  Please select from: human wearable, "
					+ "weapon, ship part, tool, food, drink, pill, silver, gold, iron, lead, or steal"); 
			searchItem = input.nextLine(); 
		}
		
		String currentItem = ""; 
		
		for (int i = 0; i < cargohold.size(); i++)
		{
			if (cargohold.get(i) != null)
			{
				currentItem = cargohold.get(i).getAttr(); 
				if(currentItem.equals(searchItem))
				{
					System.out.println("Attribute " + searchItem + " - \'" + cargohold.get(i).getName() + "\' was found in the cargo at least once.");
					found = true; 
					break; 
				}
				
			}

				
		}
		if(!found)
		{
			System.out.println(searchItem + " was not in the cargo."); 
		}
		
		
//		try
//		{
//			System.out.println("Please enter the item ID you are searching for: "); 
//			int searchItem = input.nextInt(); 
//			int currentItem = 0; 
//			Boolean found = false; 
//			
//			for (int i = 0; i < cargohold.size(); i++)
//			{
//				if (cargohold.get(i) != null)
//				{
//					currentItem = cargohold.get(i).getID(); 
//					if(currentItem == searchItem)
//					{
//						System.out.println("ID " + searchItem + " - \'" + cargohold.get(i).getName() + "\' was found in the cargo at least once.");
//						found = true; 
//						break; 
//					}
//					
//				}
//			}
//			if(!found)
//			{
//				System.out.println("ID " + searchItem + " was not in the cargo."); 
//			}
//		} 
//		catch (Exception ex) 
//		{
//			System.out.println(ex); 
//		}

		
		System.out.println(""); 
		System.out.println("Press any key to continue");
		String toMenu = input.nextLine(); 
		System.out.println(""); 

	}
	
	public void loadItems(ArrayList<Item> cargohold){
	
		try 
		{
			String fileInput = ""; 
			int j = 0; 
			
			System.out.println("Please enter the name of the file including extension from the root path of "
					+ "this project's directory (include directory path from root of this project if necessary)>> "); 
			fileInput = input.nextLine(); 
		
			
			File file = new File(fileInput); 
			
			Scanner loadInput = new Scanner(file); 			
			
			while (loadInput.hasNext()) 
			{
				Item thisItem = new Item(); 

				thisItem.setName(loadInput.nextLine()); 
				thisItem.setWeight(Double.parseDouble(loadInput.nextLine())); 
				thisItem.setValue(Double.parseDouble(loadInput.nextLine())); 
				thisItem.setDurab(Integer.parseInt(loadInput.nextLine())); 
				thisItem.setID(Integer.parseInt(loadInput.nextLine())); 
				thisItem.setType(loadInput.nextLine()); 
				thisItem.setAttr(loadInput.nextLine()); 
				String type = thisItem.getType(); 
				String attr = thisItem.getAttr(); 
				String TOKEN = loadInput.nextLine(); 
				
				if (type.equals("equipment"))  
				{
					Equipment thisEq = new Equipment(thisItem); 

					if (attr.equals("human wearable"))
					{
						thisEq.setWearable(true); 
					}
					if (attr.equals("weapon"))
					{
						thisEq.setWeapon(true); 
					}
					if (attr.equals("ship part"))
					{
						thisEq.setShipEnhancement(true); 
					}
					if (attr.equals("tool"))
					{
						thisEq.setTool(true); 
					}
					
					cargohold.add(thisEq); 
//					j++; 
				}				
				else if (type.equals("consumable")) 
				{
					Consumable thisCo = new Consumable(thisItem); 
					
					if (attr.equals("food"))
					{
						thisCo.setFood(true); 
					}
					if (attr.equals("drink"))
					{
						thisCo.setDrink(true); 
					}
					if (attr.equals("pill"))
					{
						thisCo.setPill(true); 
					}
					
					cargohold.add(thisItem); 
//					j++; 
				}	
				else if (type.equals("material")) 
				{
					Material thisMa = new Material(thisItem); 
					
					if (attr.equals("silver"))
					{
						thisMa.setSilver(true); 
					}
					if (attr .equals("gold"))
					{
						thisMa.setGold(true); 
					}
					if (attr.equals("iron"))
					{
						thisMa.setIron(true); 
					}
					if (attr.equals("lead"))
					{
						thisMa.setLead(true); 
					}
					if (attr.equals("steal"))
					{
						thisMa.setSteal(true); 
					}
					
					cargohold.add(thisItem); 

				}
				
			}

			loadInput.close(); 
			
		} 
		catch (Exception ex) 
		{
			System.out.println(ex); 
		}
	
		
		System.out.println("Items loaded."); 
		System.out.println("Press any key to continue");
		String toMenu = input.nextLine(); 
		System.out.println(""); 
		
	}
	
	public void saveItems(ArrayList<Item> cargohold)
	{
	
		try 
		{
			String fileOutput = ""; 
			final String TOKEN = ":::"; 
			
			System.out.println("Please enter the name for the file you would like to save >> "); 
			fileOutput = input.nextLine(); 
			
			File file = new File(fileOutput); 
			if (file.exists()) 
			{
				System.out.println("File already existed."); 
				System.out.println("Overwritten."); 
//				System.exit(0); 
			}
			
			PrintWriter fileWrite = new PrintWriter(file); 
			
			for (int i = 0; i < cargohold.size(); i++) 
			{
				if (cargohold.get(i) != null) 
				{
					fileWrite.println(cargohold.get(i).getName());  
					fileWrite.println(cargohold.get(i).getWeight()); 
					fileWrite.println(cargohold.get(i).getValue()); 
					fileWrite.println(cargohold.get(i).getDurab()); 
					fileWrite.println(cargohold.get(i).getID()); 
					fileWrite.println(cargohold.get(i).getType()); 
					fileWrite.println(cargohold.get(i).getAttr()); 
					fileWrite.println(TOKEN); 
				}

			}
			
			fileWrite.close(); 
			
		} 
		catch (Exception ex) 
		{
			System.out.println(ex); 
		}
		
		System.out.println("Items saved"); 
		System.out.println("Press any key to continue");
		String toMenu = input.nextLine(); 
		System.out.println(""); 
		
	}
	
	
	public void displayItems(ArrayList<Item> cargohold) {
		
		System.out.println(""); 
		int totalItem = 0; 
		String thisItem = ""; 
		String lastItem = ""; 
		
		// if empty 
		if (cargohold.size() == 0)
		{
			System.out.println("Cargo hold is currently empty");
			
		}
		
		// sort 
		// I used this web site to help me understand the selection sort 
		// as well as for the pseudocode: 
		// https://www.enjoyalgorithms.com/blog/introduction-to-sorting-bubble-sort-selection-sort-and-insertion-sort 
		// The author is Shubham Gautam. 
//		Item temp = null; 
//		int compared; 
//		
//		for (int i = 0; i < cargohold.length - 1; i++)
//		{
//			if (cargohold[i] != null)
//			{
//				int lowestIndex = i; 
//				
//				for (int j = i; j < cargohold.length - 1; j++)
//				{
//					if (cargohold[j] != null) 
//					{
//						compared = cargohold[j].getName().toLowerCase().compareTo(cargohold[lowestIndex].getName().toLowerCase()); 
//						
//						if (compared < 0) 
//						{
//							lowestIndex = j; 
//						}
//					}
//					
//				}
//				
//				temp = cargohold[i]; 
//				cargohold[i] = cargohold[lowestIndex]; 
//				cargohold[lowestIndex] = temp; 
//			}
//			
//		}
//		
		
		else 
		{
			
			this.sortItemsJava(cargohold);
			// display 
			for (int i = 0; i < cargohold.size(); i++)
			{
				
				if (cargohold.get(i) != null)
				{
					thisItem = cargohold.get(i).getName().toLowerCase(); 
					
			        if (!thisItem.equals(lastItem))
					{
						totalItem = 0;
						
						for (int j = 0; j < cargohold.size(); j++)
						{
							
							if (cargohold.get(j) != null)
							{
								if(cargohold.get(j).getName().toLowerCase().equals(cargohold.get(i).getName().toLowerCase())) 
								{
									
									totalItem++; 
									
								}
							}
							
						}
						
						System.out.println(cargohold.get(i).getName() + " - " + totalItem);
						
						lastItem = cargohold.get(i).getName().toLowerCase(); 
						
					}
				}
			}
		}		
		System.out.println(""); 
		System.out.println("Press any key to continue");
		String toMenu = input.nextLine(); 
		System.out.println(""); 
		
	}
	
}

