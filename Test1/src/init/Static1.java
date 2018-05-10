package init;

public class Static1 {
	 static int i=1;
	static{
		i+=2;
		System.out.println("static1~i="+i);
	}
	public static void add(){
		i+=4;
		System.out.println("staticAdd~i="+i);
	}
	static{
		i+=3;
		System.out.println("static2~i="+i);
	}
}
