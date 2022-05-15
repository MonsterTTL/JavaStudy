public class Dog {
    public int a = 0;

    public void bark()
    {
        System.out.println("汪汪！！");
    }
    public void wava()
    {
        System.out.println("Dog is waving now!");
    }
    public int ShowA()
    {
        System.out.println("My a is "+a);
        return a;
    }
    public void ChangeA(int change)
    {
        a = change;
    }
}
