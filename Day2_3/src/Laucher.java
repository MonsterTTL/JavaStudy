public class Laucher {
    public static void main(String [] arg)
    {
        int a = (int)Math.pow(2,3);
        System.out.println(a);
        IntToString one = new IntToString();
        one.setCurr(11156);
        one.change(one.getCurr());
        int b = Integer.parseInt("11156");
        System.out.println(b);
        System.out.println(one.getCur());
    }
}
