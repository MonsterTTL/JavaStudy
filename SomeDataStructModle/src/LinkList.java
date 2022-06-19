
public class LinkList {
	public static void main(String[] args) {
		Lk one = new Lk();
		one.add(1);
		one.add(2);
		one.add(10);
		Lk.showAll(one);
		Lk.reverse(one);
		Lk.showAll(one);
		int i = one.remove(0);
		Lk.showAll(one);
		System.out.println(i);
		
	}

}

class Lk{
	private int val;
	private Lk next;
	Lk()
	{
		
	}
	Lk(int val)
	{
		this.val = val;
		
	}
	public static void showAll(Lk head)
	{
		
		Lk nHead = head.getNext();
		while(nHead != null)
		{
			System.out.print(nHead.getValue()+" ");
			nHead = nHead.getNext();
		}
		System.out.println();
	}
	public int getValue()
	{
		return val;
	}
	public Lk getNext()
	{
		return next;
	}
	public void setNext(Lk ne)
	{
		next = ne;
	}
	public boolean add(int i)
	{
		Lk head = this;
		Lk ne = new Lk(i);
		while(head.getNext() != null)
		{
			head = head.getNext();
		}
		head.setNext(ne);
		return true;
	}
	public static boolean reverse(Lk head)//·´×ª
	{
		Lk nhead = head.getNext();
		Lk thead = head;
		Lk cur = null;
		while(nhead != null)
		{
			thead = nhead;
			nhead = nhead.getNext();
			thead.setNext(cur);
			cur = thead;
		}
		head.setNext(cur);
		
		return true;
	}
	public int remove(int index)
	{
		Lk head = this;
		for(int i = index;i > 0;i--)
		{
			head = head.getNext();
		}
		int i = head.getNext().getValue();
		head.setNext(head.getNext().getNext());
		return i;
	}
}
