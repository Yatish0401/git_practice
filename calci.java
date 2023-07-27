import java.util.Scanner;
interface calci
{
 int getSum(int n1 , int n2);
}

class claciImpl implements calci {
public int getSum(int n1 , int n2)
{
return n1+n2;
}
}
public class calci Driver {
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("enter 2 numbern to find sum");

int n1= s.nextInt();
int n2= s.nextInt();
claciImpl c = new claciImpl();
int sum = c.getSum(n1,n2);
System.out.println(n1+"+"+n2+"="+sum);
}
}
}

