import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int i=0;i<arr_size;i++)
      {
        arr[i] = in.nextInt();
       
    }
      int large =arr[0];
      for(int i=1;i<arr_size;i++)
      {
        if(large < arr[i])
          large = arr[i];
      }
      System.out.println(large);
}
}