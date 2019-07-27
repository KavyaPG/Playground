import java.util.*;
public class Main{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int exp = in.nextInt();
    int power = powcall(base,exp);
    System.out.println(power);
  }
  public static int powcall(int base,int exp)
  {
    int po = 1;
    if(exp ==0)
        po = 1;
      else if(exp ==1)
        po = base;
      else
      {
    for(int i=0;i<exp;i++)
    {
      
      po = po*base;
    }
      }
    return po;
  }
}
    