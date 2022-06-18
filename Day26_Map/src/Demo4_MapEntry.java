
public class Demo4_MapEntry {
	public static void main(String[] args) {
		
	}

}

interface Inter{
	interface Inter2{//内部接口
		public void show();
	}
}

class Demo implements Inter.Inter2{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}
