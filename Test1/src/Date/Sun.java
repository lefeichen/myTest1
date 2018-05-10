package Date;

public class Sun extends Father {
	public static Object add(int a){
		System.out.println("子类的add方法");
		return 0;
	}
	public   Sun up(Sun s){
		System.out.println("子类的up方法");
		return s;
	}
}
