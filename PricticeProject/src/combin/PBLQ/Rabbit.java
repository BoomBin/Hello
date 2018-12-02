package combin.PBLQ;
/**
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问每个月的兔子总数为多少？ 
 * @author jiabin
 *
 */
public class Rabbit {
	public static void main(String[] args) {
		System.out.println("第一个月的兔子数为："+1+"对");
		System.out.println("第二个月的兔子数为："+1+"对");
		int fn1=1,fn2=1,f;
		for(int i=3;i<12;i++) {
			/**
			fn3=fn2;
			fn2=fn1+fn2;
			fn1=fn3;
			*/
			f=fn2;
			fn2=fn1+fn2;
			fn1=f;
			System.out.println("第"+i+"个月的兔子对数："+fn2);
		}
	}
	/**
	 * 递归算法
	 */
}
