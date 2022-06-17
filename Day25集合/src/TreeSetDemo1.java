import java.util.LinkedList;

public class TreeSetDemo1 {
	public static void main(String[] args) {
		 int [] arr = {2,3,5,6,8,10,225};
		 LinkedList<Integer> help = new LinkedList<>();
	        for(int i:arr)
	        {
	            if(i != 0)
	            help.add(i);
	            else
	            {
	                help.add(i);
	                help.add(i);
	            }
	        }
	        int[] ret = new int[help.size()];
	         ret = arr.clone();
	         for (int i : ret) {
				System.out.println(i);
			}
	        
	}

}
