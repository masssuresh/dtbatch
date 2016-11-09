import java.util.*;
class Greentrends
{
public static void main(String[]args)
{
int shaving=50, shaving_cutting=150 ,cutting=100;
int ch; 
System.out.println("enter the choice");
Scanner s=new Scanner(System.in);
ch=s.nextInt();
switch(ch)
{
case 1: 
System.out.println("rate of shaving " +shaving);
break;
case 2 :
System.out.println("rate of shaving &cutting " +shaving_cutting);
break;
case 3 :
System.out.println("rate of cutting " +cutting);
break;
default:
System.out.println("good bye");
break;
}
}
}