
public interface bark {
	public String getWolf();
	public static void Bark(Object a)
	{
		String use = ((bark) a).getWolf();
		System.out.println(use);
	}

}
