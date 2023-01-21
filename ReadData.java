import java.io.*;
public class ReadData {
   public static void main(String args[]) throws IOException {
      BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter your name: ");
      String name = reader.readLine();
	System.out.println("Name: "+name);
      System.out.println("Enter your age: ");
      int age = Integer.parseInt(reader.readLine());
      System.out.println("Age: "+age);
      System.out.println("Enter your Id: ");
      int id = Integer.parseInt(reader.readLine());
      System.out.println("ID : "+id);
 
  }
}