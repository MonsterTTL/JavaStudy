public class IntToString {
    private String cur ;
    private int curr = 0;

    public void setCur(String temp)
    {
        cur = temp;
    }
    public void setCurr(int temp)
    {
        curr = temp;
    }
    public int getCurr()
    {
        return curr;
    }
    public String  getCur()
    {
        return cur;
    }

    public void change(int temp)
    {
        temp = curr;
        while(temp / 10 != 0)
        {
            if(cur == null)
            {
                cur = ""+(temp%10);
            }
            cur = cur + (temp%10);
            temp  /= 10;
        }
        cur += temp;
    }

}
