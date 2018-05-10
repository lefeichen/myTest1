package Date;

import java.util.HashSet;
import java.util.Set;

public class Clone_w {
	
	public static void main(String[] args) throws CloneNotSupportedException {
/*		User u1=new User();
		u1.setUsername("03216");
		//System.out.println(1);
		User u2 =(User) u1.clone();
		//System.out.println(2);
	//	System.out.println(u1==u2);
		System.out.println("u2="+u2);
		System.out.println("u2.getClass()="+u2.getClass());
		System.out.println("u2.getClass().getName()="+u2.getClass().getName());
		System.out.println("String.valueOf(u2)="+String.valueOf(u2));
		System.out.println("u2.toString()="+u2.toString());
		System.out.println("Integer.toHexString(u2.hashCode())="+Integer.toHexString(u2.hashCode()));
		System.out.println("u2.hashCode()="+u2.hashCode());
		User u3=new User();
		User u4=new User();
		System.out.println(u3.hashCode());
		System.out.println(u4.hashCode());
		System.out.println(u4==u3);
		System.out.println(u4);
		System.out.println(u3);
		System.out.println(u3.equals(u4));*/
		User u5=new User(1,"张三");
		User u6=new User(1,"张三");
		User u8=u5;
		System.out.println("u8=u5:"+(u8==u5));
		User u7=(User)u5.clone();
		System.out.println((u7==u5)+"=u7=u5");
		System.out.println(u5.hashCode()==u6.hashCode());
		//System.out.println(u6.hashCode());
		System.out.println(u5.equals(u6));
		System.out.println(u5==u6);
		Set<User> s=new HashSet<>();
		s.add(u5);
		s.add(u6);
		System.out.println(s);
		System.out.println(u5.toString()==u6.toString());
		System.out.println(u7.toString()==u6.toString());

	}
}
