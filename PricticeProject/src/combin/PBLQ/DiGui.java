package combin.PBLQ;

public class DiGui {
	public static void main(String[] args) {
		fn(3);
		System.out.println(fn(4));
		
	}
	
	public  static int  fn(int n) {
		if(n==1||n==2) {
			return 1;
		}else {
			return fn(n-1)+fn(n-2);
			
		}
	}
}
