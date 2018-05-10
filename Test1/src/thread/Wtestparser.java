package thread;

import java.lang.reflect.Method;

public class Wtestparser {
	
		public static void main(String[] args) throws Exception {
			System.out.println(args[0]+"~"+args[1]);
			
			Class<?> clazz = Class.forName(args[0]);
			Method method = clazz.getMethod(args[1]);
			boolean b = method.isAnnotationPresent(Wtest.class);
			if(b){
				method.invoke(clazz.newInstance());
			}else{
				System.out.println("没有注解Wtest不能执行该方法");
			}
			
			
			
		}
	
}
