import java.util.*;
class Calculator
{
  public static void main(String[]args)
 {
   int num1, num2, ch,result;
   Scanner s1= new Scanner(System.in);
   System.out.println("Enter first number:");
   num1= s1.nextInt();
    System.out.println("Enter second number:");
   num2= s1.nextInt();
   System.out.println("MENU");
   System.out.println("1.Addition");
   System.out.println("2.Substraction");
   System.out.println("3.Multiplication");
   System.out.println("4.Division");
   System.out.println("Enter your choice:");
   ch=s1.nextInt();
   switch(ch)
{
   case 1:result=num1+num2;
   
     System.out.println(result);
     break;
    
    case 2:result=num1-num2;
   
     System.out.println(result);
     break;
    
     case 3:result=num1*num2;
   
     System.out.println(result);
     break;
    
      case 4:result=num1/num2;
    
     System.out.println(result);
     break;
    
    default:
    System.out.println("Wrong choice");
   }
 }
}
    