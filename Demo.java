import java.util.Scanner;
public class Demo{
	public static void main(String args[]){
		Cinema cinema=new Cinema("CUE Cinema","Gulberg Lahore",10);
		cinema.displayCinema();
		Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter Screen number: ");
		int screenno=scanner.nextInt();
		System.out.println("Enter row number for seat: ");
		int rowno=scanner.nextInt();
		System.out.println("Enter seat number in entered row: ");
		int seatno=scanner.nextInt();
		Seat seat=new Seat(seatno,rowno,"Recliner",1000);
		seat.displaySeat();
		Screen screen=new Screen(screenno,"Avengers",rowno,seatno);
		screen.displayScreen();
		System.out.println("Enter your name: ");
		String cname=scanner.nextLine();
		System.out.println("Enter your email address: ");
		String cemail=scanner.nextLine();
		System.out.println("Enter your phone number: ");
		String cphone=scanner.nextLine();
		Customer customer=new Customer(5738,cname,cphone,cemail);
		customer.displayCustomer();
		Ticket ticket=new Ticket(3792,customer,screenno,seatno,"Avengers",1000);
		ticket.displayTicket();
	}
}