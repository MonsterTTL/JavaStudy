public class Laucher {
    public static void main(String [] arg)
    {

        IntToString one = new IntToString();
        one.setCurr(11156);
        one.change(one.getCurr());
        System.out.println(one.getCur());
    }
}
