import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        for(int i=0;i<arr_size;i++)
        {
          arr[i] = in.nextInt();
    }
      int s1 = in.nextInt();
      int s2 = in.nextInt();
      //int flag =0;
      int idx1=-1,idx2=-1;
      for(int i=0;i<arr_size;i++)
      {
        if(arr[i]	== s1)
        {
          idx1 = i;
          
        }
        if(arr[i]==s2)
        {
          idx2 = i;
         
        }
      }
      
        System.out.println(idx1);
      
        System.out.println(idx2);
     
}
}