//WAP to read user name through scanner class and display it.
import java.util.*;
class user
{
public static void main(String...args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the user name: ");
String u=sc.nextLine();
System.out.println("The entered user name is: "+u);
}
}