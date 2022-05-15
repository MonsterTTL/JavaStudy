public class Dog {
    String name ;
    int age = 0;
    public static void main(String [] arg)
    {
        Dog one = new Dog();
        one.SetName("走司机");
        one.SetAge(10);
        one.ShowAge(one.GetAge());
        one.ShowName();
        one.SetAge(15);
        one.ShowAge(one.GetAge());
        one.SetName("走司机二号");
        one.ShowName();
    }
    public void SetName(String truename)
    {
        name = truename;

    }
    public void ShowName()
    {
        System.out.println(name);
    }
    public void SetAge(int AGE)
    {
        age = AGE;
    }
    public int GetAge()
    {
        return age;
    }
    public void ShowAge(int temp)
    {
        System.out.println("My age is "+GetAge());
    }
}
