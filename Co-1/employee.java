import java.util.*;
class employee
{
  int i;
  String n;
  long m;
  employee(int id,String name,long mob)
  {
      i = id;
      n = name;
      m = mob;
  }

  void display()
  {
    System.out.println("ID : "+i);
    System.out.println("NAME : "+n);
    System.out.println("MOBILE NUMBER : "+m);
  }

  public static void main(String[] args)
  {
      
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the name : ");
       String name = in.nextLine();
       System.out.println("Enter the Id : ");
       int id = in.nextInt();
     System.out.println("Enter the Mobile Number : ");
      long mob = in.nextLong();
      employee emp = new employee(id,name,mob);
      emp.display();
  }
}