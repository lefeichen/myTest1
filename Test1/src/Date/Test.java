package Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class Test

{
	public static void main(String[] args) {
		a();
	}
public void change(String str, char ch[])
{
str += "test ok";
ch[0] = 'g';
System.out.println(str);

}
public static void a(){
	System.out.println(new SimpleDateFormat("yyyy-MM-dd HH").format(new Date()));
}

public static void change1()
{
	Vector a=new Vector(5);
	a.addElement(1);
	a.addElement("b");
	a.addElement('a');
	a.addElement("b");
	a.addElement('a');
	a.remove(1);
	System.out.println(a+""+a.size());
}
}
