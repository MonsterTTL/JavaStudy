public class Dog {
    String name;
    public static void main(String [] arg)
    {
        Dog one = new Dog();
        Dog[] arr = new Dog[3];
        //Dog two = null;

        arr[0] = new Dog();
        arr[1] = new Dog();

        arr[0].name = "Geogre";
        arr[1].name = "Pual";

        for(int cnt = 0;cnt < 3; cnt++)
        {
            if(arr[cnt] == null)
            {
                System.out.println("arr" + cnt +" It is not avaliable!");
                continue;
            }

            arr[cnt].Bark();
        }

    }

    public void Bark()
    {
        System.out.println(name + " Says Ruff!");
    }
}
