package Date;

import java.io.UnsupportedEncodingException;

import org.apache.commons.lang3.StringUtils;

public class Array {
	
	public int run(){
		return 1;
	}
	 int run(int a){
		return a;
	}
	protected int run(int a,int b){
		return a=b;
	}
	public void run(String a){
		int b=Integer.parseInt(a);
		System.out.println(b);
	}
	  
    public static void change(int[] counts) {  
   
    /*    counts[0] = 6;  
        System.out.println(counts[0]); */ 
    }  
  
    public static void main(String[] args) throws UnsupportedEncodingException {  
  /*      int[] count = { 1, 2, 3, 4, 5 };  
        System.out.println(count);
        String join1 = StringUtils.join(count);
        System.out.println(join1);
        change(count); 
        System.out.println(count[0]);
        System.out.println(count);
        System.out.println(String.valueOf(count));
        join1.getBytes("utf-8");*/
     	Array a=new Array();
    	System.out.println(a.run());
    	System.out.println(a.run(1));
    	System.out.println(a.run(1,2));
    //	System.out.print(a.run("12"));
    	a.run("12");
        
    }  
}   
