public class Departments{
       String name;
	   String HRname;
	   int no_labs;
	   public Departments(String name, String HRname, int no_labs){
		   this.name=name;
		   this.HRname=HRname;
		   this.no_labs=no_labs;
	   }
	   public void displaydinfo(){
		   System.out.println("Department name: " + name + " HR name: " + HRname + " No. of Labs: " + no_labs);
		   
	   }
}