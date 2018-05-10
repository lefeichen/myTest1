package Date;

public class Father {
	protected static Object add(){
		System.out.println("Father的add方法");
		return 1;
	}
	protected Father up(Sun s){
		System.out.println("Father的up方法");
		return s;
	}
}	
