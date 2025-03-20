public class Customer{
	int customerid;
	String name;
	String phno;
	String email;
	public Customer(int customerid,String name,String phno,String email){
		this.customerid=customerid;
		this.name=name;
		this.phno=phno;
		this.email=email;
	}
	public void displayCustomer(){
		System.out.println("Customer Details: ");
		System.out.println("Customer ID: "+customerid);
		System.out.println("Name: "+name);
		System.out.println("Phone number: "+phno);
		System.out.println("Email address: "+email);
	}
	
	
}