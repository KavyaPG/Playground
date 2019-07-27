import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int digit1,digit2;
      int temp = num;
        digit1 = num /10;
        digit2 = num % 10;
        int sum = digit1 +digit2;
      System.out.println(sum);
      
	}
}