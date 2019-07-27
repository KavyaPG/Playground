import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      callprime(num);
      
	}
  public static void callprime(int num)
  {
    
    for(int i=2;i<=num;i++)
    {
      boolean isPrime = true;
      for(int j=2;j<=i/2;j++)
      {
        if(i%j == 0)
        {
          isPrime = false;
          break;
        }
    }
      if(isPrime == true)
        System.out.println(i);
      
}
  }
}