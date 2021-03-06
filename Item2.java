import java.util.* ;

class Item {
	Integer itemId ;
	String itemName ;
	
	
	Item(Integer i , String s){
		
		this.itemId = i ;
		this.itemName = s ;
	}
	
	
	@Override 
	public String toString(){
		return this.itemId+" - "+this.itemName+" " ;
		
	}
	
	@Override 
	public boolean equals(Object o){
		if(o instanceof Item){
			Item i3 = (Item)o ;
			if(this.itemId == i3.itemId && this.itemName == i3.itemName ){
				return true ;
			}
		}
		return false ;
	}
	
	@Override
	public int hashCode(){
		
		int prime = 13;
		int val = 1;
		val = val*prime + this.itemId.hashCode();
		val = val*prime + this.itemName.hashCode();
		
		return val;
	}
}
	
	class Ids implements Comparator<Item>{
		public int compare(Item i1,Item i2){
			return i1.itemId.compareTo(i2.itemId) ;
			
		}
	}
	
	
	class Names implements Comparator<Item>{
		public int compare(Item i1,Item i2){
			return i1.itemName.compareTo(i2.itemName) ;
			
		}
	}
	


class Item2 {
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Item> item = new ArrayList<>();
		
		
		while(true){
			System.out.println(" 1.  Add Item ");
			System.out.println(" 2.  Display Items ");
			System.out.println(" 3.  Remove Item ");
			System.out.println(" 4. Exit ");
			System.out.println();
			
			
			int choice = sc.nextInt();
			
			switch(choice){
				
				case 1 : {
					System.out.println("Enter itemid and item name");
					int i = sc.nextInt();
					String n = sc.next();
					Item i1 = new Item (i,n);
					if (item.contains(i1)){
						System.out.println("Item already exist ");
					}else {
						item.add(i1);
						System.out.println("Item added successfully !! ");
					}
					break;
				}
				
				case 2 : {
					Ids id = new Ids();
					Collections.sort(item,id);
					System.out.println("items sorted by id : "+item);
					
					Names ns = new Names();
					Collections.sort(item,ns);
					System.out.println("items sorted by names : "+item);
					
					break;
					
				}
				
				case 3 :{
					System.out.println("Enter item to be removed :");
					int i = sc.nextInt();
					String n = sc.next();
					Item i2 = new Item (i,n);
					if (item.contains(i2)){
						item.remove(i2);
					}else {
						System.out.println("item not available !");
					}
					break ;
					
				}
				
				case 4 : {
					break ;
				}
				
				default : System.out.println("Please enter a valid choice !");
			}
			if (choice == 4){
				break;
			}
		}
		
		
	}
}