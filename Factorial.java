import java.util.*;
class Factorial
{
public static void main(String[]args)
{
int i,fact=1;
int n;
System.out.println("enter the  number");
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=n;i>=1;i--){
fact=fact*i;
}
System.out.println("the factorial is" +fact);
}
} 