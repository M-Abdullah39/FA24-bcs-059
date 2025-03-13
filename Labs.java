public class Labs{
       int labno;
	   int no_comp;
	   String lab_incharge;  
	   public Labs(int labno, int no_comp, String lab_incharge){
		   this.labno=labno;
		   this.no_comp=no_comp;
		   this.lab_incharge=lab_incharge;
	   }
	   public void displaylinfo(){
		   System.out.println("Lab no: " + labno + " No. of Computers: " + no_comp + " Lab incharge: " + lab_incharge);
	   }


}