import java.lang.reflect.Array;

public class Day1test1 {
    public static void main(String[] arg)
    {
       // int cnt = 1;
       // while(cnt <= 100)
       // {
       //     System.out.println("Now I have "+cnt+" Beers");
       //     cnt += 1;
       // }
       // int cnt = 0;
       // float a = 11.5f;
        //double  g = 11.5;
        //int times = 50;
       // byte cc = 60;
       // String[] Arr = {"Hello","How","Are","You"};
       // while(times >= 0) {
        //    cnt = Arr.length;
            //System.out.println(cnt);
        //    int rand1 = (int) (Math.random() * (cnt));
        //    System.out.println(Arr[rand1]);
       //     times--;
       // }
        int test = 0;
        String a = new String("hahh") ;
        String b = "hahh";
        System.out.println(a+"  "+b);
        int[] ss = {1,2,3,4};
        int[] lop = ss;
        System.out.println("Here is "+Array.get(ss,2));
        System.out.println(test);
        for(int i = 0;i < 4;i++)
        {
            System.out.println(ss[i]);

        }
    }

}
