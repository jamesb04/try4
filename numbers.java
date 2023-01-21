//TO READ DIFFERENT TYPES OF NUMBER AND DISPLAY IT USING SCANNER CLASS
import java.util.*;
class numbers
{
public static void main(String...args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the numebrs");
System.out.println("Enter the int number");
int n=sc.nextInt();
System.out.println("Enter the byte number");
byte b=sc.nextByte();
System.out.println("Enter the short number");
short s=sc.nextShort();
System.out.println("Enter the long number");
long l=sc.nextLong();
System.out.println("Enter the double number");
double d=sc.nextDouble();
System.out.println("Enter the float number");
float f=sc.nextFloat();
System.out.println("Enter True or False");
boolean bl=sc.nextBoolean();
System.out.println("Enter the character");
char ch=sc.next().charAt(0);
System.out.println("Entered numbers are: "+n+" "+b+" "+s+" "+l+" "+d+" "+f+" "+bl+" "+ch);
}
}