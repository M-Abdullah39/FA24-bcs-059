public class Campus{
      String name;
      String vc;
      String address;
      int no_of_depart;
      public Campus(String vc, String address, int no_of_depart)
{
         this.vc=vc;
         this.address=address;
         this.no_of_depart=no_of_depart;
}
      public void displaycinfo(){
         System.out.println("Name: " + name + "Address: " + address + "Name of VC: " + vc + "No. of Departments: " +no_of_depart);

} 

     
}