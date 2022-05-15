public class Dog {
    String name;
    public static void main(String [] arg)
    {

        Dog[] arr = new Dog[3];
        //Dog two = null;

        arr[0] = new Dog();
        arr[1] = new Dog();
        String a = new String("Pual");
        String b = new String("Pual");
        String c = "Pual"+'d';
        String d = "Pual";
        arr[0].setName(a);
        arr[1].setName(b);
        if(arr[1].name == arr[0].name)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        arr[0].setName(c);
        arr[1].setName(d);
        if(arr[1].name == arr[0].name)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }


        for(int cnt = 0;cnt < 3; cnt++)
        {
            if(arr[cnt] == null)
            {
                System.out.println("arr" + cnt +" It is not avaliable!");
                continue;
            }
            System.out.println(cnt);
            arr[cnt].Bark();
        }

    }

    public void Bark()
    {
        System.out.println(name + " Says Ruff!");
    }

    public void setName(String newname)
    {
          name = newname;
    }
}
