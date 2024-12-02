import java.util.Scanner;

public class Ticket{
    int [] seats;
    public double finalPrice;
    private double price;
    private int seatNumber;
    Ticket(double price,int seatNumber){
        this.price=price;
        this.seatNumber=seatNumber;
    }
    public void calculateFinalPrice(double price,int seatNumber){
        
	}
}
class BusTicket extends Ticket{
    private int totalSeats;
    private int[] seats;
    BusTicket(double price,int seatNumber,int totalSeats,int[] seats){
        super(price, seatNumber);
        this.totalSeats=totalSeats;
        this.seats=seats;

    }
    public void  calculateFinalPrice(double price,int seatNumber,int totalSeats,int[] seats){
        
        double sum=0;
        double total;
		sum=(price*totalSeats);
		total=sum;
		if(sum>500) {
			double discAmount=sum*10/100;
			total=sum-discAmount;
            System.out.println("The User Booked Transport: Bus Transport Services!");
            System.out.println("Price of One Ticket:"+price);
            System.out.println("Seats Booked:");
            for (int i = 0; i < (totalSeats-1); i++) {
                System.err.print(" "+seats[i]);
                
            }
            System.err.println("Total Seats:"+totalSeats);
            System.err.println("Total Price to Pay:"+sum);
            System.err.println("Discount Applied 10%:"+discAmount);
            System.err.println("Final Price to Pay: "+total);
            System.err.println("Thankyou for Using Our Services!!");
			
		}else {
            System.out.println("The User Booked Transport: Bus Transport Services!");
            System.out.println("Price of One Ticket:"+price);
            System.out.println("Seats Booked:");
            for (int i = 0; i < (totalSeats-1); i++) {
                System.err.print(" "+seats[i]);
                
            }
            System.err.println("Total Seats:"+totalSeats);
            System.err.println("Total Price to Pay: "+total);
            System.err.println("Thankyou for Using Our Services!!");	
		}
    }   
}
class FlightTicket extends Ticket{
    private final int totalSeats;
    
    private final int[] seats;
    FlightTicket(double price,int seatNumber,int totalSeats,int[] seats){
        super(price, seatNumber);
        this.totalSeats=totalSeats;
        this.seats=seats;
    }
    public void  calculateFinalPrice(double price,int seatNumber,int totalSeats,int[] seats){
        double sum;
        double total;
        sum=(price*totalSeats);

		total=sum;
		if(sum>700) {
			double discAmount=sum*15/100;
			total=sum-discAmount;
            System.out.println("The User Booked Transport: Flight Transport Services!");
            System.out.println("Price of One Ticket:"+price);
            System.out.println("Seats Booked:");
            for (int i = 0; i < (totalSeats-1); i++) {
                System.err.print(" "+seats[i]);
                
            }
            System.err.println("Total Seats:"+totalSeats);
            System.err.println("Total Price to Pay:"+sum);
            System.err.println("Discount Applied 15%:"+discAmount);
            System.err.println("Final Price to Pay: "+total);
            System.err.println("Thankyou for Using Our Services!!");
			
		}else {
            System.out.println("The User Booked Transport: Flight Transport Services!");
            System.out.println("Price of One Ticket:"+price);
            System.out.println("Seats Booked:");
            for (int i = 0; i < (totalSeats-1); i++) {
                System.err.print(" "+seats[i]);
                
            }
            System.err.println("Total Seats:"+totalSeats);
            System.err.println("Total Price to Pay: "+total);
            System.err.println("Thankyou for Using Our Services!!");	
		}
    }
}
class TicketBooking {
    public static void main(String[] args) {
        int[] seats=new int[30];
        try (Scanner sc = new Scanner(System.in)) {
            System.err.println("Choose Your Transport!!");
            System.err.println("1.Bus Service-Price:100 ");
            System.err.println("2.Fligth Service-Price:200 ");
            int ch=sc.nextInt();
            switch (ch) {
                case 1 -> {

                    double price=100;
                    int seatNumber;
                    int total=0;
                    System.err.println("Total Seats to book");
                    int totalSeats=sc.nextInt();
                    boolean check=false;
                    for(int i=0;i<=(totalSeats-1);i++){
                        System.err.println("Enter Seat Number:");
                        System.err.println("Total Seats till 30 only!!");
                        System.err.println("Give Seat Number less than 30 or equal to 30!!");
                        
                        seatNumber=sc.nextInt();
                        if (seatNumber==0 || seatNumber>30){
                            System.err.println("Wrong Seat-Number Given (Greater than 30)::");
                            check=true;break;
                        }
                        else{
                            seats[i]=seatNumber;
                            total++;
                        } 
                        
                    }
                    if (check!=true){
                        System.err.println("First Seat Booked by User:");
                    seatNumber=seats[0];
                    
                    BusTicket bs=new BusTicket(price, seatNumber, total,seats);
                    bs.calculateFinalPrice(price, seatNumber, total,seats);
                    }
                    else{
                        System.err.println("Try Again Later!!");break;
                    }
                    
                }
                case 2 -> {
                    System.err.println("Total Seats to book");
                    int totalSeats1=sc.nextInt();
                    double price1=200;
                    int total = 0;
                    int seatNumber;
                    boolean check=false;
                    for(int i=0;i<=(totalSeats1-1);i++){
                        System.err.println("Enter Seat Number:");
                        System.err.println("Total Seats till 30 only!!");
                        System.err.println("Give Seat Number less than 30 or equal to 30!!");
                        seatNumber=sc.nextInt();if (seatNumber==0 || seatNumber>30){
                            System.err.println("Wrong Seat-Number Given (Greater than 30)::");
                            check=true;break;
                        }
                        else{
                            seats[i]=seatNumber;
                            total++;
                        } 
                    }
                    if (check!=true){
                    System.err.println("First Seat Booked by User:");
                    seatNumber = seats[0];
                    FlightTicket ft=new FlightTicket(price1, seatNumber, total,seats);
                    ft.calculateFinalPrice(price1, seatNumber,total,seats);
                    }
                    else{
                        System.err.println("Try Again Later!!");break;

                    }
                }
                default -> { 
                    System.out.println("Wrong Choice For service !! exiting...");
                }
                
                
                
            }
        }
    }
    
}
