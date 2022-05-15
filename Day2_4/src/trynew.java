

public class trynew {
    public static void main(String [] arg)
    {
         int arr[] = new int[10];
         int target[] = {1,2,3,4,5,6,7,8,9,0};
         String num = "155565";
         int CC = Integer.parseInt(num);
         System.out.println(CC);
         int i = 0;

         for(int test:target)
         {
             arr[i] = test;
             i++;
         }
         String tr;
         tr = arr.toString();
         System.out.println(tr);
         for(int test:arr)
         {
             System.out.print(test);
         }
     }




 }
