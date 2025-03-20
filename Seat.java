public class Seat{
	int seatno;
	int rowno;
	String type;
	double price;
	boolean isBooked;
	Customer customer;
	Screen screen;
	public Seat(int seatno,int rowno,String type,double price){
		this.seatno=seatno;
		this.rowno=rowno;
		this.type=type;
		this.price=price;
	    isBooked=screen.bookSeat(rowno,seatno,customer);
	}
	public void displaySeat(){
		if(isBooked){
		    System.out.println("Seat Details: ");
			System.out.println("Row number: "+rowno);
			System.out.println("Seat number: "+seatno);
			System.out.println("Seat Type: "+type);
			System.out.println("Price: "+price);
		}
	}
	
	
}