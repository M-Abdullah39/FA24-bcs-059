public class Screen{
	int screenno;
	String movieTitle;
	Seat[][] seats;
	public Screen(int screenno,String movieTitle,int rows, int cols){
		this.screenno=screenno;
		this.movieTitle=movieTitle;
		seats=new Seat[rows][cols];
	}
	public boolean bookSeat(int rows,int cols,Customer customer){
		if(seats[rows][cols]==null)
			return true;
		else
			return false;
	}
	public void displayScreen(){
		System.out.println("Screen Details: ");
		System.out.println("Screen number: "+screenno);
		System.out.println("Movie Title: "+movieTitle);
	}
	
}