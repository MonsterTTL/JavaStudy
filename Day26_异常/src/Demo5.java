//�Զ����쳣
//ֻ��Ϊ��ͨ���������ֵ�����ʲô�쳣
//����ԵĽ���취
//
//���Լ̳�Exception Ҳ���Լ̳�RuntimeException
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
			throw new ZidingyiException("����Ϊ��");
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