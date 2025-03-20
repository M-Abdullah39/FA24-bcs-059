public class Cinema{
	String name;
	String location;
	Screen[] screens;
	public Cinema(String name,String location,int totalScreens){
		this.name=name;
		this.location=location;
		screens=new Screen[totalScreens];
	}
	public void displayCinema(){
		System.out.println("Cinema Details: ");
		System.out.println("Name: "+name);
		System.out.println("Location: "+location);
		System.out.println("Total screens: "+screens.length);
	}
	
}