public class Main{
   public static void main(String args[]){
       Campus campus=new Campus("Shahid Bhatti","Defence Road",5);
       campus.name="COMSATS Lahore Campus";
	   campus.displaycinfo();
	   
	   Departments[] department=new Departments[campus.no_of_depart];
	   department[0]=new Departments("Maths Department","Shahid Jutt",10);
	   department[1]=new Departments("Maths Department","Shahid Jutt",10);
	   department[2]=new Departments("CS Department","Bilal Ramzan",10);
	   department[3]=new Departments("Physics Department","Naveed Aslam",10);
	   department[4]=new Departments("BBA Department","Saad Lodhi",10);
	   
	   for(int i=0;i<department.length;i++)
	   {
		   department[i].displaydinfo();
		   Labs[] lab=new Labs[department[i].no_labs];
		   for(int j=0;j<lab.length;j++)
		   {
			   lab[j]=new Labs(j+1,10,department[i].HRname);
			   lab[j].displaylinfo();
		   }
	   }
	   
	   /*for(int j=0;j)
	       Labs[] labd1=new Labs[]*/


}


}