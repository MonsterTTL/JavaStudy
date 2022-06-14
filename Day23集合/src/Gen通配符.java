import java.util.ArrayList;
import java.util.List;
//泛型通配符<?>
// 任意类型，若果没有明确，那么就是Object以及任意的Java类
// ? extends E 向下限定，E及其子类
// ? super E 向上限定，E及其超类
public class Gen通配符 {
	public static void main(String[] args) {
		List<?> list = new ArrayList<String>();//当右边的泛型为不确定时，左边可以用?0
	}

}
