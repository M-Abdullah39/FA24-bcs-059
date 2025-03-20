public class Ticket{
	int ticketid;
	Customer customer;
	int screenno;
	int seatno;
	String movieTitle;
	double price;
	public Ticket(int ticketid,Customer customer,int screenno,int seatno,String movieTitle, double price){
		this.ticketid=ticketid;
		this.customer=customer;
		this.screenno=screenno;
		this.seatno=seatno;
		this.movieTitle=movieTitle;
		this.price=price;
	}
	public void displayTicket(){
		System.out.println("Ticket Details: ");
		System.out.println("Ticket ID: "+ticketid);
		customer.displayCustomer();
		System.out.println("Screen number: "+screenno);
		System.out.println("Seat number: "+seatno);
		System.out.println("Movie Title: "+movieTitle);
		System.out.println("Price: "+price);
	}
}