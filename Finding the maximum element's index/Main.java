import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    int i;
    Scanner sc = new Scanner(System.in);
    int arr_size = sc.nextInt();
    int arr[] = new int[arr_size];
    for(i =0;i<arr_size;i++)
    {
      arr[i] = sc.nextInt();
  }int l1 =0;
    int large = arr[0];
    for(i = 0;i<arr_size;i++)
    {
      if(arr[i] > large)
      {
        large = arr[i];
         l1 = i;
      }
    }
    System.out.println(l1);
        
  }
}