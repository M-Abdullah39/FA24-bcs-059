package main;
import util.PasswordValidator;
import users.userManager;
import java.util.Scanner;
import java.io.Console;
public class LoginSystem{

public static void main(String args[]){
   Scanner input=new Scanner(System.in);
   System.out.println("Enter Username: ");
   String username=input.nextLine();
   Console pinput=System.console();
   char[] password=pinput.readPassword("Enter your Password: ");
   userManager obj1=new userManager();
   if(obj1.authenticate(username,password))
       System.out.println("ACCESS GRANTED!!");
   else
       System.out.println("ACCESS DENIED!!");
}
     

}