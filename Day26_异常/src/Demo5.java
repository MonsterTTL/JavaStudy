//自定义异常
//只是为了通过名字区分到底是什么异常
//有针对的解决办法
//
//可以继承Exception 也可以继承RuntimeException
public class Demo5 {
	public static void main(String[] args) {
		try {
			ded(10,0);
		} catch (ZidingyiException e) {
			System.out.println(e);
		}
		
	}
	public static  int ded(int a,int b)throws ZidingyiException
	{
		if(b == 0)
		{
			throw new ZidingyiException("除数为零");
		}
		return (a/b);
	}

}


class ZidingyiException extends Exception {

	public ZidingyiException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ZidingyiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ZidingyiException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ZidingyiException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ZidingyiException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	
}