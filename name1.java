//wap to read your name as a command line argument and display on it
class name1
{
public static void main(String...args) {
System.out.print("Your name is: "+args[0]+"\nRoll no.: "+args[1]+"\nFees: "+args[2]+"/-\n");
int x=args[0].length();
System.out.print("The length of your name is: "+x);
}
}