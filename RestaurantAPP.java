import java.util.Scanner;

class MenuItem{
	private  int itemNumber;	
	private String itemName;
	private double itemPrice;
public MenuItem(int itemNumber, String itemName, double itemPrice) {
	this.itemNumber = itemNumber;
	this.itemName = itemName;
	this.itemPrice = itemPrice;
}
 int getItemNumber() {
	 return itemNumber;
 }
 String getItemName() {
	 return itemName;
 }
 double getItemPrice() {
	 return itemPrice;
 }
 @Override
 public String toString() {
	 return "Item Name="+itemName+"\nItem Price="+itemPrice+"$";
 }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
class Order{
	MenuItem items[];
	int itemCount;
	Order(int initialSize){
		items=new MenuItem[initialSize];
	}
	void addItem(MenuItem item) {
		if(items.length==itemCount) {
			System.out.println("Order List is Full");
		}else {
			items[itemCount]=item;
			itemCount++;
			System.out.println("Item Added Succussfully");
		}
	}
	void displayOrders() {
		int count=0;
		for(int i=0;i<itemCount;i++) {
			System.out.println(items[i]);
			count++;
		}
		if(count==0)System.out.println("No Ordered Items");
	}
	void calculateTotal() {
		double sum=0,total;
		for(int i=0;i<itemCount;i++) {
			sum=sum+items[i].getItemPrice();
		}
		total=sum;
		if(sum>=1000) {
			double discAmount=sum*10/100;
			total=sum-discAmount;
			System.out.println(".........Welcome to Mehfil........");
			System.out.println("Total Amount="+sum);
			System.out.println("Discount Amount="+discAmount);
			System.out.println("Amount to Pay="+total);
			System.out.println(".........Thank You For Visiting...........");
			System.out.println("................................Come Again");
		}else {
			System.out.println(".........Welcome to Mehfil........");
			System.out.println("Total Amount="+sum);
			System.out.println("Amount to Pay="+total);
			System.out.println(".........Thank You For Visiting...........");
			System.out.println("................................Don't Come Again");
		}
	}
}
class RestaurantAPP {
    static MenuItem items[];
    static void initilizeMenu() {
    	items=new MenuItem[10];
    	items[0]=new MenuItem(1,"Single Chicken Biryani",100);
    	items[1]=new MenuItem(2,"Pulihora",500);
    	items[2]=new MenuItem(3,"Curd Rice",10);
    	items[3]=new MenuItem(4,"Punugulu",35);
    }
    static void displayMenu() {
        for (MenuItem item : items) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }
	public static void main(String[] args) {
		initilizeMenu();
		boolean isExit=false;
		Scanner sc =new Scanner(System.in);
		Order o1=new Order(10);
		while(!isExit) {
			System.out.println("1.Display Menu");
			System.out.println("2.Order Item");
			System.out.println("3.Display Ordered Items");
			System.out.println("4.Pay Bill");
			System.out.println("5.Exit");
			System.out.println("Enter Option:");
			int op=sc.nextInt();
			switch(op) {
			case 1 -> displayMenu();
			case 2 -> {
                            System.out.print("Enter Item Number:");
                            int itemNumber=sc.nextInt();
                            o1.addItem(items[itemNumber-1]);
                        }
			case 3 -> o1.displayOrders();
			case 4 -> o1.calculateTotal();
			case 5 -> isExit=true;
			default -> System.out.println("Invalid Option");
			}
		}
		sc.close();

	}

}

