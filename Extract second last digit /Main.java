import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int newnum = num/10;
      int sld = newnum%10;
      
      System.out.println(sld);
	}
}